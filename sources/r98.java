// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r98 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public int b;
    public Object c;
    public View d;
    public View e;
    public Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r98(jla jlaVar, Context context) {
        super(context);
        this.h = jlaVar;
        this.c = new ema[2];
        setClipChildren(false);
    }

    public final ema a() {
        ema emaVar = new ema(getContext());
        emaVar.setGravity(17);
        emaVar.setTextSize(14);
        emaVar.setTextColor(((jla) this.h).l0);
        addView(emaVar, tre.e(-2, -2, 51));
        return emaVar;
    }

    public final void b(int i) {
        jla jlaVar = (jla) this.h;
        ema[] emaVarArr = (ema[]) this.c;
        if (emaVarArr[i] != null) {
            return;
        }
        ema emaVar = new ema(getContext());
        emaVar.setGravity(17);
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(17);
        emaVar.setTextColor(jlaVar.k0);
        emaVar.setEmojiColor(jlaVar.k0);
        emaVar.setDrawablePadding(hl.L(4.0f));
        emaVar.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        emaVar.setRightDrawableTopPadding(-hl.L(1.0f));
        emaVarArr[i] = emaVar;
        addView(emaVar, 0, tre.e(-2, -2, 51));
    }

    public final void c(CharSequence charSequence) {
        this.f = charSequence;
        ema emaVar = (ema) this.e;
        if (emaVar != null) {
            emaVar.animate().cancel();
            ((ema) this.e).setVisibility(8);
        }
        ema emaVar2 = (ema) this.d;
        if (emaVar2 == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            emaVar2 = a();
            this.d = emaVar2;
        }
        emaVar2.animate().cancel();
        ((ema) this.d).setAlpha(1.0f);
        ((ema) this.d).setTranslationY(0.0f);
        ((ema) this.d).k(charSequence);
        ((ema) this.d).setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        requestLayout();
    }

    public final void d() {
        jla jlaVar = (jla) this.h;
        for (ema emaVar : (ema[]) this.c) {
            if (emaVar != null) {
                emaVar.setTextColor(jlaVar.k0);
                emaVar.setEmojiColor(jlaVar.k0);
            }
        }
        ema emaVar2 = (ema) this.d;
        if (emaVar2 != null) {
            emaVar2.setTextColor(jlaVar.l0);
        }
        ema emaVar3 = (ema) this.e;
        if (emaVar3 != null) {
            emaVar3.setTextColor(jlaVar.l0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                int i5 = i3 - i;
                int i6 = i4 - i2;
                ema emaVar = (ema) this.d;
                boolean z2 = (emaVar == null || emaVar.getVisibility() == 8) ? false : true;
                ema[] emaVarArr = (ema[]) this.c;
                for (ema emaVar2 : emaVarArr) {
                    if (emaVar2 != null && emaVar2.getVisibility() != 8) {
                        int L = z2 ? hl.L(5.0f) + (((i6 / 2) - emaVar2.getTextHeight()) / 2) : (i6 - emaVar2.getTextHeight()) / 2;
                        int measuredWidth = (i5 - emaVar2.getMeasuredWidth()) / 2;
                        int paddingTop = L - emaVar2.getPaddingTop();
                        emaVar2.layout(measuredWidth, paddingTop, emaVar2.getMeasuredWidth() + measuredWidth, emaVar2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z2) {
                    ema[] emaVarArr2 = {(ema) this.d, (ema) this.e};
                    for (int i7 = 0; i7 < 2; i7++) {
                        ema emaVar3 = emaVarArr2[i7];
                        if (emaVar3 != null && emaVar3.getVisibility() != 8) {
                            int i8 = i6 / 2;
                            int textHeight = (((i8 - emaVar3.getTextHeight()) / 2) + i8) - hl.L(2.0f);
                            int measuredWidth2 = (i5 - emaVar3.getMeasuredWidth()) / 2;
                            emaVar3.layout(measuredWidth2, textHeight, emaVar3.getMeasuredWidth() + measuredWidth2, emaVar3.getTextHeight() + textHeight);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt != emaVarArr[0] && childAt != emaVarArr[1] && childAt != ((ema) this.d) && childAt != ((ema) this.e) && childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int i10 = layoutParams.leftMargin;
                        int measuredHeight = (((i6 - childAt.getMeasuredHeight()) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i10, measuredHeight, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + measuredHeight);
                    }
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int max = Math.max(0, size - (this.b << 1));
                ema[] emaVarArr = (ema[]) this.c;
                for (ema emaVar : emaVarArr) {
                    if (emaVar != null && emaVar.getVisibility() != 8) {
                        emaVar.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(emaVar.getPaddingBottom() + emaVar.getPaddingTop() + hl.L(24.0f), TLObject.FLAG_31));
                    }
                }
                ema emaVar2 = (ema) this.d;
                if (emaVar2 != null && emaVar2.getVisibility() != 8) {
                    ((ema) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_31));
                }
                ema emaVar3 = (ema) this.e;
                if (emaVar3 != null && emaVar3.getVisibility() != 8) {
                    ((ema) this.e).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_31));
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt != emaVarArr[0] && childAt != emaVarArr[1] && childAt != ((ema) this.d) && childAt != ((ema) this.e) && childAt.getVisibility() != 8) {
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        r98 r98Var;
        switch (this.a) {
            case 0:
                super.setTranslationX(f);
                s98 s98Var = (s98) this.h;
                r98[] r98VarArr = s98Var.n;
                if (s98Var.s && (r98Var = r98VarArr[0]) == this) {
                    s98Var.h.i(Math.abs(r98Var.getTranslationX()) / r98VarArr[0].getMeasuredWidth(), r98VarArr[1].b);
                    break;
                }
                break;
            default:
                super.setTranslationX(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r98(s98 s98Var, Context context) {
        super(context);
        this.h = s98Var;
    }
}
