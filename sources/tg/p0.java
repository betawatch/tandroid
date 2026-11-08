package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import fi.e5;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.aj;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class p0 extends pj0 {
    public final ArrayList e3;
    public final ArrayList f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final /* synthetic */ e5 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e5 e5Var, Context context, t0 t0Var) {
        super(context, t0Var);
        this.j3 = e5Var;
        this.e3 = new ArrayList();
        this.f3 = new ArrayList();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x049d A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7;
        int i10;
        float f11;
        boolean z9;
        float f12;
        int i11;
        ArrayList arrayList;
        dj currentMessagesGroup;
        int i12;
        canvas.save();
        this.E1.setEmpty();
        int childCount = getChildCount();
        int i13 = 0;
        dj djVar = null;
        while (true) {
            f10 = 0.0f;
            i7 = 4;
            i10 = 2;
            f11 = 2.0f;
            z9 = true;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 4) {
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    dj currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != djVar) {
                        aj currentPosition = q1Var.getCurrentPosition();
                        i90 backgroundDrawable = q1Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f || q1Var.y2()) && (currentPosition == null || (2 & currentPosition.l) != 0)) {
                            int y10 = (int) q1Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i12 = q1Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = q1Var.getMeasuredHeight() + y10;
                                long j3 = 0;
                                float f13 = 0.0f;
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    View childAt2 = getChildAt(i14);
                                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            i90 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                            int min = Math.min(y10, (int) q1Var2.getY());
                                            int max = Math.max(measuredHeight, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                            long j10 = backgroundDrawable2.l;
                                            if (j10 > j3) {
                                                float x10 = q1Var2.getX() + backgroundDrawable2.h;
                                                f13 = q1Var2.getY() + backgroundDrawable2.i;
                                                f10 = x10;
                                                j3 = j10;
                                            }
                                            y10 = min;
                                            measuredHeight = max;
                                        }
                                    }
                                }
                                backgroundDrawable.j = f10;
                                backgroundDrawable.k = f13 - y10;
                                i12 = measuredHeight - y10;
                            }
                            int i15 = i12 + y10;
                            canvas.clipRect(0, y10, getMeasuredWidth(), i15);
                            backgroundDrawable.b = null;
                            backgroundDrawable.a.setColor(k6.w0(k6.vd, this.n2));
                            backgroundDrawable.setBounds(0, y10, getMeasuredWidth(), i15);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        djVar = currentMessagesGroup2;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.Q()) {
                        canvas.save();
                        canvas.translate(t0Var.getX(), t0Var.getY() + t0Var.getPaddingTop());
                        canvas.scale(t0Var.getScaleX(), t0Var.getScaleY(), t0Var.getMeasuredWidth() / 2.0f, t0Var.getMeasuredHeight() / 2.0f);
                        t0Var.E(canvas, true);
                        t0Var.H(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i13++;
        }
        int i16 = 0;
        while (i16 < 3) {
            ArrayList arrayList2 = this.i3;
            arrayList2.clear();
            if (i16 != i10 || this.V1) {
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt3 = getChildAt(i17);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && q1Var3.getVisibility() != i7 && q1Var3.getVisibility() != 8 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            cj cjVar = currentMessagesGroup.m;
                            if ((i16 != 0 || currentMessagesGroup.d.size() != z9) && ((i16 != z9 || cjVar.i) && ((i16 != 0 || !q1Var3.getMessageObject().Z) && ((i16 != z9 || q1Var3.getMessageObject().Z) && ((i16 != i10 || q1Var3.ya) && (i16 == i10 || !q1Var3.ya)))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    cjVar.a = 0;
                                    cjVar.b = 0;
                                    cjVar.c = 0;
                                    cjVar.d = 0;
                                    cjVar.l = false;
                                    cjVar.k = false;
                                    cjVar.m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                cjVar.k = q1Var3.I2();
                                cjVar.l = q1Var3.H2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().l & i7) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                }
                                int i18 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i19 = backgroundDrawableBottom;
                                if (q1Var3.ya) {
                                    cjVar.m = q1Var3;
                                }
                                int i20 = cjVar.b;
                                if (i20 == 0 || i18 < i20) {
                                    cjVar.b = i18;
                                }
                                int i21 = cjVar.d;
                                if (i21 == 0 || i19 > i21) {
                                    cjVar.d = i19;
                                }
                                int i22 = cjVar.a;
                                if (i22 == 0 || backgroundDrawableLeft < i22) {
                                    cjVar.a = backgroundDrawableLeft;
                                }
                                int i23 = cjVar.c;
                                if (i23 == 0 || backgroundDrawableRight > i23) {
                                    cjVar.c = backgroundDrawableRight;
                                }
                                i17++;
                                i10 = 2;
                                f10 = 0.0f;
                            }
                        }
                    }
                    i17++;
                    i10 = 2;
                    f10 = 0.0f;
                }
                int i24 = 0;
                while (i24 < arrayList2.size()) {
                    dj djVar2 = (dj) arrayList2.get(i24);
                    cj cjVar2 = djVar2.m;
                    float R1 = cjVar2.m.R1(z9);
                    float f14 = cjVar2.a + R1 + cjVar2.e;
                    float f15 = cjVar2.b + cjVar2.f;
                    float f16 = cjVar2.g + cjVar2.c + R1;
                    float f17 = cjVar2.d + cjVar2.h;
                    if (!cjVar2.j) {
                        f15 += cjVar2.m.getTranslationY();
                        f17 += cjVar2.m.getTranslationY();
                    }
                    boolean z10 = (cjVar2.m.getScaleX() == 1.0f && cjVar2.m.getScaleY() == 1.0f) ? false : z9;
                    if (z10) {
                        canvas.save();
                        arrayList = arrayList2;
                        canvas.scale(cjVar2.m.getScaleX(), cjVar2.m.getScaleY(), com.google.android.recaptcha.internal.a.A(f16, f14, f11, f14), com.google.android.recaptcha.internal.a.A(f17, f15, f11, f15));
                    } else {
                        arrayList = arrayList2;
                    }
                    float f18 = f11;
                    float f19 = f15;
                    float f20 = f17;
                    cjVar2.m.K0(canvas, (int) f14, (int) f15, (int) f16, (int) f17, cjVar2.k, cjVar2.l, false, 0);
                    cjVar2.m = null;
                    cjVar2.o = djVar2.c;
                    if (z10) {
                        canvas.restore();
                        for (int i25 = 0; i25 < childCount; i25++) {
                            View childAt4 = getChildAt(i25);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == djVar2) {
                                    int left = q1Var4.getLeft();
                                    int top = q1Var4.getTop();
                                    childAt4.setPivotX(((f16 - f14) / f18) + (f14 - left));
                                    childAt4.setPivotY(((f20 - f19) / f18) + (f19 - top));
                                }
                            }
                        }
                    }
                    i24++;
                    arrayList2 = arrayList;
                    f11 = f18;
                    z9 = true;
                }
                i11 = 2;
            } else {
                i11 = i10;
            }
            i16++;
            i10 = i11;
            f11 = f11;
            z9 = true;
            f10 = 0.0f;
            i7 = 4;
        }
        super.dispatchDraw(canvas);
        ArrayList arrayList3 = this.e3;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i26 = 0; i26 < size; i26++) {
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) arrayList3.get(i26);
                canvas.save();
                canvas.translate(q1Var5.R1(false) + q1Var5.getLeft(), q1Var5.getY());
                q1Var5.x1(q1Var5.b() ? q1Var5.getAlpha() : 1.0f, canvas, true);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f3;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i27 = 0; i27 < size2; i27++) {
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) arrayList4.get(i27);
                float R12 = q1Var6.R1(false) + q1Var6.getLeft();
                float y11 = q1Var6.getY();
                float alpha = q1Var6.b() ? q1Var6.getAlpha() : 1.0f;
                canvas.save();
                canvas.translate(R12, y11);
                q1Var6.setInvalidatesParent(true);
                q1Var6.h1(canvas, alpha);
                q1Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.g3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i28 = 0; i28 < size3; i28++) {
                org.telegram.ui.Cells.q1 q1Var7 = (org.telegram.ui.Cells.q1) arrayList5.get(i28);
                boolean z11 = q1Var7.getCurrentPosition() != null && (q1Var7.getCurrentPosition().l & 1) == 0;
                float alpha2 = q1Var7.b() ? q1Var7.getAlpha() : 1.0f;
                float R13 = q1Var7.R1(false) + q1Var7.getLeft();
                float y12 = q1Var7.getY();
                canvas.save();
                dj currentMessagesGroup3 = q1Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null) {
                    cj cjVar3 = currentMessagesGroup3.m;
                    if (cjVar3.j) {
                        float R14 = q1Var7.R1(true);
                        float f21 = cjVar3.a + R14 + cjVar3.e;
                        float f22 = cjVar3.b + cjVar3.f;
                        float f23 = cjVar3.c + R14 + cjVar3.g;
                        float f24 = cjVar3.d + cjVar3.h;
                        if (!cjVar3.j) {
                            f22 += q1Var7.getTranslationY();
                            f24 += q1Var7.getTranslationY();
                        }
                        canvas.clipRect(f21 + org.telegram.messenger.g0.L(8.0f), f22 + org.telegram.messenger.g0.L(8.0f), f23 - org.telegram.messenger.g0.L(8.0f), f24 - org.telegram.messenger.g0.L(8.0f));
                        if (!q1Var7.getTransitionParams().w0) {
                            canvas.translate(R13, y12);
                            q1Var7.setInvalidatesParent(true);
                            q1Var7.Q0(alpha2, canvas, z11);
                            q1Var7.setInvalidatesParent(false);
                            canvas.restore();
                        }
                    }
                }
                if (!q1Var7.getTransitionParams().w0) {
                }
            }
            f12 = 8.0f;
            arrayList5.clear();
        } else {
            f12 = 8.0f;
        }
        ArrayList arrayList6 = this.h3;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i29 = 0; i29 < size4; i29++) {
                org.telegram.ui.Cells.q1 q1Var8 = (org.telegram.ui.Cells.q1) arrayList6.get(i29);
                if (q1Var8.getCurrentPosition() == null || (q1Var8.getCurrentPosition().l & 1) != 0) {
                    float alpha3 = q1Var8.b() ? q1Var8.getAlpha() : 1.0f;
                    float R15 = q1Var8.R1(false) + q1Var8.getLeft();
                    float y13 = q1Var8.getY();
                    canvas.save();
                    dj currentMessagesGroup4 = q1Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null) {
                        cj cjVar4 = currentMessagesGroup4.m;
                        if (cjVar4.j) {
                            float R16 = q1Var8.R1(true);
                            float f25 = cjVar4.a + R16 + cjVar4.e;
                            float f26 = cjVar4.b + cjVar4.f;
                            float f27 = cjVar4.c + R16 + cjVar4.g;
                            float f28 = cjVar4.d + cjVar4.h;
                            if (!cjVar4.j) {
                                f26 += q1Var8.getTranslationY();
                                f28 += q1Var8.getTranslationY();
                            }
                            canvas.clipRect(f25 + org.telegram.messenger.g0.L(f12), f26 + org.telegram.messenger.g0.L(f12), f27 - org.telegram.messenger.g0.L(f12), f28 - org.telegram.messenger.g0.L(f12));
                        }
                    }
                    if (q1Var8.getTransitionParams().w0) {
                        canvas.translate(R15, y13);
                        q1Var8.setInvalidatesParent(true);
                        q1Var8.o1(canvas, alpha3, null);
                        q1Var8.V0(canvas, alpha3);
                        q1Var8.setInvalidatesParent(false);
                        canvas.restore();
                    }
                }
            }
            arrayList6.clear();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x00fe, code lost:
    
        if ((r11 & 1) != 0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.t0 t0Var;
        float f10;
        float f11;
        boolean z9;
        int i7;
        int b10;
        int b11;
        int i10;
        e5 e5Var = this.j3;
        dj djVar = e5Var.t0;
        if (view instanceof org.telegram.ui.Cells.q1) {
            q1Var = (org.telegram.ui.Cells.q1) view;
        } else {
            if (view instanceof org.telegram.ui.Cells.t0) {
                t0Var = (org.telegram.ui.Cells.t0) view;
                q1Var = null;
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (q1Var == null && q1Var.j2()) {
                    canvas.save();
                    canvas.translate(q1Var.getX(), q1Var.getY() + q1Var.getPaddingTop());
                    q1Var.i1(canvas);
                    canvas.restore();
                } else if (t0Var != null) {
                    canvas.save();
                    canvas.translate(t0Var.getX(), t0Var.getY());
                    t0Var.G(canvas);
                    canvas.restore();
                }
                float f12 = 0.0f;
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (q1Var != null) {
                    q1Var.S0(canvas);
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.restore();
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (q1Var != null) {
                    q1Var.getMessageObject();
                    aj currentPosition = q1Var.getCurrentPosition();
                    if (currentPosition != null || q1Var.getTransitionParams().x0) {
                        if (currentPosition == null || currentPosition.h || (currentPosition.a == 0 && currentPosition.c == 0)) {
                            if (currentPosition == null || currentPosition.h) {
                                this.e3.add(q1Var);
                            }
                            if ((currentPosition == null || (currentPosition.a == 0 && currentPosition.c == 0)) && q1Var.i2()) {
                                this.f3.add(q1Var);
                            }
                        }
                        if (currentPosition != null || q1Var.getTransitionParams().D0 || q1Var.getTransitionParams().x0) {
                            if (currentPosition == null || (currentPosition.l & q1Var.B()) != 0) {
                                this.g3.add(q1Var);
                            }
                            if (currentPosition != null) {
                                int i11 = currentPosition.l;
                                if ((i11 & 8) != 0) {
                                }
                            }
                            this.h3.add(q1Var);
                        }
                    }
                    ImageReceiver avatarImage = q1Var.getAvatarImage();
                    if (avatarImage != null) {
                        boolean z10 = this.V1 || (djVar != null && djVar.m.j);
                        int top = z10 ? view.getTop() : (int) view.getY();
                        if (!q1Var.m() || (b11 = e5Var.r0.T(view).b()) < 0) {
                            f11 = 0.0f;
                            z9 = true;
                        } else {
                            if (djVar == null || currentPosition == null) {
                                f11 = 0.0f;
                                z9 = true;
                                i10 = b11 - 1;
                            } else {
                                int indexOf = djVar.e.indexOf(currentPosition);
                                int size = djVar.e.size();
                                z9 = true;
                                if ((currentPosition.l & 8) != 0) {
                                    i10 = (b11 - size) + indexOf;
                                } else {
                                    i10 = b11 - 1;
                                    int i12 = indexOf + 1;
                                    while (i12 < size) {
                                        f11 = f12;
                                        if (((aj) djVar.e.get(i12)).c > currentPosition.d) {
                                            break;
                                        }
                                        i10--;
                                        i12++;
                                        f12 = f11;
                                    }
                                }
                                f11 = f12;
                            }
                            if (K(i10) != null) {
                                if (view.getTranslationY() != f11) {
                                    canvas.restore();
                                }
                                avatarImage.O0(false, false);
                                return drawChild;
                            }
                        }
                        float checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                        int top2 = (int) ((z10 ? view.getTop() : view.getY()) + q1Var.getLayoutHeight() + q1Var.getTransitionParams().j0);
                        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                        boolean z11 = ((q1Var.m1 || q1Var.n1) && checkBoxTranslation == f11) ? z9 : false;
                        if (q1Var.J2() || q1Var.getTransitionParams().l2) {
                            if (q1Var.getTransitionParams().l2) {
                                float f13 = q1Var.getTransitionParams().L1;
                                if (!q1Var.J2()) {
                                    f13 = 1.0f - f13;
                                }
                                top2 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f13, Math.min(top2, measuredHeight), top2 * f13);
                            }
                        } else if (top2 > measuredHeight) {
                            top2 = measuredHeight;
                        }
                        if (!z10 && view.getTranslationY() != f11) {
                            canvas.restore();
                        }
                        if (q1Var.j() && (b10 = T(view).b()) >= 0) {
                            int i13 = 0;
                            while (i13 < 20) {
                                i13++;
                                if (djVar == null || currentPosition == null) {
                                    i7 = top2;
                                    b10++;
                                } else {
                                    int indexOf2 = djVar.e.indexOf(currentPosition);
                                    if (indexOf2 < 0) {
                                        break;
                                    }
                                    djVar.e.size();
                                    if ((currentPosition.l & 4) != 0) {
                                        b10 = b10 + indexOf2 + 1;
                                    } else {
                                        b10++;
                                        int i14 = indexOf2 - 1;
                                        while (i14 >= 0) {
                                            i7 = top2;
                                            if (((aj) djVar.e.get(i14)).d < currentPosition.c) {
                                                break;
                                            }
                                            b10++;
                                            i14--;
                                            top2 = i7;
                                        }
                                    }
                                    i7 = top2;
                                }
                                v4.d1 K = K(b10);
                                if (K == null) {
                                    break;
                                }
                                View view2 = K.a;
                                top = view2.getTop();
                                if (!(view2 instanceof org.telegram.ui.Cells.q1)) {
                                    break;
                                }
                                q1Var = (org.telegram.ui.Cells.q1) view2;
                                float checkBoxTranslation2 = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                if (z11 && checkBoxTranslation2 > f11) {
                                    checkBoxTranslation = checkBoxTranslation2;
                                }
                                if (!q1Var.j()) {
                                    break;
                                }
                                top2 = i7;
                            }
                        }
                        i7 = top2;
                        int L = i7 - org.telegram.messenger.g0.L(42.0f) < top ? org.telegram.messenger.g0.L(42.0f) + top : i7;
                        if (!q1Var.m()) {
                            int bottom = z10 ? q1Var.getBottom() : (int) (q1Var.getY() + q1Var.getMeasuredHeight() + q1Var.getTransitionParams().j0);
                            if (L > bottom) {
                                L = bottom;
                            }
                        }
                        canvas.save();
                        if (checkBoxTranslation != f11) {
                            canvas.translate(checkBoxTranslation, f11);
                        }
                        if (q1Var.getCurrentMessagesGroup() != null && q1Var.getCurrentMessagesGroup().m.j) {
                            L = (int) (L - q1Var.getTranslationY());
                        }
                        avatarImage.L0 = L - org.telegram.messenger.g0.L(40.0f);
                        if (q1Var.b()) {
                            avatarImage.setAlpha(q1Var.getAlpha());
                            canvas.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX() + q1Var.getX(), q1Var.getY() + (q1Var.getHeight() >> 1));
                        } else {
                            avatarImage.setAlpha(1.0f);
                        }
                        avatarImage.O0(z9, false);
                        avatarImage.h(canvas, null);
                        canvas.restore();
                        if (z10) {
                            f10 = 0.0f;
                        } else {
                            f10 = 0.0f;
                            if (view.getTranslationY() != 0.0f) {
                                canvas.save();
                            }
                        }
                        if (view.getTranslationY() != f10) {
                            canvas.restore();
                        }
                        return drawChild;
                    }
                }
                f10 = 0.0f;
                if (view.getTranslationY() != f10) {
                }
                return drawChild;
            }
            q1Var = null;
        }
        t0Var = null;
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        if (q1Var == null) {
        }
        if (t0Var != null) {
        }
        float f122 = 0.0f;
        if (view.getTranslationY() != 0.0f) {
        }
        if (q1Var != null) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (q1Var != null) {
        }
        f10 = 0.0f;
        if (view.getTranslationY() != f10) {
        }
        return drawChild2;
    }
}
