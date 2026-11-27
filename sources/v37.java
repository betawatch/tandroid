// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v37 extends d79 {
    public final ArrayList f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final /* synthetic */ vw7 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v37(vw7 vw7Var, Context context, a47 a47Var) {
        super(context, a47Var);
        this.k3 = vw7Var;
        this.f3 = new ArrayList();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ac  */
    @Override // d79, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        boolean z;
        float f3;
        int i3;
        ArrayList arrayList;
        m47 currentMessagesGroup;
        int backgroundDrawableLeft;
        int backgroundDrawableRight;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        canvas.save();
        this.F1.setEmpty();
        int childCount = getChildCount();
        int i11 = 0;
        m47 m47Var = null;
        while (true) {
            f = 0.0f;
            i = 4;
            i2 = 2;
            f2 = 2.0f;
            z = true;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 4) {
                if (childAt instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt;
                    m47 currentMessagesGroup2 = wb2Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != m47Var) {
                        j47 currentPosition = wb2Var.getCurrentPosition();
                        m37 backgroundDrawable = wb2Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f || wb2Var.B2()) && (currentPosition == null || (currentPosition.l & 2) != 0)) {
                            int y = (int) wb2Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i10 = wb2Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = wb2Var.getMeasuredHeight() + y;
                                long j = 0;
                                float f4 = 0.0f;
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = getChildAt(i12);
                                    if (childAt2 instanceof wb2) {
                                        wb2 wb2Var2 = (wb2) childAt2;
                                        if (wb2Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            m37 backgroundDrawable2 = wb2Var2.getBackgroundDrawable();
                                            int min = Math.min(y, (int) wb2Var2.getY());
                                            int max = Math.max(measuredHeight, wb2Var2.getMeasuredHeight() + ((int) wb2Var2.getY()));
                                            long j2 = backgroundDrawable2.l;
                                            if (j2 > j) {
                                                float x = wb2Var2.getX() + backgroundDrawable2.h;
                                                f4 = wb2Var2.getY() + backgroundDrawable2.i;
                                                f = x;
                                                j = j2;
                                            }
                                            y = min;
                                            measuredHeight = max;
                                        }
                                    }
                                }
                                backgroundDrawable.j = f;
                                backgroundDrawable.k = f4 - y;
                                i10 = measuredHeight - y;
                            }
                            int i13 = i10 + y;
                            canvas.clipRect(0, y, getMeasuredWidth(), i13);
                            backgroundDrawable.b = null;
                            backgroundDrawable.a.setColor(aob.v0(aob.yd, this.o2));
                            backgroundDrawable.setBounds(0, y, getMeasuredWidth(), i13);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        m47Var = currentMessagesGroup2;
                    }
                } else if (childAt instanceof dl1) {
                    dl1 dl1Var = (dl1) childAt;
                    if (dl1Var.S()) {
                        canvas.save();
                        canvas.translate(dl1Var.getX(), dl1Var.getY() + dl1Var.getPaddingTop());
                        canvas.scale(dl1Var.getScaleX(), dl1Var.getScaleY(), dl1Var.getMeasuredWidth() / 2.0f, dl1Var.getMeasuredHeight() / 2.0f);
                        dl1Var.I(canvas, true);
                        dl1Var.L(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i11++;
        }
        int i14 = 0;
        while (i14 < 3) {
            ArrayList arrayList2 = this.j3;
            arrayList2.clear();
            if (i14 != i2 || this.W1) {
                int i15 = 0;
                while (i15 < childCount) {
                    View childAt3 = getChildAt(i15);
                    if (childAt3 instanceof wb2) {
                        wb2 wb2Var3 = (wb2) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f && wb2Var3.getVisibility() != i && wb2Var3.getVisibility() != 8 && (currentMessagesGroup = wb2Var3.getCurrentMessagesGroup()) != null) {
                            l47 l47Var = currentMessagesGroup.m;
                            if ((i14 != 0 || currentMessagesGroup.d.size() != z) && ((i14 != z || l47Var.i) && ((i14 != 0 || !wb2Var3.getMessageObject().Z) && (i14 != z || wb2Var3.getMessageObject().Z)))) {
                                boolean z2 = wb2Var3.La;
                                if (i14 == i2) {
                                    if (!z2) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                        l47Var.a = 0;
                                        l47Var.b = 0;
                                        l47Var.c = 0;
                                        l47Var.d = 0;
                                        l47Var.l = false;
                                        l47Var.k = false;
                                        l47Var.m = wb2Var3;
                                        arrayList2.add(currentMessagesGroup);
                                    }
                                    l47Var.k = wb2Var3.L2();
                                    l47Var.l = wb2Var3.K2();
                                    backgroundDrawableLeft = wb2Var3.getBackgroundDrawableLeft() + wb2Var3.getLeft();
                                    backgroundDrawableRight = wb2Var3.getBackgroundDrawableRight() + wb2Var3.getLeft();
                                    int backgroundDrawableTop = wb2Var3.getBackgroundDrawableTop() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                    int backgroundDrawableBottom = wb2Var3.getBackgroundDrawableBottom() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                    if ((wb2Var3.getCurrentPosition().l & i) == 0) {
                                        backgroundDrawableTop -= hl.L(10.0f);
                                    }
                                    i4 = backgroundDrawableTop;
                                    if ((wb2Var3.getCurrentPosition().l & 8) == 0) {
                                        backgroundDrawableBottom = hl.L(10.0f) + backgroundDrawableBottom;
                                    }
                                    i5 = backgroundDrawableBottom;
                                    if (wb2Var3.La) {
                                        l47Var.m = wb2Var3;
                                    }
                                    i6 = l47Var.b;
                                    if (i6 != 0 || i4 < i6) {
                                        l47Var.b = i4;
                                    }
                                    i7 = l47Var.d;
                                    if (i7 != 0 || i5 > i7) {
                                        l47Var.d = i5;
                                    }
                                    i8 = l47Var.a;
                                    if (i8 != 0 || backgroundDrawableLeft < i8) {
                                        l47Var.a = backgroundDrawableLeft;
                                    }
                                    i9 = l47Var.c;
                                    if (i9 != 0 || backgroundDrawableRight > i9) {
                                        l47Var.c = backgroundDrawableRight;
                                    }
                                } else {
                                    if (z2) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                    }
                                    l47Var.k = wb2Var3.L2();
                                    l47Var.l = wb2Var3.K2();
                                    backgroundDrawableLeft = wb2Var3.getBackgroundDrawableLeft() + wb2Var3.getLeft();
                                    backgroundDrawableRight = wb2Var3.getBackgroundDrawableRight() + wb2Var3.getLeft();
                                    int backgroundDrawableTop2 = wb2Var3.getBackgroundDrawableTop() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                    int backgroundDrawableBottom2 = wb2Var3.getBackgroundDrawableBottom() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                    if ((wb2Var3.getCurrentPosition().l & i) == 0) {
                                    }
                                    i4 = backgroundDrawableTop2;
                                    if ((wb2Var3.getCurrentPosition().l & 8) == 0) {
                                    }
                                    i5 = backgroundDrawableBottom2;
                                    if (wb2Var3.La) {
                                    }
                                    i6 = l47Var.b;
                                    if (i6 != 0) {
                                    }
                                    l47Var.b = i4;
                                    i7 = l47Var.d;
                                    if (i7 != 0) {
                                    }
                                    l47Var.d = i5;
                                    i8 = l47Var.a;
                                    if (i8 != 0) {
                                    }
                                    l47Var.a = backgroundDrawableLeft;
                                    i9 = l47Var.c;
                                    if (i9 != 0) {
                                    }
                                    l47Var.c = backgroundDrawableRight;
                                }
                            }
                        }
                    }
                    i15++;
                    i2 = 2;
                    f = 0.0f;
                }
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    m47 m47Var2 = (m47) arrayList2.get(i16);
                    l47 l47Var2 = m47Var2.m;
                    float U1 = l47Var2.m.U1(z);
                    float f5 = l47Var2.a + U1 + l47Var2.e;
                    float f6 = l47Var2.b + l47Var2.f;
                    float f7 = l47Var2.g + l47Var2.c + U1;
                    float f8 = l47Var2.d + l47Var2.h;
                    if (!l47Var2.j) {
                        f6 += l47Var2.m.getTranslationY();
                        f8 += l47Var2.m.getTranslationY();
                    }
                    boolean z3 = (l47Var2.m.getScaleX() == 1.0f && l47Var2.m.getScaleY() == 1.0f) ? false : z;
                    if (z3) {
                        canvas.save();
                        arrayList = arrayList2;
                        canvas.scale(l47Var2.m.getScaleX(), l47Var2.m.getScaleY(), bp1.z(f7, f5, f2, f5), bp1.z(f8, f6, f2, f6));
                    } else {
                        arrayList = arrayList2;
                    }
                    float f9 = f2;
                    float f10 = f6;
                    float f11 = f8;
                    l47Var2.m.K0(canvas, (int) f5, (int) f6, (int) f7, (int) f8, l47Var2.k, l47Var2.l, false, 0);
                    l47Var2.m = null;
                    l47Var2.o = m47Var2.c;
                    if (z3) {
                        canvas.restore();
                        for (int i17 = 0; i17 < childCount; i17++) {
                            View childAt4 = getChildAt(i17);
                            if (childAt4 instanceof wb2) {
                                wb2 wb2Var4 = (wb2) childAt4;
                                if (wb2Var4.getCurrentMessagesGroup() == m47Var2) {
                                    int left = wb2Var4.getLeft();
                                    int top = wb2Var4.getTop();
                                    childAt4.setPivotX(((f7 - f5) / f9) + (f5 - left));
                                    childAt4.setPivotY(((f11 - f10) / f9) + (f10 - top));
                                }
                            }
                        }
                    }
                    i16++;
                    arrayList2 = arrayList;
                    f2 = f9;
                    z = true;
                }
                i3 = 2;
            } else {
                i3 = i2;
            }
            i14++;
            i2 = i3;
            f2 = f2;
            z = true;
            f = 0.0f;
            i = 4;
        }
        super.dispatchDraw(canvas);
        ArrayList arrayList3 = this.f3;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i18 = 0; i18 < size; i18++) {
                wb2 wb2Var5 = (wb2) arrayList3.get(i18);
                canvas.save();
                canvas.translate(wb2Var5.U1(false) + wb2Var5.getLeft(), wb2Var5.getY());
                wb2Var5.A1(wb2Var5.a() ? wb2Var5.getAlpha() : 1.0f, canvas, true);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.g3;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i19 = 0; i19 < size2; i19++) {
                wb2 wb2Var6 = (wb2) arrayList4.get(i19);
                float U12 = wb2Var6.U1(false) + wb2Var6.getLeft();
                float y2 = wb2Var6.getY();
                float alpha = wb2Var6.a() ? wb2Var6.getAlpha() : 1.0f;
                canvas.save();
                canvas.translate(U12, y2);
                wb2Var6.setInvalidatesParent(true);
                wb2Var6.h1(canvas, alpha);
                wb2Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.h3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i20 = 0; i20 < size3; i20++) {
                wb2 wb2Var7 = (wb2) arrayList5.get(i20);
                boolean z4 = wb2Var7.getCurrentPosition() != null && (wb2Var7.getCurrentPosition().l & 1) == 0;
                float alpha2 = wb2Var7.a() ? wb2Var7.getAlpha() : 1.0f;
                float U13 = wb2Var7.U1(false) + wb2Var7.getLeft();
                float y3 = wb2Var7.getY();
                canvas.save();
                m47 currentMessagesGroup3 = wb2Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null) {
                    l47 l47Var3 = currentMessagesGroup3.m;
                    if (l47Var3.j) {
                        float U14 = wb2Var7.U1(true);
                        float f12 = l47Var3.a + U14 + l47Var3.e;
                        float f13 = l47Var3.b + l47Var3.f;
                        float f14 = l47Var3.c + U14 + l47Var3.g;
                        float f15 = l47Var3.d + l47Var3.h;
                        if (!l47Var3.j) {
                            f13 += wb2Var7.getTranslationY();
                            f15 += wb2Var7.getTranslationY();
                        }
                        canvas.clipRect(f12 + hl.L(8.0f), f13 + hl.L(8.0f), f14 - hl.L(8.0f), f15 - hl.L(8.0f));
                    }
                }
                if (wb2Var7.getTransitionParams().w0) {
                    canvas.translate(U13, y3);
                    wb2Var7.setInvalidatesParent(true);
                    wb2Var7.Q0(alpha2, canvas, z4);
                    wb2Var7.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            f3 = 8.0f;
            arrayList5.clear();
        } else {
            f3 = 8.0f;
        }
        ArrayList arrayList6 = this.i3;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i21 = 0; i21 < size4; i21++) {
                wb2 wb2Var8 = (wb2) arrayList6.get(i21);
                if (wb2Var8.getCurrentPosition() == null || (wb2Var8.getCurrentPosition().l & 1) != 0) {
                    float alpha3 = wb2Var8.a() ? wb2Var8.getAlpha() : 1.0f;
                    float U15 = wb2Var8.U1(false) + wb2Var8.getLeft();
                    float y4 = wb2Var8.getY();
                    canvas.save();
                    m47 currentMessagesGroup4 = wb2Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null) {
                        l47 l47Var4 = currentMessagesGroup4.m;
                        if (l47Var4.j) {
                            float U16 = wb2Var8.U1(true);
                            float f16 = l47Var4.a + U16 + l47Var4.e;
                            float f17 = l47Var4.b + l47Var4.f;
                            float f18 = l47Var4.c + U16 + l47Var4.g;
                            float f19 = l47Var4.d + l47Var4.h;
                            if (!l47Var4.j) {
                                f17 += wb2Var8.getTranslationY();
                                f19 += wb2Var8.getTranslationY();
                            }
                            canvas.clipRect(f16 + hl.L(f3), f17 + hl.L(f3), f18 - hl.L(f3), f19 - hl.L(f3));
                        }
                    }
                    if (wb2Var8.getTransitionParams().w0) {
                        canvas.translate(U15, y4);
                        wb2Var8.setInvalidatesParent(true);
                        wb2Var8.q1(canvas, alpha3, null);
                        wb2Var8.V0(canvas, alpha3);
                        wb2Var8.setInvalidatesParent(false);
                        canvas.restore();
                    }
                }
            }
            arrayList6.clear();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x00fd, code lost:
    
        if ((r11 & 1) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00b0, code lost:
    
        if (r7.c != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r5.getTransitionParams().x0 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        wb2 wb2Var;
        dl1 dl1Var;
        float f;
        ImageReceiver avatarImage;
        float f2;
        boolean z;
        int i;
        int b;
        int b2;
        int i2;
        vw7 vw7Var = this.k3;
        m47 m47Var = vw7Var.v0;
        if (view instanceof wb2) {
            wb2Var = (wb2) view;
        } else {
            if (view instanceof dl1) {
                dl1Var = (dl1) view;
                wb2Var = null;
                boolean drawChild = super.drawChild(canvas, view, j);
                if (wb2Var == null && wb2Var.l2()) {
                    canvas.save();
                    canvas.translate(wb2Var.getX(), wb2Var.getY() + wb2Var.getPaddingTop());
                    wb2Var.i1(canvas);
                    canvas.restore();
                } else if (dl1Var != null) {
                    canvas.save();
                    canvas.translate(dl1Var.getX(), dl1Var.getY());
                    dl1Var.K(canvas);
                    canvas.restore();
                }
                float f3 = 0.0f;
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (wb2Var != null) {
                    wb2Var.S0(canvas);
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.restore();
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (wb2Var != null) {
                    wb2Var.getMessageObject();
                    j47 currentPosition = wb2Var.getCurrentPosition();
                    if (currentPosition != null) {
                        if (!currentPosition.h) {
                            if (currentPosition.a == 0) {
                            }
                            if (currentPosition == null || wb2Var.getTransitionParams().D0 || wb2Var.getTransitionParams().x0) {
                                if (currentPosition != null || (currentPosition.l & wb2Var.G()) != 0) {
                                    this.h3.add(wb2Var);
                                }
                                if (currentPosition != null) {
                                    int i3 = currentPosition.l;
                                    if ((i3 & 8) != 0) {
                                    }
                                }
                                this.i3.add(wb2Var);
                            }
                            avatarImage = wb2Var.getAvatarImage();
                            if (avatarImage != null) {
                                boolean z2 = this.W1 || (m47Var != null && m47Var.m.j);
                                int top = z2 ? view.getTop() : (int) view.getY();
                                if (!wb2Var.n() || (b2 = vw7Var.t0.U(view).b()) < 0) {
                                    f2 = 0.0f;
                                    z = true;
                                } else {
                                    if (m47Var == null || currentPosition == null) {
                                        f2 = 0.0f;
                                        z = true;
                                        i2 = b2 - 1;
                                    } else {
                                        int indexOf = m47Var.e.indexOf(currentPosition);
                                        int size = m47Var.e.size();
                                        z = true;
                                        if ((currentPosition.l & 8) == 0) {
                                            i2 = b2 - 1;
                                            int i4 = indexOf + 1;
                                            while (i4 < size) {
                                                f2 = f3;
                                                if (((j47) m47Var.e.get(i4)).c > currentPosition.d) {
                                                    break;
                                                }
                                                i2--;
                                                i4++;
                                                f3 = f2;
                                            }
                                        } else {
                                            i2 = (b2 - size) + indexOf;
                                        }
                                        f2 = f3;
                                    }
                                    if (L(i2) != null) {
                                        if (view.getTranslationY() != f2) {
                                            canvas.restore();
                                        }
                                        avatarImage.v0(false, false);
                                        return drawChild;
                                    }
                                }
                                float checkBoxTranslation = wb2Var.getCheckBoxTranslation() + wb2Var.getSlidingOffsetX();
                                int top2 = (int) ((z2 ? view.getTop() : view.getY()) + wb2Var.getLayoutHeight() + wb2Var.getTransitionParams().j0);
                                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                                boolean z3 = ((wb2Var.n1 || wb2Var.o1) && checkBoxTranslation == f2) ? z : false;
                                if (wb2Var.M2() || wb2Var.getTransitionParams().l2) {
                                    if (wb2Var.getTransitionParams().l2) {
                                        float f4 = wb2Var.getTransitionParams().L1;
                                        if (!wb2Var.M2()) {
                                            f4 = 1.0f - f4;
                                        }
                                        top2 = (int) qd4.A(1.0f, f4, Math.min(top2, measuredHeight), top2 * f4);
                                    }
                                } else if (top2 > measuredHeight) {
                                    top2 = measuredHeight;
                                }
                                if (!z2 && view.getTranslationY() != f2) {
                                    canvas.restore();
                                }
                                if (wb2Var.j() && (b = U(view).b()) >= 0) {
                                    int i5 = 0;
                                    while (i5 < 20) {
                                        i5++;
                                        if (m47Var != null && currentPosition != null) {
                                            int indexOf2 = m47Var.e.indexOf(currentPosition);
                                            if (indexOf2 < 0) {
                                                break;
                                            }
                                            m47Var.e.size();
                                            if ((currentPosition.l & 4) == 0) {
                                                b++;
                                                int i6 = indexOf2 - 1;
                                                while (i6 >= 0) {
                                                    i = top2;
                                                    if (((j47) m47Var.e.get(i6)).d < currentPosition.c) {
                                                        break;
                                                    }
                                                    b++;
                                                    i6--;
                                                    top2 = i;
                                                }
                                            } else {
                                                b = b + indexOf2 + 1;
                                            }
                                            i = top2;
                                        } else {
                                            i = top2;
                                            b++;
                                        }
                                        f89 L = L(b);
                                        if (L == null) {
                                            break;
                                        }
                                        View view2 = L.a;
                                        top = view2.getTop();
                                        if (!(view2 instanceof wb2)) {
                                            break;
                                        }
                                        wb2Var = (wb2) view2;
                                        float checkBoxTranslation2 = wb2Var.getCheckBoxTranslation() + wb2Var.getSlidingOffsetX();
                                        if (z3 && checkBoxTranslation2 > f2) {
                                            checkBoxTranslation = checkBoxTranslation2;
                                        }
                                        if (!wb2Var.j()) {
                                            break;
                                        }
                                        top2 = i;
                                    }
                                }
                                i = top2;
                                int L2 = i - hl.L(42.0f) < top ? hl.L(42.0f) + top : i;
                                if (!wb2Var.n()) {
                                    int bottom = z2 ? wb2Var.getBottom() : (int) (wb2Var.getY() + wb2Var.getMeasuredHeight() + wb2Var.getTransitionParams().j0);
                                    if (L2 > bottom) {
                                        L2 = bottom;
                                    }
                                }
                                canvas.save();
                                if (checkBoxTranslation != f2) {
                                    canvas.translate(checkBoxTranslation, f2);
                                }
                                if (wb2Var.getCurrentMessagesGroup() != null && wb2Var.getCurrentMessagesGroup().m.j) {
                                    L2 = (int) (L2 - wb2Var.getTranslationY());
                                }
                                avatarImage.M0 = L2 - hl.L(40.0f);
                                if (wb2Var.a()) {
                                    avatarImage.setAlpha(wb2Var.getAlpha());
                                    canvas.scale(wb2Var.getScaleX(), wb2Var.getScaleY(), wb2Var.getPivotX() + wb2Var.getX(), wb2Var.getY() + (wb2Var.getHeight() >> 1));
                                } else {
                                    avatarImage.setAlpha(1.0f);
                                }
                                avatarImage.v0(z, false);
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                if (z2) {
                                    f = 0.0f;
                                } else {
                                    f = 0.0f;
                                    if (view.getTranslationY() != 0.0f) {
                                        canvas.save();
                                    }
                                }
                                if (view.getTranslationY() != f) {
                                    canvas.restore();
                                }
                                return drawChild;
                            }
                        }
                    }
                    if (currentPosition == null || currentPosition.h) {
                        this.f3.add(wb2Var);
                    }
                    if ((currentPosition == null || (currentPosition.a == 0 && currentPosition.c == 0)) && wb2Var.k2()) {
                        this.g3.add(wb2Var);
                    }
                    if (currentPosition == null) {
                    }
                    if (currentPosition != null) {
                    }
                    this.h3.add(wb2Var);
                    if (currentPosition != null) {
                    }
                    this.i3.add(wb2Var);
                    avatarImage = wb2Var.getAvatarImage();
                    if (avatarImage != null) {
                    }
                }
                f = 0.0f;
                if (view.getTranslationY() != f) {
                }
                return drawChild;
            }
            wb2Var = null;
        }
        dl1Var = null;
        boolean drawChild2 = super.drawChild(canvas, view, j);
        if (wb2Var == null) {
        }
        if (dl1Var != null) {
        }
        float f32 = 0.0f;
        if (view.getTranslationY() != 0.0f) {
        }
        if (wb2Var != null) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (wb2Var != null) {
        }
        f = 0.0f;
        if (view.getTranslationY() != f) {
        }
        return drawChild2;
    }
}
