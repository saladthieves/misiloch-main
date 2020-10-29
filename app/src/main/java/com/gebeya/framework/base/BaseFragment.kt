package com.gebeya.framework.base

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gebeya.framework.util.logD
import com.gebeya.framework.util.logE

/**
 * This class acts as the base Fragment for all our other Fragment classes.
 * It contains common functionality across all Fragments, such as logging of
 * the major Fragment lifecycle methods, and moves the root View outside of the onCreateView()
 * method for easier access.
 */
open class BaseFragment : Fragment() {

    /**
     * Contains the Fragment's View, inflated from the overridden onCreateView() callback.
     */
    protected lateinit var root: View

    /**
     * Helper function to inflate the given layout [layoutId] resource ID and automatically assign
     * the inflated [View] object to the [root].
     *
     * @param layoutId layout resource ID to inflate from.
     * @param container [ViewGroup] container to attach to.
     */
    protected fun inflate(layoutId: Int, container: ViewGroup) {
        root = layoutInflater.inflate(layoutId, container, false)
    }

    /**
     * Called when the Fragment has just been attached to the Activity. This call is invoked right
     * after the Activity's onCreate() method has been invoked and before the Fragment's onCreate()
     * method is invoked.
     *
     * @param context Context to which the Fragment has been attached to (such as the Activity).
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
        d("< ---------- onAttach(Context) ---------- >")
    }

    /**
     * Invoked when the Fragment is initialized for the first time. This call is not invoked when
     * the Fragment instance is created via the constructor, but when it is being created for the
     * first time, either from a FragmentTransaction or from the <fragment /> tag.
     *
     * @param savedInstanceState State information regarding the Fragment.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        d("< ---------- onCreate(Bundle?) ---------- >")
    }

    /**
     * Invoked when the Fragment is about to become visible to the screen.
     */
    override fun onStart() {
        super.onStart()
        d("< ---------- onStart() ---------- >")
    }

    /**
     * last call when the Fragment is now visible on the screen and the user can now interact with
     * it.
     */
    override fun onResume() {
        super.onResume()
        d("< ---------- onResume() ---------- >")
    }

    /**
     * Invoked when the Fragment is about to go into the background.
     */
    override fun onPause() {
        super.onPause()
        d("< ---------- onPause() ---------- >")
    }

    /**
     * Invoked when the Fragment is now in the background and its UI no longer visible to the user
     * on the screen, either because it is being replaced, or the Activity is moving into the
     * background.
     */
    override fun onStop() {
        super.onStop()
        d("< ---------- onStop() ---------- >")
    }

    /**
     * Invoked by the system when the Fragment is about to be killed/removed from memory, either
     * because it is being replaced or its hosting Activity is being killed.
     */
    override fun onDestroy() {
        super.onDestroy()
        d("< ---------- onDestroy() ---------- >")
    }

    /**
     * Invoked when the the Fragment is being detached from the Activity host, such as during the
     * remove() transaction or replace() transaction. Invoked after the onDestroy() callback.
     */
    override fun onDetach() {
        super.onDetach()
        d("< ---------- onDetach() ---------- >")
    }

    protected fun d(message: String) {
        logD(this, message)
    }

    protected fun e(message: String) {
        logE(this, message)
    }
}