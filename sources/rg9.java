// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rg9 extends mg9 {
    public final qh9 X;
    public final qh9 Y;
    public final boolean Z;
    public final pib[] a0;

    public rg9(rh9 rh9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(rh9Var, rect, i);
        qh9 qh9Var = !TextUtils.isEmpty(spannableStringBuilder) ? new qh9(rh9Var, spannableStringBuilder, this.c) : null;
        this.X = qh9Var;
        qh9 qh9Var2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new qh9(rh9Var, spannableStringBuilder2, this.c);
        this.Y = qh9Var2;
        this.Z = rh9Var.H();
        ArrayList arrayList = new ArrayList(2);
        if (qh9Var != null) {
            arrayList.add(qh9Var);
        }
        if (qh9Var2 != null) {
            arrayList.add(qh9Var2);
        }
        this.a0 = (pib[]) arrayList.toArray(new pib[0]);
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        int i = rect.top;
        qh9 qh9Var = this.X;
        int j0 = j0() + (qh9Var != null ? qh9Var.b.getHeight() : 0) + i;
        qh9 qh9Var2 = this.Y;
        return j0 + (qh9Var2 != null ? qh9Var2.b.getHeight() : 0) + rect.bottom;
    }

    @Override // mg9
    public final int J() {
        int i;
        int i2;
        Rect rect = this.b;
        qh9 qh9Var = this.Y;
        if (qh9Var != null) {
            i = qh9Var.q() + rect.left;
            i2 = rect.right;
        } else {
            i = rect.left;
            qh9 qh9Var2 = this.X;
            if (qh9Var2 != null) {
                return qh9Var2.q() + i + rect.right;
            }
            i2 = rect.right;
        }
        return i + i2;
    }

    @Override // mg9
    public final int K() {
        qh9 qh9Var = this.X;
        int max = qh9Var != null ? Math.max(0, qh9Var.r()) : 0;
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            max = Math.max(max, qh9Var2.r());
        }
        Rect rect = this.b;
        return rect.left + max + rect.right;
    }

    @Override // mg9
    public final pib[] L() {
        return this.a0;
    }

    @Override // mg9
    public final void T() {
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            qh9Var.i(this.W);
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            qh9Var2.i(this.W);
        }
    }

    @Override // mg9
    public final void V() {
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            qh9Var.f(this.W);
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            qh9Var2.f(this.W);
        }
    }

    @Override // mg9
    public final void W(Canvas canvas) {
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            qh9Var.d(canvas, qh9Var.T);
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            canvas.save();
            canvas.translate(i0(), j0() + (qh9Var != null ? qh9Var.b.getHeight() : 0));
            qh9Var2.d(canvas, qh9Var2.T);
            canvas.restore();
        }
    }

    @Override // mg9
    public final boolean Y(MotionEvent motionEvent) {
        qh9 qh9Var = this.X;
        int height = qh9Var != null ? qh9Var.b.getHeight() : 0;
        int j0 = j0();
        float y = motionEvent.getY();
        int i = this.b.top;
        float f = y - i;
        if (qh9Var != null && f >= 0.0f && f < height) {
            motionEvent.offsetLocation(0.0f, -i);
            boolean t = qh9Var.t(motionEvent);
            motionEvent.offsetLocation(0.0f, r5.top);
            return t;
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 == null || f < height + j0) {
            return false;
        }
        int i0 = i0();
        motionEvent.offsetLocation(-i0, -r6);
        boolean t2 = qh9Var2.t(motionEvent);
        motionEvent.offsetLocation(i0, i + height + j0);
        return t2;
    }

    @Override // mg9
    public final void Z(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            qh9Var.c = i - qh9Var.f;
            qh9Var.d = i2;
            qh9Var.e = i3;
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            qh9Var2.c = (i0() + i) - qh9Var2.f;
            qh9Var2.d = j0() + (qh9Var != null ? qh9Var.b.getHeight() : 0) + i2;
            qh9Var2.e = i3;
        }
    }

    public final int i0() {
        qh9 qh9Var = this.Y;
        if (qh9Var == null || !this.Z) {
            return 0;
        }
        int i = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i - rect.left) - rect.right) - qh9Var.r());
    }

    public final int j0() {
        if (this.X == null || this.Y == null) {
            return 0;
        }
        return gl.L(4.0f);
    }

    @Override // mg9
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        mg9.m(spannableStringBuilder, this.X, null);
        qh9 qh9Var = this.Y;
        if (qh9Var == null || (staticLayout = qh9Var.b) == null || TextUtils.isEmpty(staticLayout.getText())) {
            return;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(staticLayout.getText());
    }

    @Override // mg9
    public final boolean v() {
        return false;
    }
}
