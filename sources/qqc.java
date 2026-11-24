// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class qqc extends FrameLayout implements tjb {
    public int a;
    public boolean b;
    public final pqc[] c;
    public byte d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable w;

    public qqc(Context context, int i) {
        super(context);
        this.b = true;
        this.d = (byte) 3;
        this.c = new pqc[i];
        final int i2 = 0;
        while (true) {
            pqc[] pqcVarArr = this.c;
            if (i2 >= pqcVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.w = b00.d(context, R.drawable.background_selected);
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(bkb.w0(null, bkb.Bi, false));
                return;
            }
            final pqc pqcVar = new pqc(this, context);
            pqcVarArr[i2] = pqcVar;
            pqcVar.setClipToOutline(true);
            addView(pqcVar);
            pqcVar.setOnClickListener(new wg((Object) this, (Object) pqcVar, i2, (byte) 21));
            pqcVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: oqc
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i3 = i2;
                    return qqc.this.b(pqcVar.h, i3);
                }
            });
            i2++;
        }
    }

    public abstract void a(int i, Object obj);

    public boolean b(Object obj, int i) {
        return false;
    }

    public final void c(int i, boolean z, boolean z2) {
        pqc pqcVar = this.c[i];
        kb0 kb0Var = pqcVar.a;
        CheckBox checkBox = pqcVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z, z2);
        AnimatorSet animatorSet = pqcVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            pqcVar.f = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            pqcVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(kb0Var, "scaleX", z ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(kb0Var, "scaleY", z ? 0.8875f : 1.0f));
            pqcVar.f.setDuration(200L);
            pqcVar.f.addListener(new pu9((byte) 17, pqcVar, z));
            pqcVar.f.start();
        } else {
            kb0Var.setScaleX(z ? 0.8875f : 1.0f);
            kb0Var.setScaleY(z ? 0.8875f : 1.0f);
        }
        pqcVar.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        this.d = i;
        this.e = z;
        this.f = z2;
        int i2 = 0;
        while (true) {
            pqc[] pqcVarArr = this.c;
            if (i2 >= pqcVarArr.length) {
                return;
            }
            ydc ydcVar = null;
            if ((z || z2) && (i2 == 0 || i2 == i - 1)) {
                pqc pqcVar = pqcVarArr[i2];
                int L = gl.L(16.0f);
                boolean z5 = i2 == 0;
                boolean z6 = i2 == i + (-1);
                xi xiVar = zdc.a;
                if ((z5 || z6) && (z || z2)) {
                    z3 = z;
                    z4 = z2;
                    ydcVar = new ydc(L, z5, z3, z6, z4);
                } else {
                    z3 = z;
                    z4 = z2;
                }
                pqcVar.setOutlineProvider(ydcVar);
            } else {
                pqcVarArr[i2].setOutlineProvider(null);
                z3 = z;
                z4 = z2;
            }
            pqcVarArr[i2].setVisibility(i2 < i ? 0 : 8);
            pqcVarArr[i2].clearAnimation();
            i2++;
            z = z3;
            z2 = z4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Object obj, int i, int i2, Object obj2) {
        this.h = i;
        pqc[] pqcVarArr = this.c;
        if (obj == null) {
            pqcVarArr[i2].setVisibility(8);
            pqcVarArr[i2].clearAnimation();
        } else {
            pqcVarArr[i2].setVisibility(0);
            pqcVarArr[i2].a(obj, obj2);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        for (int i = 0; i < this.d; i++) {
            this.c[i].invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d == 1) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int L = gl.L(12.0f);
        int L2 = this.e ? gl.L(12.0f) : 0;
        for (int i5 = 0; i5 < this.d; i5++) {
            pqc[] pqcVarArr = this.c;
            int measuredWidth = pqcVarArr[i5].getMeasuredWidth();
            pqc pqcVar = pqcVarArr[i5];
            pqcVar.layout(L, L2, L + measuredWidth, pqcVar.getMeasuredHeight() + L2);
            L = de9.w(3.0f, measuredWidth, L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), ug8.E(3.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, gl.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int L = size - gl.L(oo1.h(this.d, 1, 3, 24));
        int i4 = L / this.d;
        boolean z = this.h;
        int L2 = (z == 0 || z == 2 || z == 3) ? gl.L(180.0f) : i4;
        setMeasuredDimension(size, gl.L(this.f ? 12.0f : 3.0f) + (this.e ? gl.L(12.0f) : 0) + L2);
        while (true) {
            byte b = this.d;
            if (i3 >= b) {
                return;
            }
            this.c[i3].measure(View.MeasureSpec.makeMeasureSpec(i3 == b + (-1) ? L : i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30));
            L -= i4;
            i3++;
        }
    }

    public void setSize(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.s.setColor(bkb.w0(null, bkb.Bi, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
