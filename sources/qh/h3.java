package qh;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class h3 {
    public final View a;
    public View b;
    public final Utilities.Callback c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final f3 i;
    public final cf.d j;
    public int k;
    public int l;

    public h3(View view, boolean z4, Utilities.Callback callback) {
        f3 f3Var = new f3(this, 0);
        this.i = f3Var;
        cf.d dVar = new cf.d(this, 1);
        this.j = dVar;
        this.a = view;
        this.c = callback;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
            view.addOnLayoutChangeListener(f3Var);
        }
        view.addOnAttachStateChangeListener(new g3(this, z4, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l < AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                return;
            } else {
                this.e = false;
            }
        }
        Utilities.Callback callback = this.c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z4) {
        this.d = z4;
        d();
    }

    public final boolean c() {
        return this.l > AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight || this.e;
    }

    public final void d() {
        if (this.d) {
            return;
        }
        boolean z4 = this.f;
        View view = this.a;
        if (z4) {
            View view2 = this.b;
            if (view2 != null) {
                view = view2;
            }
            r0.m1 f10 = r0.j0.f(view);
            this.l = f10 != null ? f10.a.f(8).d : 0;
        } else {
            Rect rect = this.h;
            view.getWindowVisibleDisplayFrame(rect);
            View view3 = this.b;
            if (view3 != null) {
                view = view3;
            }
            this.l = view.getHeight() - rect.bottom;
        }
        if (this.g) {
            this.l = Math.max(0, this.l - AndroidUtilities.navigationBarHeight);
        }
        int i10 = this.k;
        int i11 = this.l;
        boolean z10 = i10 != i11;
        this.k = i11;
        if (z10) {
            a();
        }
    }
}
