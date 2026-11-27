// default package

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class uk3 extends FrameLayout implements snb {
    public final LinearLayout a;
    public final LinearLayout b;
    public final gm c;
    public final p66 d;
    public final ImageView e;
    public final ImageView f;
    public final de0 h;
    public final jc0 n;
    public boolean r;

    public uk3(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(hl.L(9.0f), hl.L(5.0f), hl.L(9.0f), hl.L(7.0f));
        jc0 jc0Var = new jc0(context, false);
        this.n = jc0Var;
        jc0Var.setStepFactor(0.56790125f);
        jc0Var.setVisibility(8);
        jc0Var.setCount(0);
        de0 de0Var = new de0(context);
        this.h = de0Var;
        de0Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(ob6.a0 ? hl.L(24.0f) : 0, 0, ob6.a0 ? 0 : hl.L(24.0f), 0);
        gm gmVar = new gm(context);
        this.c = gmVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        gmVar.setEllipsize(truncateAt);
        gmVar.setTextSize(1, 14.0f);
        gmVar.setTypeface(hl.o());
        gmVar.setMaxLines(5);
        linearLayout.addView(gmVar, tre.p(-2, -2, 0.0f, (ob6.a0 ? 5 : 3) | 48));
        p66 p66Var = new p66(context, null);
        this.d = p66Var;
        p66Var.setTextSize(1, 13.0f);
        p66Var.setEllipsize(truncateAt);
        p66Var.setMaxLines(5);
        linearLayout.addView(p66Var, tre.p(-1, -2, 0.0f, 48));
        jn7.i(gmVar);
        jn7.i(p66Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (ob6.a0) {
            linearLayout2.addView(linearLayout, tre.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(jc0Var, tre.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(de0Var, tre.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(de0Var, tre.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(jc0Var, tre.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, tre.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, tre.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, tre.d(16, 16.0f, (ob6.a0 ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f));
        addView(imageView2, tre.d(36, 36.0f, (ob6.a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        jc0 jc0Var = this.n;
        boolean z = min != jc0Var.a.n;
        if (min <= 1) {
            jc0Var.setAvatarsTextSize(hl.L(22.0f));
            jc0Var.setSize(hl.L(36.0f));
        } else {
            jc0Var.setAvatarsTextSize(hl.L(20.0f));
            jc0Var.setSize(hl.L(30.0f));
        }
        jc0Var.setCount(min);
        jc0Var.setVisibility(min <= 0 ? 8 : 0);
        jc0Var.getLayoutParams().width = min <= 1 ? hl.L(36.0f) : hl.L(bp1.h(min, 1, 18, 30));
        if (z) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i2 = 0;
            while (i2 < 3) {
                jc0Var.b(i2, i, i2 >= arrayList.size() ? null : (TLObject) arrayList.get(i2));
                i2++;
            }
        }
        jc0Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        int i;
        this.r = z2;
        int i2 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        gm gmVar = this.c;
        gmVar.setVisibility(i2);
        gmVar.setText(charSequence);
        gmVar.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.e.setVisibility(z ? 0 : 8);
        this.f.setVisibility(8);
        int L = z ? hl.L(24.0f) : 0;
        if (ob6.a0) {
            i = L;
            L = 0;
        } else {
            i = 0;
        }
        this.b.setPadding(i, 0, L, 0);
        updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Point point = hl.q;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
        LinearLayout linearLayout = this.b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), TLObject.FLAG_30));
        this.f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new je3(this, onClickListener, (byte) 7));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override // snb
    public final void updateColors() {
        this.c.setTextColor(aob.w0(null, this.r ? aob.q7 : aob.G6, false));
        int i = aob.y6;
        int w0 = aob.w0(null, i, false);
        p66 p66Var = this.d;
        p66Var.setTextColor(w0);
        p66Var.setLinkTextColor(aob.w0(null, aob.Xc, false));
        int w02 = aob.w0(null, i, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(w02, mode);
        int w03 = aob.w0(null, i, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(w03, mode);
        imageView.setBackground(rnb.c(null, rnb.b(aob.w0(null, rnb.a, false))));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z) {
    }
}
