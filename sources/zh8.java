// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class zh8 extends FrameLayout implements xeb, s84 {
    public final iz1 E;
    public Integer F;
    public final fm0 a;
    public final fm0 b;
    public final vnb c;
    public final qy d;
    public yg8 e;
    public final ImageView f;
    public final ImageView h;
    public ema n;
    public final og2 r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public zh8(Context context, int i, View.OnClickListener onClickListener, vnb vnbVar) {
        super(context);
        float f;
        int i2;
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 380L, false);
        this.b = new fm0(1, this, k43Var, 380L, false);
        this.c = vnbVar;
        qy qyVar = new qy(this, context, vnbVar, (byte) 2);
        this.d = qyVar;
        final byte b = 1;
        qyVar.setAllowTextEntitiesIntersection(true);
        yob.X(qyVar, aob.G6, vnbVar);
        yob.G(qyVar, aob.Xc, vnbVar);
        yob.D(qyVar, aob.H6, vnbVar);
        qyVar.setTextSize(1, 16.0f);
        qyVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        qyVar.setBackground(null);
        qyVar.setImeOptions(qyVar.getImeOptions() | TLObject.FLAG_28);
        qyVar.setInputType(qyVar.getInputType() | TLObject.FLAG_14);
        qyVar.setPadding(hl.L(4.0f), hl.L(10.0f), hl.L(4.0f), hl.L(11.0f));
        final byte b2 = 0;
        if (onClickListener != null) {
            int i3 = i == 1 ? 92 : 58;
            boolean z = ob6.a0;
            addView(qyVar, tre.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? i3 : 54.0f, 0.0f, !z ? i3 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i4 = aob.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.s(imageView, i4, vnbVar, mode);
            addView(imageView, tre.d(48, 48.0f, (ob6.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i5 = aob.Mi;
            hf0 f0 = aob.f0(aob.v0(i5, vnbVar), 1, -1);
            uob M = yob.M(i5);
            imageView2.setBackground(f0);
            yob.j(imageView2, f0, null, M, vnbVar);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            yob.s(imageView2, i4, vnbVar, mode);
            imageView2.setContentDescription(ob6.M0(2131751563, null));
            boolean z2 = ob6.a0;
            addView(imageView2, tre.d(48, 50.0f, (z2 ? 3 : 5) | 48, z2 ? 3.0f : 0.0f, 0.0f, z2 ? 0.0f : 3.0f, 0.0f));
            ema emaVar = new ema(context);
            this.n = emaVar;
            emaVar.setTextSize(13);
            this.n.setGravity((ob6.a0 ? 3 : 5) | 48);
            View view = this.n;
            boolean z3 = ob6.a0;
            addView(view, tre.d(48, 24.0f, (z3 ? 3 : 5) | 48, z3 ? 20.0f : 0.0f, 43.0f, z3 ? 0.0f : 20.0f, 0.0f));
            og2 og2Var = new og2(21, vnbVar, context);
            this.r = og2Var;
            og2Var.b(-1, i4, aob.k7);
            og2Var.setContentDescription(ob6.M0(2131754791, null));
            og2Var.setDrawUnchecked(true);
            og2Var.a(true, false);
            og2Var.setAlpha(0.0f);
            og2Var.setDrawBackgroundAsArc(8);
            addView(og2Var, tre.d(48, 48.0f, (ob6.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            og2Var.setOnClickListener(new View.OnClickListener(this) { // from class: yh8
                public final /* synthetic */ zh8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b2;
                    zh8 zh8Var = this.b;
                    switch (b3) {
                        case 0:
                            if (zh8Var.r.getTag() != null) {
                                zh8Var.i(zh8Var, !r2.a.q);
                                break;
                            }
                            break;
                        default:
                            zh8Var.k(zh8Var);
                            break;
                    }
                }
            });
        } else {
            int i6 = i == 1 ? 70 : 19;
            boolean z4 = ob6.a0;
            addView(qyVar, tre.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i6 : 19.0f, 0.0f, z4 ? 19.0f : i6, 0.0f));
        }
        if (i == 1) {
            iz1 iz1Var = new iz1(context);
            this.E = iz1Var;
            yob.s(iz1Var, aob.m6, vnbVar, PorterDuff.Mode.SRC_IN);
            iz1Var.j(gz1.e, false);
            int L = hl.L(9.5f);
            iz1Var.setPadding(L, L, L, L);
            iz1Var.setVisibility(8);
            int i7 = this.f == null ? 3 : 38;
            boolean z5 = ob6.a0;
            if (z5) {
                f = i7;
                i2 = 3;
            } else {
                f = 0.0f;
                i2 = 5;
            }
            addView(iz1Var, tre.d(48, 48.0f, i2, f, 0.0f, z5 ? 0.0f : i7, 0.0f));
            int i8 = aob.Mi;
            hf0 f02 = aob.f0(aob.v0(i8, vnbVar), 1, -1);
            uob M2 = yob.M(i8);
            iz1Var.setBackground(f02);
            yob.j(iz1Var, f02, null, M2, vnbVar);
            iz1Var.setOnClickListener(new View.OnClickListener(this) { // from class: yh8
                public final /* synthetic */ zh8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b;
                    zh8 zh8Var = this.b;
                    switch (b3) {
                        case 0:
                            if (zh8Var.r.getTag() != null) {
                                zh8Var.i(zh8Var, !r2.a.q);
                                break;
                            }
                            break;
                        default:
                            zh8Var.k(zh8Var);
                            break;
                    }
                }
            });
            iz1Var.setContentDescription(ob6.M0(2131751161, null));
        }
    }

    @Override // xeb
    public final boolean a() {
        return false;
    }

    public final yg8 b() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        yg8 yg8Var = new yg8(getContext(), 38);
        this.e = yg8Var;
        yg8Var.setFocusable(false);
        yg8 yg8Var2 = this.e;
        int i = aob.Mi;
        vnb vnbVar = this.c;
        yob.R(yg8Var2, aob.f0(aob.v0(i, vnbVar), 1, -1), null, yob.M(i), vnbVar);
        iye.a(this.e);
        yg8 yg8Var3 = this.e;
        boolean z = ob6.a0;
        addView(yg8Var3, tre.d(48, 50.0f, (z ? 3 : 5) | 48, z ? 4.0f : 0.0f, 0.0f, z ? 0.0f : 4.0f, 0.0f));
        iz1 iz1Var = this.E;
        if (iz1Var != null) {
            boolean z2 = ob6.a0;
            iz1Var.setLayoutParams(tre.d(48, 48.0f, (z2 ? 3 : 5) | 48, z2 ? 44.0f : 0.0f, 1.0f, z2 ? 0.0f : 44.0f, 0.0f));
        }
        qy qyVar = this.d;
        if (qyVar != null) {
            float f = (ob6.a0 ? ((ViewGroup.MarginLayoutParams) qyVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) qyVar.getLayoutParams()).leftMargin) / hl.p;
            int i2 = (iz1Var != null ? 70 : 19) + 24;
            boolean z3 = ob6.a0;
            int i3 = (z3 ? 5 : 3) | 16;
            float f2 = z3 ? i2 : f;
            if (!z3) {
                f = i2;
            }
            qyVar.setLayoutParams(tre.d(-1, -2.0f, i3, f2, 0.0f, f, 0.0f));
        }
        return this.e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    @Override // xeb
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void e() {
        this.y = true;
        ema emaVar = new ema(getContext());
        this.n = emaVar;
        emaVar.setTextSize(13);
        this.n.setGravity((ob6.a0 ? 3 : 5) | 48);
        ema emaVar2 = this.n;
        boolean z = ob6.a0;
        addView(emaVar2, tre.d(48, 24.0f, (z ? 3 : 5) | 48, z ? 20.0f : 0.0f, 17.0f, z ? 0.0f : 20.0f, 0.0f));
    }

    public boolean f() {
        return true;
    }

    public boolean g(zh8 zh8Var) {
        return false;
    }

    public og2 getCheckBox() {
        return this.r;
    }

    @Override // xeb
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // xeb
    public float getEditFieldBottomOffset() {
        return 0.0f;
    }

    @Override // xeb
    public Editable getEditText() {
        return this.d.getText();
    }

    public iz1 getEmojiButton() {
        return this.E;
    }

    @Override // xeb
    public CharSequence getFieldText() {
        qy qyVar = this.d;
        if (qyVar.length() > 0) {
            return qyVar.getText();
        }
        return null;
    }

    @Override // xeb
    public e getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public ema getTextView2() {
        return this.n;
    }

    public void i(zh8 zh8Var, boolean z) {
        this.r.a(z, true);
    }

    public boolean m(ArrayList arrayList) {
        return false;
    }

    public final void n(boolean z, boolean z2) {
        og2 og2Var = this.r;
        if (z == (og2Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        og2Var.setTag(z ? 1 : null);
        ImageView imageView = this.h;
        if (!z2) {
            og2Var.setAlpha(z ? 1.0f : 0.0f);
            imageView.setAlpha(z ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        float[] fArr = {z ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(og2Var, (Property<og2, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z ? 0.0f : 1.0f));
        this.x.setDuration(180L);
        this.x.start();
    }

    public final void o(CharSequence charSequence, String str, boolean z) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        qy qyVar = this.d;
        qyVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            qyVar.setSelection(qyVar.length());
        }
        qyVar.setHint(str);
        this.w = z;
        setWillNotDraw(!z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        og2 og2Var = this.r;
        if (og2Var != null) {
            n(p(), false);
            og2Var.a(g(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.w && f()) {
            boolean z = ob6.a0;
            ImageView imageView = this.h;
            if (z) {
                L = 0.0f;
            } else {
                L = hl.L(imageView != null ? 58.0f : 20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(imageView != null ? 58.0f : 20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        iz1 iz1Var;
        ImageView imageView;
        qy qyVar;
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        while (true) {
            int childCount = getChildCount();
            iz1Var = this.E;
            imageView = this.f;
            qyVar = this.d;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt != qyVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                } else if (childAt == iz1Var) {
                    iz1Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        ema emaVar = this.n;
                        if (childAt == emaVar) {
                            emaVar.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), TLObject.FLAG_30));
                        } else {
                            og2 og2Var = this.r;
                            if (childAt == og2Var) {
                                og2Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                } else {
                                    childAt.measure(i, i2);
                                }
                            }
                        }
                    }
                }
            }
            i3++;
        }
        qyVar.measure(View.MeasureSpec.makeMeasureSpec(((size - getPaddingLeft()) - getPaddingRight()) - hl.L(this.F != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : iz1Var != null ? jn7.Z1 : jn7.F1), TLObject.FLAG_30), 0);
        int measuredHeight = qyVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(hl.L(50.0f), qyVar.getMeasuredHeight()) + (this.w ? 1 : 0));
        ema emaVar2 = this.n;
        if (emaVar2 == null || this.y) {
            return;
        }
        emaVar2.setAlpha(measuredHeight >= hl.L(52.0f) ? 1.0f : 0.0f);
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z) {
        this.b.a(z, true);
    }

    @Override // xeb
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i) {
        vnb vnbVar = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            yob.s(imageView, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            yob.s(imageView2, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        }
        iz1 iz1Var = this.E;
        if (iz1Var != null) {
            yob.s(iz1Var, i, vnbVar, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z) {
        this.s = z;
    }

    public void setText2(String str) {
        ema emaVar = this.n;
        if (emaVar == null) {
            return;
        }
        emaVar.l(str, false);
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }

    public void setTextRight(int i) {
        this.F = Integer.valueOf(i);
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        iz1 iz1Var;
        if (i == 0) {
            og2 og2Var = this.r;
            if (og2Var != null) {
                CheckBoxBase checkBoxBase = og2Var.getCheckBoxBase();
                float f3 = this.a.e;
                if (checkBoxBase.w != f3) {
                    checkBoxBase.w = f3;
                    checkBoxBase.b();
                }
                og2Var.invalidate();
                return;
            }
            return;
        }
        if (i != 1 || (iz1Var = this.E) == null) {
            return;
        }
        float f4 = this.b.e;
        float f5 = 0.85f * f4;
        iz1Var.setScaleX(f5);
        iz1Var.setScaleY(f5);
        iz1Var.setAlpha(f4);
        iz1Var.setVisibility(f4 > 0.0f ? 0 : 8);
        ema emaVar = this.n;
        if (emaVar != null && this.f == null && emaVar.getVisibility() == 0) {
            yg8 yg8Var = this.e;
            ema emaVar2 = this.n;
            if (yg8Var != null) {
                emaVar2.setTranslationY(hl.L(36.0f));
            } else {
                emaVar2.setTranslationY(hl.L(26.0f) * f4);
            }
        }
    }

    public void j(boolean z) {
    }

    public void k(zh8 zh8Var) {
    }

    public void l(qy qyVar) {
    }

    public void h(qy qyVar, ActionMode actionMode) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
