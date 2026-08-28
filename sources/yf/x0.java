package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import kh.s5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x0 extends wk0 {
    public final ArrayList T2;
    public final ArrayList U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final /* synthetic */ s5 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(s5 s5Var, Context context, com.google.firebase.messaging.m mVar) {
        super(context, mVar);
        this.Y2 = s5Var;
        this.T2 = new ArrayList();
        this.U2 = new ArrayList();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i9;
        int i10;
        float f11;
        boolean z10;
        float f12;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i11;
        canvas.save();
        this.C1.setEmpty();
        int childCount = getChildCount();
        int i12 = 0;
        MessageObject.GroupedMessages groupedMessages = null;
        while (true) {
            f10 = 0.0f;
            i9 = 4;
            i10 = 2;
            f11 = 2.0f;
            z10 = true;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 4) {
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup2 = t1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                        MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                        y90 backgroundDrawable = t1Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f || t1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                            int y10 = (int) t1Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i11 = t1Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = t1Var.getMeasuredHeight() + y10;
                                long j10 = 0;
                                float f13 = 0.0f;
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = getChildAt(i13);
                                    if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt2;
                                        if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            y90 backgroundDrawable2 = t1Var2.getBackgroundDrawable();
                                            int min = Math.min(y10, (int) t1Var2.getY());
                                            int max = Math.max(measuredHeight, t1Var2.getMeasuredHeight() + ((int) t1Var2.getY()));
                                            long j11 = backgroundDrawable2.l;
                                            if (j11 > j10) {
                                                float x10 = t1Var2.getX() + backgroundDrawable2.h;
                                                f13 = t1Var2.getY() + backgroundDrawable2.i;
                                                f10 = x10;
                                                j10 = j11;
                                            }
                                            y10 = min;
                                            measuredHeight = max;
                                        }
                                    }
                                }
                                backgroundDrawable.j = f10;
                                backgroundDrawable.k = f13 - y10;
                                i11 = measuredHeight - y10;
                            }
                            int i14 = i11 + y10;
                            canvas.clipRect(0, y10, getMeasuredWidth(), i14);
                            backgroundDrawable.b = null;
                            backgroundDrawable.a.setColor(f6.v0(f6.Hc, this.l2));
                            backgroundDrawable.setBounds(0, y10, getMeasuredWidth(), i14);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        groupedMessages = currentMessagesGroup2;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.I()) {
                        canvas.save();
                        canvas.translate(w0Var.getX(), w0Var.getY() + w0Var.getPaddingTop());
                        canvas.scale(w0Var.getScaleX(), w0Var.getScaleY(), w0Var.getMeasuredWidth() / 2.0f, w0Var.getMeasuredHeight() / 2.0f);
                        w0Var.y(canvas, true);
                        w0Var.A(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i12++;
        }
        int i15 = 0;
        while (i15 < 3) {
            ArrayList arrayList = this.X2;
            arrayList.clear();
            if (i15 != i10 || this.T1) {
                int i16 = 0;
                while (i16 < childCount) {
                    View childAt3 = getChildAt(i16);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && t1Var3.getVisibility() != i9 && t1Var3.getVisibility() != 8 && (currentMessagesGroup = t1Var3.getCurrentMessagesGroup()) != null && ((i15 != 0 || currentMessagesGroup.messages.size() != z10) && ((i15 != z10 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i15 != 0 || !t1Var3.getMessageObject().deleted) && ((i15 != z10 || t1Var3.getMessageObject().deleted) && ((i15 != i10 || t1Var3.kc) && (i15 == i10 || !t1Var3.kc))))))) {
                            if (!arrayList.contains(currentMessagesGroup)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                transitionParams.left = 0;
                                transitionParams.top = 0;
                                transitionParams.right = 0;
                                transitionParams.bottom = 0;
                                transitionParams.pinnedBotton = false;
                                transitionParams.pinnedTop = false;
                                transitionParams.cell = t1Var3;
                                arrayList.add(currentMessagesGroup);
                            }
                            currentMessagesGroup.transitionParams.pinnedTop = t1Var3.n3();
                            currentMessagesGroup.transitionParams.pinnedBotton = t1Var3.m3();
                            int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                            int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                            int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                            int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                            if ((t1Var3.getCurrentPosition().flags & i9) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            int i17 = backgroundDrawableTop;
                            if ((t1Var3.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                            }
                            int i18 = backgroundDrawableBottom;
                            if (t1Var3.kc) {
                                currentMessagesGroup.transitionParams.cell = t1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            int i19 = transitionParams2.top;
                            if (i19 == 0 || i17 < i19) {
                                transitionParams2.top = i17;
                            }
                            int i20 = transitionParams2.bottom;
                            if (i20 == 0 || i18 > i20) {
                                transitionParams2.bottom = i18;
                            }
                            int i21 = transitionParams2.left;
                            if (i21 == 0 || backgroundDrawableLeft < i21) {
                                transitionParams2.left = backgroundDrawableLeft;
                            }
                            int i22 = transitionParams2.right;
                            if (i22 == 0 || backgroundDrawableRight > i22) {
                                transitionParams2.right = backgroundDrawableRight;
                            }
                            i16++;
                            i10 = 2;
                            f10 = 0.0f;
                        }
                    }
                    i16++;
                    i10 = 2;
                    f10 = 0.0f;
                }
                int i23 = 0;
                while (i23 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i23);
                    float E2 = groupedMessages2.transitionParams.cell.E2(z10);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f14 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                    float f15 = transitionParams3.top + transitionParams3.offsetTop;
                    float f16 = transitionParams3.offsetRight + transitionParams3.right + E2;
                    float f17 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        f15 += transitionParams3.cell.getTranslationY();
                        f17 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f18 = f15;
                    float f19 = f17;
                    boolean z11 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                    if (z11) {
                        canvas.save();
                        canvas.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), e2.c.A(f16, f14, f11, f14), e2.c.A(f19, f18, f11, f18));
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    ArrayList arrayList2 = arrayList;
                    transitionParams4.cell.B1(canvas, (int) f14, (int) f18, (int) f16, (int) f19, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                    MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                    transitionParams5.cell = null;
                    transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z11) {
                        canvas.restore();
                        for (int i24 = 0; i24 < childCount; i24++) {
                            View childAt4 = getChildAt(i24);
                            if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt4;
                                if (t1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = t1Var4.getLeft();
                                    int top = t1Var4.getTop();
                                    childAt4.setPivotX(((f16 - f14) / 2.0f) + (f14 - left));
                                    childAt4.setPivotY(((f19 - f18) / 2.0f) + (f18 - top));
                                }
                            }
                        }
                    }
                    i23++;
                    arrayList = arrayList2;
                    f11 = 2.0f;
                    z10 = true;
                }
            }
            i15++;
            i10 = 2;
            f11 = 2.0f;
            z10 = true;
            f10 = 0.0f;
            i9 = 4;
        }
        boolean z12 = 1;
        super.dispatchDraw(canvas);
        ArrayList arrayList3 = this.T2;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i25 = 0; i25 < size; i25++) {
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) arrayList3.get(i25);
                canvas.save();
                canvas.translate(t1Var5.E2(false) + t1Var5.getLeft(), t1Var5.getY());
                t1Var5.m2(t1Var5.a() ? t1Var5.getAlpha() : 1.0f, canvas, true);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.U2;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i26 = 0; i26 < size2; i26++) {
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) arrayList4.get(i26);
                float E22 = t1Var6.E2(false) + t1Var6.getLeft();
                float y11 = t1Var6.getY();
                float alpha = t1Var6.a() ? t1Var6.getAlpha() : 1.0f;
                canvas.save();
                canvas.translate(E22, y11);
                t1Var6.setInvalidatesParent(true);
                t1Var6.W1(canvas, alpha);
                t1Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.V2;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            int i27 = 0;
            while (i27 < size3) {
                org.telegram.ui.Cells.t1 t1Var7 = (org.telegram.ui.Cells.t1) arrayList5.get(i27);
                boolean z13 = t1Var7.getCurrentPosition() != null && (t1Var7.getCurrentPosition().flags & z12) == 0;
                float alpha2 = t1Var7.a() ? t1Var7.getAlpha() : 1.0f;
                float E23 = t1Var7.E2(false) + t1Var7.getLeft();
                float y12 = t1Var7.getY();
                canvas.save();
                MessageObject.GroupedMessages currentMessagesGroup3 = t1Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null && currentMessagesGroup3.transitionParams.backgroundChangeBounds) {
                    float E24 = t1Var7.E2(z12);
                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup3.transitionParams;
                    float f20 = transitionParams6.left + E24 + transitionParams6.offsetLeft;
                    float f21 = transitionParams6.top + transitionParams6.offsetTop;
                    float f22 = transitionParams6.right + E24 + transitionParams6.offsetRight;
                    float f23 = transitionParams6.bottom + transitionParams6.offsetBottom;
                    if (!transitionParams6.backgroundChangeBounds) {
                        f21 += t1Var7.getTranslationY();
                        f23 += t1Var7.getTranslationY();
                    }
                    canvas.clipRect(f20 + AndroidUtilities.dp(8.0f), f21 + AndroidUtilities.dp(8.0f), f22 - AndroidUtilities.dp(8.0f), f23 - AndroidUtilities.dp(8.0f));
                }
                if (t1Var7.getTransitionParams().v0) {
                    canvas.translate(E23, y12);
                    t1Var7.setInvalidatesParent(true);
                    t1Var7.I1(alpha2, canvas, z13);
                    t1Var7.setInvalidatesParent(false);
                    canvas.restore();
                }
                i27++;
                z12 = 1;
            }
            f12 = 8.0f;
            arrayList5.clear();
        } else {
            f12 = 8.0f;
        }
        ArrayList arrayList6 = this.W2;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i28 = 0; i28 < size4; i28++) {
                org.telegram.ui.Cells.t1 t1Var8 = (org.telegram.ui.Cells.t1) arrayList6.get(i28);
                if (t1Var8.getCurrentPosition() == null || (t1Var8.getCurrentPosition().flags & 1) != 0) {
                    float alpha3 = t1Var8.a() ? t1Var8.getAlpha() : 1.0f;
                    float E25 = t1Var8.E2(false) + t1Var8.getLeft();
                    float y13 = t1Var8.getY();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup4 = t1Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null && currentMessagesGroup4.transitionParams.backgroundChangeBounds) {
                        float E26 = t1Var8.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup4.transitionParams;
                        float f24 = transitionParams7.left + E26 + transitionParams7.offsetLeft;
                        float f25 = transitionParams7.top + transitionParams7.offsetTop;
                        float f26 = transitionParams7.right + E26 + transitionParams7.offsetRight;
                        float f27 = transitionParams7.bottom + transitionParams7.offsetBottom;
                        if (!transitionParams7.backgroundChangeBounds) {
                            f25 += t1Var8.getTranslationY();
                            f27 += t1Var8.getTranslationY();
                        }
                        canvas.clipRect(f24 + AndroidUtilities.dp(f12), f25 + AndroidUtilities.dp(f12), f26 - AndroidUtilities.dp(f12), f27 - AndroidUtilities.dp(f12));
                    }
                    if (t1Var8.getTransitionParams().v0) {
                        canvas.translate(E25, y13);
                        t1Var8.setInvalidatesParent(true);
                        t1Var8.d2(canvas, alpha3, null);
                        t1Var8.N1(canvas, alpha3);
                        t1Var8.setInvalidatesParent(false);
                        canvas.restore();
                    }
                }
            }
            arrayList6.clear();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0100, code lost:
    
        if ((r10 & 1) != 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035a  */
    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.w0 w0Var;
        float f10;
        float f11;
        int i9;
        int b10;
        int b11;
        int i10;
        s5 s5Var = this.Y2;
        MessageObject.GroupedMessages groupedMessages = s5Var.p0;
        org.telegram.ui.Cells.t1 t1Var = null;
        if (view instanceof org.telegram.ui.Cells.t1) {
            t1Var = (org.telegram.ui.Cells.t1) view;
            w0Var = null;
        } else {
            w0Var = view instanceof org.telegram.ui.Cells.w0 ? (org.telegram.ui.Cells.w0) view : null;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (t1Var != null && t1Var.U2()) {
            canvas.save();
            canvas.translate(t1Var.getX(), t1Var.getY() + t1Var.getPaddingTop());
            t1Var.X1(canvas);
            canvas.restore();
        } else if (w0Var != null) {
            canvas.save();
            canvas.translate(w0Var.getX(), w0Var.getY());
            w0Var.z(canvas);
            canvas.restore();
        }
        if (view.getTranslationY() != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, view.getTranslationY());
        }
        if (t1Var != null) {
            t1Var.K1(canvas);
        }
        if (view.getTranslationY() != 0.0f) {
            canvas.restore();
        }
        if (view.getTranslationY() != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, view.getTranslationY());
        }
        if (t1Var != null) {
            t1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
            if (currentPosition != null || t1Var.getTransitionParams().w0) {
                if (currentPosition == null || currentPosition.last || (currentPosition.minX == 0 && currentPosition.minY == 0)) {
                    if (currentPosition == null || currentPosition.last) {
                        this.T2.add(t1Var);
                    }
                    if ((currentPosition == null || (currentPosition.minX == 0 && currentPosition.minY == 0)) && t1Var.T2()) {
                        this.U2.add(t1Var);
                    }
                }
                if (currentPosition != null || t1Var.getTransitionParams().C0 || t1Var.getTransitionParams().w0) {
                    if (currentPosition == null || (currentPosition.flags & t1Var.s0()) != 0) {
                        this.V2.add(t1Var);
                    }
                    if (currentPosition != null) {
                        int i11 = currentPosition.flags;
                        if ((i11 & 8) != 0) {
                        }
                    }
                    this.W2.add(t1Var);
                }
            }
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null) {
                boolean z10 = this.T1 || (groupedMessages != null && groupedMessages.transitionParams.backgroundChangeBounds);
                int top = z10 ? view.getTop() : (int) view.getY();
                if (!t1Var.j() || (b11 = s5Var.n0.T(view).b()) < 0) {
                    f11 = 0.0f;
                } else {
                    if (groupedMessages == null || currentPosition == null) {
                        f11 = 0.0f;
                        i10 = b11 - 1;
                    } else {
                        int indexOf = groupedMessages.posArray.indexOf(currentPosition);
                        int size = groupedMessages.posArray.size();
                        if ((currentPosition.flags & 8) != 0) {
                            i10 = (b11 - size) + indexOf;
                        } else {
                            i10 = b11 - 1;
                            for (int i12 = indexOf + 1; i12 < size; i12++) {
                                f11 = 0.0f;
                                if (groupedMessages.posArray.get(i12).minY > currentPosition.maxY) {
                                    break;
                                }
                                i10--;
                            }
                        }
                        f11 = 0.0f;
                    }
                    if (K(i10) != null) {
                        if (view.getTranslationY() != f11) {
                            canvas.restore();
                        }
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                }
                float checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                int top2 = (int) ((z10 ? view.getTop() : view.getY()) + t1Var.getLayoutHeight() + t1Var.getTransitionParams().i0);
                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                boolean z11 = (t1Var.i1 || t1Var.j1) && checkBoxTranslation == f11;
                if (t1Var.o3() || t1Var.getTransitionParams().k2) {
                    if (t1Var.getTransitionParams().k2) {
                        float f12 = t1Var.getTransitionParams().K1;
                        if (!t1Var.o3()) {
                            f12 = 1.0f - f12;
                        }
                        top2 = (int) e2.c.z(1.0f, f12, Math.min(top2, measuredHeight), top2 * f12);
                    }
                } else if (top2 > measuredHeight) {
                    top2 = measuredHeight;
                }
                if (!z10 && view.getTranslationY() != f11) {
                    canvas.restore();
                }
                if (t1Var.h() && (b10 = T(view).b()) >= 0) {
                    int i13 = 0;
                    while (i13 < 20) {
                        i13++;
                        if (groupedMessages == null || currentPosition == null) {
                            i9 = top2;
                            b10++;
                        } else {
                            int indexOf2 = groupedMessages.posArray.indexOf(currentPosition);
                            if (indexOf2 < 0) {
                                break;
                            }
                            groupedMessages.posArray.size();
                            if ((currentPosition.flags & 4) != 0) {
                                b10 = b10 + indexOf2 + 1;
                            } else {
                                b10++;
                                int i14 = indexOf2 - 1;
                                while (i14 >= 0) {
                                    i9 = top2;
                                    if (groupedMessages.posArray.get(i14).maxY < currentPosition.minY) {
                                        break;
                                    }
                                    b10++;
                                    i14--;
                                    top2 = i9;
                                }
                            }
                            i9 = top2;
                        }
                        f2.q1 K = K(b10);
                        if (K == null) {
                            break;
                        }
                        View view2 = K.a;
                        top = view2.getTop();
                        if (!(view2 instanceof org.telegram.ui.Cells.t1)) {
                            break;
                        }
                        t1Var = (org.telegram.ui.Cells.t1) view2;
                        float checkBoxTranslation2 = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                        if (z11 && checkBoxTranslation2 > f11) {
                            checkBoxTranslation = checkBoxTranslation2;
                        }
                        if (!t1Var.h()) {
                            break;
                        }
                        top2 = i9;
                    }
                }
                i9 = top2;
                int dp = i9 - AndroidUtilities.dp(42.0f) < top ? AndroidUtilities.dp(42.0f) + top : i9;
                if (!t1Var.j()) {
                    int bottom = z10 ? t1Var.getBottom() : (int) (t1Var.getY() + t1Var.getMeasuredHeight() + t1Var.getTransitionParams().i0);
                    if (dp > bottom) {
                        dp = bottom;
                    }
                }
                canvas.save();
                if (checkBoxTranslation != f11) {
                    canvas.translate(checkBoxTranslation, 0.0f);
                }
                if (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                    dp = (int) (dp - t1Var.getTranslationY());
                }
                avatarImage.setImageY(dp - AndroidUtilities.dp(40.0f));
                if (t1Var.a()) {
                    avatarImage.setAlpha(t1Var.getAlpha());
                    canvas.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX() + t1Var.getX(), t1Var.getY() + (t1Var.getHeight() >> 1));
                } else {
                    avatarImage.setAlpha(1.0f);
                }
                avatarImage.setVisible(true, false);
                avatarImage.draw(canvas);
                canvas.restore();
                if (!z10) {
                    f10 = 0.0f;
                    if (view.getTranslationY() != 0.0f) {
                        canvas.save();
                    }
                    if (view.getTranslationY() != f10) {
                        canvas.restore();
                    }
                    return drawChild;
                }
            }
        }
        f10 = 0.0f;
        if (view.getTranslationY() != f10) {
        }
        return drawChild;
    }
}
