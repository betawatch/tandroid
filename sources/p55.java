// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p55 extends FrameLayout implements snb {
    public static final /* synthetic */ int h = 0;
    public final gm a;
    public final si b;
    public final FrameLayout.LayoutParams c;
    public final vnb d;
    public int e;
    public boolean f;

    public p55(int i, vnb vnbVar, Context context) {
        super(context);
        this.e = 32;
        this.d = vnbVar;
        yob.h(aob.e7, vnbVar, this);
        gm gmVar = new gm(getContext());
        this.a = gmVar;
        boolean z = true;
        gmVar.setTextSize(1, 14.0f);
        gmVar.setTypeface(hl.o());
        int i2 = aob.f7;
        yob.X(gmVar, i2, vnbVar);
        gmVar.setGravity((ob6.a0 ? 5 : 3) | 16);
        float f = i;
        addView(gmVar, tre.d(-1, -1.0f, (ob6.a0 ? 5 : 3) | 48, f, 0.0f, f, 0.0f));
        si siVar = new si(getContext(), z, z, z, (byte) 2);
        this.b = siVar;
        siVar.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        siVar.b(0.9f, 420L, k43.h);
        siVar.setTextSize(hl.L(14.0f));
        yob.U(siVar, i2, vnbVar);
        siVar.setGravity(ob6.a0 ? 3 : 5);
        FrameLayout.LayoutParams d = tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, f, 0.0f, f, 0.0f);
        this.c = d;
        addView(siVar, d);
        WeakHashMap weakHashMap = ihc.a;
        new wgc(R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        si siVar = this.b;
        siVar.c(charSequence, true, true);
        siVar.setOnClickListener(onClickListener);
        siVar.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.a.setText(charSequence);
        si siVar = this.b;
        siVar.c(charSequence2, false, true);
        siVar.setOnClickListener(onClickListener);
        siVar.setVisibility(0);
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(this.e), TLObject.FLAG_30));
    }

    public void setLayerHeight(int i) {
        this.e = i;
        requestLayout();
    }

    public void setNoBackground(boolean z) {
        this.f = z;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        si siVar = this.b;
        siVar.c(charSequence, true, true);
        siVar.setVisibility(0);
    }

    public void setRightTextMargin(int i) {
        float f = i;
        int L = hl.L(f);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = hl.L(f);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        si siVar = this.b;
        siVar.setVisibility(8);
        siVar.setOnClickListener(null);
    }

    public void setTextColor(int i) {
        gm gmVar = this.a;
        vnb vnbVar = this.d;
        yob.X(gmVar, i, vnbVar);
        yob.U(this.b, i, vnbVar);
    }

    @Override // snb
    public final void updateColors() {
        boolean z = this.f;
        vnb vnbVar = this.d;
        setBackgroundColor(z ? 0 : aob.v0(aob.e7, vnbVar));
        int i = aob.f7;
        this.a.setTextColor(aob.v0(i, vnbVar));
        this.b.setTextColor(aob.v0(i, vnbVar));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public p55(Context context, vnb vnbVar) {
        this(16, vnbVar, context);
    }
}
