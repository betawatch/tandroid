package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ci.b6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rb0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x0 extends qm0 {
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final /* synthetic */ b6 a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(b6 b6Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar);
        this.a3 = b6Var;
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        float f10;
        boolean z10;
        float f11;
        int i12;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i13;
        canvas.save();
        this.E1.setEmpty();
        int childCount = getChildCount();
        int i14 = 0;
        MessageObject.GroupedMessages groupedMessages = null;
        while (true) {
            f7 = 0.0f;
            i10 = 4;
            i11 = 2;
            f10 = 2.0f;
            z10 = true;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 4) {
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup2 = u1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                        MessageObject.GroupedMessagePosition currentPosition = u1Var.getCurrentPosition();
                        rb0 backgroundDrawable = u1Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f || u1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                            int y3 = (int) u1Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i13 = u1Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = u1Var.getMeasuredHeight() + y3;
                                long j3 = 0;
                                float f12 = 0.0f;
                                for (int i15 = 0; i15 < childCount; i15++) {
                                    View childAt2 = getChildAt(i15);
                                    if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt2;
                                        if (u1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            rb0 backgroundDrawable2 = u1Var2.getBackgroundDrawable();
                                            int min = Math.min(y3, (int) u1Var2.getY());
                                            int max = Math.max(measuredHeight, u1Var2.getMeasuredHeight() + ((int) u1Var2.getY()));
                                            long j10 = backgroundDrawable2.l;
                                            if (j10 > j3) {
                                                float x10 = u1Var2.getX() + backgroundDrawable2.h;
                                                f12 = u1Var2.getY() + backgroundDrawable2.i;
                                                f7 = x10;
                                                j3 = j10;
                                            }
                                            y3 = min;
                                            measuredHeight = max;
                                        }
                                    }
                                }
                                backgroundDrawable.j = f7;
                                backgroundDrawable.k = f12 - y3;
                                i13 = measuredHeight - y3;
                            }
                            int i16 = i13 + y3;
                            canvas.clipRect(0, y3, getMeasuredWidth(), i16);
                            backgroundDrawable.b = null;
                            backgroundDrawable.a.setColor(i6.w0(i6.Hc, this.n2));
                            backgroundDrawable.setBounds(0, y3, getMeasuredWidth(), i16);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        groupedMessages = currentMessagesGroup2;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.K()) {
                        canvas.save();
                        canvas.translate(w0Var.getX(), w0Var.getY() + w0Var.getPaddingTop());
                        canvas.scale(w0Var.getScaleX(), w0Var.getScaleY(), w0Var.getMeasuredWidth() / 2.0f, w0Var.getMeasuredHeight() / 2.0f);
                        w0Var.B(canvas, true);
                        w0Var.D(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i14++;
        }
        int i17 = 0;
        while (i17 < 3) {
            ArrayList arrayList = this.Z2;
            arrayList.clear();
            if (i17 != i11 || this.V1) {
                int i18 = 0;
                while (i18 < childCount) {
                    View childAt3 = getChildAt(i18);
                    if (childAt3 instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && u1Var3.getVisibility() != i10 && u1Var3.getVisibility() != 8 && (currentMessagesGroup = u1Var3.getCurrentMessagesGroup()) != null && ((i17 != 0 || currentMessagesGroup.messages.size() != z10) && ((i17 != z10 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i17 != 0 || !u1Var3.getMessageObject().deleted) && ((i17 != z10 || u1Var3.getMessageObject().deleted) && ((i17 != i11 || u1Var3.oc) && (i17 == i11 || !u1Var3.oc))))))) {
                            if (!arrayList.contains(currentMessagesGroup)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                transitionParams.left = 0;
                                transitionParams.top = 0;
                                transitionParams.right = 0;
                                transitionParams.bottom = 0;
                                transitionParams.pinnedBotton = false;
                                transitionParams.pinnedTop = false;
                                transitionParams.cell = u1Var3;
                                arrayList.add(currentMessagesGroup);
                            }
                            currentMessagesGroup.transitionParams.pinnedTop = u1Var3.n3();
                            currentMessagesGroup.transitionParams.pinnedBotton = u1Var3.m3();
                            int backgroundDrawableLeft = u1Var3.getBackgroundDrawableLeft() + u1Var3.getLeft();
                            int backgroundDrawableRight = u1Var3.getBackgroundDrawableRight() + u1Var3.getLeft();
                            int backgroundDrawableTop = u1Var3.getBackgroundDrawableTop() + u1Var3.getPaddingTop() + u1Var3.getTop();
                            int backgroundDrawableBottom = u1Var3.getBackgroundDrawableBottom() + u1Var3.getPaddingTop() + u1Var3.getTop();
                            if ((u1Var3.getCurrentPosition().flags & i10) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            int i19 = backgroundDrawableTop;
                            if ((u1Var3.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                            }
                            int i20 = backgroundDrawableBottom;
                            if (u1Var3.oc) {
                                currentMessagesGroup.transitionParams.cell = u1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            int i21 = transitionParams2.top;
                            if (i21 == 0 || i19 < i21) {
                                transitionParams2.top = i19;
                            }
                            int i22 = transitionParams2.bottom;
                            if (i22 == 0 || i20 > i22) {
                                transitionParams2.bottom = i20;
                            }
                            int i23 = transitionParams2.left;
                            if (i23 == 0 || backgroundDrawableLeft < i23) {
                                transitionParams2.left = backgroundDrawableLeft;
                            }
                            int i24 = transitionParams2.right;
                            if (i24 == 0 || backgroundDrawableRight > i24) {
                                transitionParams2.right = backgroundDrawableRight;
                            }
                            i18++;
                            i11 = 2;
                            f7 = 0.0f;
                        }
                    }
                    i18++;
                    i11 = 2;
                    f7 = 0.0f;
                }
                int i25 = 0;
                while (i25 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i25);
                    float E2 = groupedMessages2.transitionParams.cell.E2(z10);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f13 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                    float f14 = transitionParams3.top + transitionParams3.offsetTop;
                    float f15 = transitionParams3.offsetRight + transitionParams3.right + E2;
                    float f16 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        f14 += transitionParams3.cell.getTranslationY();
                        f16 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f17 = f14;
                    float f18 = f16;
                    boolean z11 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : z10;
                    if (z11) {
                        canvas.save();
                        canvas.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.gms.internal.vision.e2.z(f15, f13, f10, f13), com.google.android.gms.internal.vision.e2.z(f18, f17, f10, f17));
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    ArrayList arrayList2 = arrayList;
                    float f19 = f10;
                    transitionParams4.cell.B1(canvas, (int) f13, (int) f17, (int) f15, (int) f18, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                    MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                    transitionParams5.cell = null;
                    transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z11) {
                        canvas.restore();
                        for (int i26 = 0; i26 < childCount; i26++) {
                            View childAt4 = getChildAt(i26);
                            if (childAt4 instanceof org.telegram.ui.Cells.u1) {
                                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) childAt4;
                                if (u1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = u1Var4.getLeft();
                                    int top = u1Var4.getTop();
                                    childAt4.setPivotX(((f15 - f13) / f19) + (f13 - left));
                                    childAt4.setPivotY(((f18 - f17) / f19) + (f17 - top));
                                }
                            }
                        }
                    }
                    i25++;
                    z10 = true;
                    f10 = f19;
                    arrayList = arrayList2;
                }
                i12 = 2;
            } else {
                i12 = i11;
            }
            i17++;
            z10 = z10;
            i11 = i12;
            f10 = f10;
            f7 = 0.0f;
            i10 = 4;
        }
        boolean z12 = z10;
        super.dispatchDraw(canvas);
        ArrayList arrayList3 = this.V2;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i27 = 0; i27 < size; i27++) {
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) arrayList3.get(i27);
                canvas.save();
                canvas.translate(u1Var5.E2(false) + u1Var5.getLeft(), u1Var5.getY());
                u1Var5.m2(u1Var5.a() ? u1Var5.getAlpha() : 1.0f, canvas, z12);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.W2;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i28 = 0; i28 < size2; i28++) {
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) arrayList4.get(i28);
                float E22 = u1Var6.E2(false) + u1Var6.getLeft();
                float y10 = u1Var6.getY();
                float alpha = u1Var6.a() ? u1Var6.getAlpha() : 1.0f;
                canvas.save();
                canvas.translate(E22, y10);
                u1Var6.setInvalidatesParent(z12);
                u1Var6.W1(canvas, alpha);
                u1Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.X2;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            int i29 = 0;
            boolean z13 = z12;
            while (i29 < size3) {
                org.telegram.ui.Cells.u1 u1Var7 = (org.telegram.ui.Cells.u1) arrayList5.get(i29);
                boolean z14 = (u1Var7.getCurrentPosition() == null || (u1Var7.getCurrentPosition().flags & z13) != 0) ? false : z13;
                float alpha2 = u1Var7.a() ? u1Var7.getAlpha() : 1.0f;
                float E23 = u1Var7.E2(false) + u1Var7.getLeft();
                float y11 = u1Var7.getY();
                canvas.save();
                MessageObject.GroupedMessages currentMessagesGroup3 = u1Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null && currentMessagesGroup3.transitionParams.backgroundChangeBounds) {
                    float E24 = u1Var7.E2(z13);
                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup3.transitionParams;
                    float f20 = transitionParams6.left + E24 + transitionParams6.offsetLeft;
                    float f21 = transitionParams6.top + transitionParams6.offsetTop;
                    float f22 = transitionParams6.right + E24 + transitionParams6.offsetRight;
                    float f23 = transitionParams6.bottom + transitionParams6.offsetBottom;
                    if (!transitionParams6.backgroundChangeBounds) {
                        f21 += u1Var7.getTranslationY();
                        f23 += u1Var7.getTranslationY();
                    }
                    canvas.clipRect(f20 + AndroidUtilities.dp(8.0f), f21 + AndroidUtilities.dp(8.0f), f22 - AndroidUtilities.dp(8.0f), f23 - AndroidUtilities.dp(8.0f));
                }
                if (u1Var7.getTransitionParams().v0) {
                    canvas.translate(E23, y11);
                    u1Var7.setInvalidatesParent(true);
                    u1Var7.I1(alpha2, canvas, z14);
                    u1Var7.setInvalidatesParent(false);
                    canvas.restore();
                }
                i29++;
                z13 = 1;
            }
            f11 = 8.0f;
            arrayList5.clear();
        } else {
            f11 = 8.0f;
        }
        ArrayList arrayList6 = this.Y2;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i30 = 0; i30 < size4; i30++) {
                org.telegram.ui.Cells.u1 u1Var8 = (org.telegram.ui.Cells.u1) arrayList6.get(i30);
                if (u1Var8.getCurrentPosition() == null || (u1Var8.getCurrentPosition().flags & 1) != 0) {
                    float alpha3 = u1Var8.a() ? u1Var8.getAlpha() : 1.0f;
                    float E25 = u1Var8.E2(false) + u1Var8.getLeft();
                    float y12 = u1Var8.getY();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup4 = u1Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null && currentMessagesGroup4.transitionParams.backgroundChangeBounds) {
                        float E26 = u1Var8.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup4.transitionParams;
                        float f24 = transitionParams7.left + E26 + transitionParams7.offsetLeft;
                        float f25 = transitionParams7.top + transitionParams7.offsetTop;
                        float f26 = transitionParams7.right + E26 + transitionParams7.offsetRight;
                        float f27 = transitionParams7.bottom + transitionParams7.offsetBottom;
                        if (!transitionParams7.backgroundChangeBounds) {
                            f25 += u1Var8.getTranslationY();
                            f27 += u1Var8.getTranslationY();
                        }
                        canvas.clipRect(f24 + AndroidUtilities.dp(f11), f25 + AndroidUtilities.dp(f11), f26 - AndroidUtilities.dp(f11), f27 - AndroidUtilities.dp(f11));
                    }
                    if (u1Var8.getTransitionParams().v0) {
                        canvas.translate(E25, y12);
                        u1Var8.setInvalidatesParent(true);
                        u1Var8.d2(canvas, alpha3, null);
                        u1Var8.N1(canvas, alpha3);
                        u1Var8.setInvalidatesParent(false);
                        canvas.restore();
                    }
                }
            }
            arrayList6.clear();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0100, code lost:
    
        if ((r10 & 1) != 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035f  */
    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.w0 w0Var;
        float f7;
        float f10;
        boolean z10;
        int i10;
        int b10;
        int b11;
        int i11;
        b6 b6Var = this.a3;
        MessageObject.GroupedMessages groupedMessages = b6Var.t0;
        org.telegram.ui.Cells.u1 u1Var = null;
        if (view instanceof org.telegram.ui.Cells.u1) {
            u1Var = (org.telegram.ui.Cells.u1) view;
            w0Var = null;
        } else {
            w0Var = view instanceof org.telegram.ui.Cells.w0 ? (org.telegram.ui.Cells.w0) view : null;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (u1Var != null && u1Var.U2()) {
            canvas.save();
            canvas.translate(u1Var.getX(), u1Var.getY() + u1Var.getPaddingTop());
            u1Var.X1(canvas);
            canvas.restore();
        } else if (w0Var != null) {
            canvas.save();
            canvas.translate(w0Var.getX(), w0Var.getY());
            w0Var.C(canvas);
            canvas.restore();
        }
        float f11 = 0.0f;
        if (view.getTranslationY() != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, view.getTranslationY());
        }
        if (u1Var != null) {
            u1Var.K1(canvas);
        }
        if (view.getTranslationY() != 0.0f) {
            canvas.restore();
        }
        if (view.getTranslationY() != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, view.getTranslationY());
        }
        if (u1Var != null) {
            u1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition = u1Var.getCurrentPosition();
            if (currentPosition != null || u1Var.getTransitionParams().w0) {
                if (currentPosition == null || currentPosition.last || (currentPosition.minX == 0 && currentPosition.minY == 0)) {
                    if (currentPosition == null || currentPosition.last) {
                        this.V2.add(u1Var);
                    }
                    if ((currentPosition == null || (currentPosition.minX == 0 && currentPosition.minY == 0)) && u1Var.T2()) {
                        this.W2.add(u1Var);
                    }
                }
                if (currentPosition != null || u1Var.getTransitionParams().C0 || u1Var.getTransitionParams().w0) {
                    if (currentPosition == null || (currentPosition.flags & u1Var.t0()) != 0) {
                        this.X2.add(u1Var);
                    }
                    if (currentPosition != null) {
                        int i12 = currentPosition.flags;
                        if ((i12 & 8) != 0) {
                        }
                    }
                    this.Y2.add(u1Var);
                }
            }
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                boolean z11 = this.V1 || (groupedMessages != null && groupedMessages.transitionParams.backgroundChangeBounds);
                int top = z11 ? view.getTop() : (int) view.getY();
                if (!u1Var.j() || (b11 = b6Var.r0.T(view).b()) < 0) {
                    f10 = 0.0f;
                    z10 = true;
                } else {
                    if (groupedMessages == null || currentPosition == null) {
                        f10 = 0.0f;
                        z10 = true;
                        i11 = b11 - 1;
                    } else {
                        int indexOf = groupedMessages.posArray.indexOf(currentPosition);
                        int size = groupedMessages.posArray.size();
                        z10 = true;
                        if ((currentPosition.flags & 8) != 0) {
                            i11 = (b11 - size) + indexOf;
                        } else {
                            i11 = b11 - 1;
                            int i13 = indexOf + 1;
                            while (i13 < size) {
                                f10 = f11;
                                if (groupedMessages.posArray.get(i13).minY > currentPosition.maxY) {
                                    break;
                                }
                                i11--;
                                i13++;
                                f11 = f10;
                            }
                        }
                        f10 = f11;
                    }
                    if (K(i11) != null) {
                        if (view.getTranslationY() != f10) {
                            canvas.restore();
                        }
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                }
                float checkBoxTranslation = u1Var.getCheckBoxTranslation() + u1Var.getSlidingOffsetX();
                int top2 = (int) ((z11 ? view.getTop() : view.getY()) + u1Var.getLayoutHeight() + u1Var.getTransitionParams().i0);
                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                boolean z12 = ((u1Var.m1 || u1Var.n1) && checkBoxTranslation == f10) ? z10 : false;
                if (u1Var.o3() || u1Var.getTransitionParams().k2) {
                    if (u1Var.getTransitionParams().k2) {
                        float f12 = u1Var.getTransitionParams().K1;
                        if (!u1Var.o3()) {
                            f12 = 1.0f - f12;
                        }
                        top2 = (int) com.google.android.gms.internal.vision.e2.y(1.0f, f12, Math.min(top2, measuredHeight), top2 * f12);
                    }
                } else if (top2 > measuredHeight) {
                    top2 = measuredHeight;
                }
                if (!z11 && view.getTranslationY() != f10) {
                    canvas.restore();
                }
                if (u1Var.h() && (b10 = T(view).b()) >= 0) {
                    int i14 = 0;
                    while (i14 < 20) {
                        i14++;
                        if (groupedMessages == null || currentPosition == null) {
                            i10 = top2;
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
                                int i15 = indexOf2 - 1;
                                while (i15 >= 0) {
                                    i10 = top2;
                                    if (groupedMessages.posArray.get(i15).maxY < currentPosition.minY) {
                                        break;
                                    }
                                    b10++;
                                    i15--;
                                    top2 = i10;
                                }
                            }
                            i10 = top2;
                        }
                        s4.d1 K = K(b10);
                        if (K == null) {
                            break;
                        }
                        View view2 = K.a;
                        top = view2.getTop();
                        if (!(view2 instanceof org.telegram.ui.Cells.u1)) {
                            break;
                        }
                        u1Var = (org.telegram.ui.Cells.u1) view2;
                        float checkBoxTranslation2 = u1Var.getCheckBoxTranslation() + u1Var.getSlidingOffsetX();
                        if (z12 && checkBoxTranslation2 > f10) {
                            checkBoxTranslation = checkBoxTranslation2;
                        }
                        if (!u1Var.h()) {
                            break;
                        }
                        top2 = i10;
                    }
                }
                i10 = top2;
                int dp = i10 - AndroidUtilities.dp(42.0f) < top ? AndroidUtilities.dp(42.0f) + top : i10;
                if (!u1Var.j()) {
                    int bottom = z11 ? u1Var.getBottom() : (int) (u1Var.getY() + u1Var.getMeasuredHeight() + u1Var.getTransitionParams().i0);
                    if (dp > bottom) {
                        dp = bottom;
                    }
                }
                canvas.save();
                if (checkBoxTranslation != f10) {
                    canvas.translate(checkBoxTranslation, f10);
                }
                if (u1Var.getCurrentMessagesGroup() != null && u1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                    dp = (int) (dp - u1Var.getTranslationY());
                }
                avatarImage.setImageY(dp - AndroidUtilities.dp(40.0f));
                if (u1Var.a()) {
                    avatarImage.setAlpha(u1Var.getAlpha());
                    canvas.scale(u1Var.getScaleX(), u1Var.getScaleY(), u1Var.getPivotX() + u1Var.getX(), u1Var.getY() + (u1Var.getHeight() >> 1));
                } else {
                    avatarImage.setAlpha(1.0f);
                }
                avatarImage.setVisible(z10, false);
                avatarImage.draw(canvas);
                canvas.restore();
                if (z11) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.0f;
                    if (view.getTranslationY() != 0.0f) {
                        canvas.save();
                    }
                }
                if (view.getTranslationY() != f7) {
                    canvas.restore();
                }
                return drawChild;
            }
        }
        f7 = 0.0f;
        if (view.getTranslationY() != f7) {
        }
        return drawChild;
    }
}
