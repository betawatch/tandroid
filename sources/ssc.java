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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ssc extends FrameLayout implements vlb {
    public int a;
    public boolean b;
    public final rsc[] c;
    public byte d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable w;

    public ssc(Context context, int i) {
        super(context);
        this.b = true;
        this.d = (byte) 3;
        this.c = new rsc[i];
        final int i2 = 0;
        while (true) {
            rsc[] rscVarArr = this.c;
            if (i2 >= rscVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.w = b10.d(context, R.drawable.background_selected);
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(cmb.w0(null, cmb.Bi, false));
                return;
            }
            final rsc rscVar = new rsc(this, context);
            rscVarArr[i2] = rscVar;
            rscVar.setClipToOutline(true);
            addView(rscVar);
            rscVar.setOnClickListener(new wh((Object) this, (Object) rscVar, i2, (byte) 21));
            rscVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: qsc
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i3 = i2;
                    return ssc.this.b(rscVar.h, i3);
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
        rsc rscVar = this.c[i];
        kc0 kc0Var = rscVar.a;
        CheckBox checkBox = rscVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z, z2);
        AnimatorSet animatorSet = rscVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            rscVar.f = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            rscVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(kc0Var, "scaleX", z ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(kc0Var, "scaleY", z ? 0.8875f : 1.0f));
            rscVar.f.setDuration(200L);
            rscVar.f.addListener(new sw9((byte) 17, rscVar, z));
            rscVar.f.start();
        } else {
            kc0Var.setScaleX(z ? 0.8875f : 1.0f);
            kc0Var.setScaleY(z ? 0.8875f : 1.0f);
        }
        rscVar.invalidate();
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
            rsc[] rscVarArr = this.c;
            if (i2 >= rscVarArr.length) {
                return;
            }
            zfc zfcVar = null;
            if ((z || z2) && (i2 == 0 || i2 == i - 1)) {
                rsc rscVar = rscVarArr[i2];
                int L = gm.L(16.0f);
                boolean z5 = i2 == 0;
                boolean z6 = i2 == i + (-1);
                xj xjVar = agc.a;
                if ((z5 || z6) && (z || z2)) {
                    z3 = z;
                    z4 = z2;
                    zfcVar = new zfc(L, z5, z3, z6, z4);
                } else {
                    z3 = z;
                    z4 = z2;
                }
                rscVar.setOutlineProvider(zfcVar);
            } else {
                rscVarArr[i2].setOutlineProvider(null);
                z3 = z;
                z4 = z2;
            }
            rscVarArr[i2].setVisibility(i2 < i ? 0 : 8);
            rscVarArr[i2].clearAnimation();
            i2++;
            z = z3;
            z2 = z4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Object obj, int i, int i2, Object obj2) {
        this.h = i;
        rsc[] rscVarArr = this.c;
        if (obj == null) {
            rscVarArr[i2].setVisibility(8);
            rscVarArr[i2].clearAnimation();
        } else {
            rscVarArr[i2].setVisibility(0);
            rscVarArr[i2].a(obj, obj2);
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
        int L = gm.L(12.0f);
        int L2 = this.e ? gm.L(12.0f) : 0;
        for (int i5 = 0; i5 < this.d; i5++) {
            rsc[] rscVarArr = this.c;
            int measuredWidth = rscVarArr[i5].getMeasuredWidth();
            rsc rscVar = rscVarArr[i5];
            rscVar.layout(L, L2, L + measuredWidth, rscVar.getMeasuredHeight() + L2);
            L = hg9.v(3.0f, measuredWidth, L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), wi8.E(3.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, gm.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int L = size - gm.L(aq1.h(this.d, 1, 3, 24));
        int i4 = L / this.d;
        boolean z = this.h;
        int L2 = (z == 0 || z == 2 || z == 3) ? gm.L(180.0f) : i4;
        setMeasuredDimension(size, gm.L(this.f ? 12.0f : 3.0f) + (this.e ? gm.L(12.0f) : 0) + L2);
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

    @Override // vlb
    public final void updateColors() {
        try {
            this.s.setColor(cmb.w0(null, cmb.Bi, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
