package pw.josc.lodacy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;

/** Task progress handling for lazy people. */
@SuppressWarnings("unused") public class Lodacy {
    private Long duration;
    private View container;
    private View progress;

    /** Initialize Lodacy. */
    public Lodacy(Context context) {
        this.duration = (long) context.getResources().getInteger(android.R.integer.config_longAnimTime);
    }

    /** Set a container to handle. */
    public Lodacy setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /** Set a container to handle. */
    public Lodacy setContainer(View container) {
        this.container = container;
        return this;
    }

    /** Set a ProgressBar to use. */
    public Lodacy setProgress(View progress) {
        this.progress = progress;
        return this;
    }

    /** Hides container and shows ProgressBar. */
    public void show() {
        container.setVisibility(View.GONE);
        container.animate().setDuration(duration).alpha(0F).setListener(new AnimatorListenerAdapter() {
            @Override public void onAnimationEnd(Animator animation) {
                container.setVisibility(View.GONE);
            }
        });
        progress.setVisibility(View.VISIBLE);
        container.animate().setDuration(duration).alpha(1F).setListener(new AnimatorListenerAdapter() {
            @Override public void onAnimationEnd(Animator animation) {
                progress.setVisibility(View.VISIBLE);
            }
        });
    }

    /** Hides ProgressBar and shows container. */
    public void hide() {
        container.setVisibility(View.VISIBLE);
        container.animate().setDuration(duration).alpha(0F).setListener(new AnimatorListenerAdapter() {
            @Override public void onAnimationEnd(Animator animation) {
                container.setVisibility(View.VISIBLE);
            }
        });
        progress.setVisibility(View.GONE);
        container.animate().setDuration(duration).alpha(1F).setListener(new AnimatorListenerAdapter() {
            @Override public void onAnimationEnd(Animator animation) {
                progress.setVisibility(View.GONE);
            }
        });
    }
}
