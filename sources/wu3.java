// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wu3 extends qu3 {
    public Drawable e2;
    public final /* synthetic */ int f2;
    public final /* synthetic */ cv3 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu3(cv3 cv3Var, Context context, ylb ylbVar, int i) {
        super(context, ylbVar);
        this.g2 = cv3Var;
        this.f2 = i;
        this.e2 = null;
    }

    @Override // qu3
    public final void G(int i, int i2) {
        this.g2.q(i, i2);
    }

    @Override // vu3
    public final int e() {
        return this.g2.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final int getActionModeStyle() {
        int i = this.f2;
        if (i == 2 || i == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        cv3 cv3Var = this.g2;
        if (cv3Var.a()) {
            yv1.E6(menu, null, cv3Var.M == 3, true, true, true);
        } else {
            cv3Var.i(actionMode, menu);
        }
    }

    @Override // vu3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        cv3 cv3Var = this.g2;
        n99 n99Var = cv3Var.c;
        if (n99Var != null) {
            boolean z = false;
            boolean z2 = i2 != i;
            if (cv3Var.a() && z2) {
                p0f.b();
                z = true;
            }
            if (cv3Var.n != z) {
                cv3Var.n = z;
                if (z) {
                    this.e2 = n99Var.d;
                    n99Var.a(R.drawable.msg_edit, true);
                } else {
                    n99Var.b(this.e2, true);
                    this.e2 = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xu3 xu3Var;
        cv3 cv3Var = this.g2;
        if (cv3Var.e && motionEvent.getAction() == 0) {
            cv3Var.u();
            if (!cv3Var.y || (xu3Var = cv3Var.d) == null) {
                cv3Var.x(gm.D ? 0 : 2);
            } else {
                xu3Var.r(false);
                cv3Var.y = false;
                cv3Var.k(true);
                gm.E3(this);
            }
            cv3Var.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!gm.E3(this)) {
                clearFocus();
                requestFocus();
            }
            if (!isFocused) {
                setSelection(getText().length());
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            fc4.g(e, true);
            return false;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.g2.t(i2)) {
            super.scrollTo(i, i2);
        }
    }
}
