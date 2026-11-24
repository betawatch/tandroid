// default package

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class y06 {
    protected final c16 mLifecycleFragment;

    public y06(c16 c16Var) {
        this.mLifecycleFragment = c16Var;
    }

    public static c16 getFragment(x06 x06Var) {
        m4d m4dVar;
        mnd mndVar;
        Activity activity = x06Var.a;
        if (!(activity instanceof en4)) {
            WeakHashMap weakHashMap = m4d.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (m4dVar = (m4d) weakReference.get()) != null) {
                return m4dVar;
            }
            try {
                m4d m4dVar2 = (m4d) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (m4dVar2 == null || m4dVar2.isRemoving()) {
                    m4dVar2 = new m4d();
                    activity.getFragmentManager().beginTransaction().add(m4dVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(m4dVar2));
                return m4dVar2;
            } catch (ClassCastException e) {
                k93.h("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
                return null;
            }
        }
        en4 en4Var = (en4) activity;
        WeakHashMap weakHashMap2 = mnd.m0;
        ho4 u = en4Var.u();
        WeakHashMap weakHashMap3 = mnd.m0;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(en4Var);
        if (weakReference2 != null && (mndVar = (mnd) weakReference2.get()) != null) {
            return mndVar;
        }
        try {
            mnd mndVar2 = (mnd) u.D("SLifecycleFragmentImpl");
            if (mndVar2 == null || mndVar2.x) {
                mndVar2 = new mnd();
                id0 id0Var = new id0(u);
                id0Var.f(0, mndVar2, "SLifecycleFragmentImpl");
                id0Var.e(true, true);
            }
            weakHashMap3.put(en4Var, new WeakReference(mndVar2));
            return mndVar2;
        } catch (ClassCastException e2) {
            k93.h("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
            return null;
        }
    }

    public Activity getActivity() {
        Activity e = this.mLifecycleFragment.e();
        fre.h(e);
        return e;
    }

    public abstract void onStop();

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public static c16 getFragment(Activity activity) {
        return getFragment(new x06(activity));
    }

    public static c16 getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
