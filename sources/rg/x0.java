package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.internal.play_billing.k3;
import ei.r5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class x0 extends mm0 {
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public final /* synthetic */ r5 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(r5 r5Var, Context context, e1 e1Var) {
        super(context, e1Var);
        this.d3 = r5Var;
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
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
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup2 = t1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                        MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                        lb0 backgroundDrawable = t1Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f || t1Var.f3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                            int y3 = (int) t1Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i13 = t1Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = t1Var.getMeasuredHeight() + y3;
                                long j10 = 0;
                                float f12 = 0.0f;
                                for (int i15 = 0; i15 < childCount; i15++) {
                                    View childAt2 = getChildAt(i15);
                                    if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt2;
                                        if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            lb0 backgroundDrawable2 = t1Var2.getBackgroundDrawable();
                                            int min = Math.min(y3, (int) t1Var2.getY());
                                            int max = Math.max(measuredHeight, t1Var2.getMeasuredHeight() + ((int) t1Var2.getY()));
                                            long j11 = backgroundDrawable2.l;
                                            if (j11 > j10) {
                                                float x10 = t1Var2.getX() + backgroundDrawable2.h;
                                                f12 = t1Var2.getY() + backgroundDrawable2.i;
                                                f7 = x10;
                                                j10 = j11;
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
                            backgroundDrawable.a.setColor(k6.w0(k6.Hc, this.n2));
                            backgroundDrawable.setBounds(0, y3, getMeasuredWidth(), i16);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        groupedMessages = currentMessagesGroup2;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.J()) {
                        canvas.save();
                        canvas.translate(v0Var.getX(), v0Var.getY() + v0Var.getPaddingTop());
                        canvas.scale(v0Var.getScaleX(), v0Var.getScaleY(), v0Var.getMeasuredWidth() / 2.0f, v0Var.getMeasuredHeight() / 2.0f);
                        v0Var.z(canvas, true);
                        v0Var.B(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i14++;
        }
        int i17 = 0;
        while (i17 < 3) {
            ArrayList arrayList = this.c3;
            arrayList.clear();
            if (i17 != i11 || this.V1) {
                int i18 = 0;
                while (i18 < childCount) {
                    View childAt3 = getChildAt(i18);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && t1Var3.getVisibility() != i10 && t1Var3.getVisibility() != 8 && (currentMessagesGroup = t1Var3.getCurrentMessagesGroup()) != null && ((i17 != 0 || currentMessagesGroup.messages.size() != z10) && ((i17 != z10 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i17 != 0 || !t1Var3.getMessageObject().deleted) && ((i17 != z10 || t1Var3.getMessageObject().deleted) && ((i17 != i11 || t1Var3.oc) && (i17 == i11 || !t1Var3.oc))))))) {
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
                            currentMessagesGroup.transitionParams.pinnedTop = t1Var3.m3();
                            currentMessagesGroup.transitionParams.pinnedBotton = t1Var3.l3();
                            int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                            int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                            int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                            int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                            if ((t1Var3.getCurrentPosition().flags & i10) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            int i19 = backgroundDrawableTop;
                            if ((t1Var3.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                            }
                            int i20 = backgroundDrawableBottom;
                            if (t1Var3.oc) {
                                currentMessagesGroup.transitionParams.cell = t1Var3;
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
                    float D2 = groupedMessages2.transitionParams.cell.D2(z10);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f13 = transitionParams3.left + D2 + transitionParams3.offsetLeft;
                    float f14 = transitionParams3.top + transitionParams3.offsetTop;
                    float f15 = transitionParams3.offsetRight + transitionParams3.right + D2;
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
                        canvas.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), k3.z(f15, f13, f10, f13), k3.z(f18, f17, f10, f17));
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    ArrayList arrayList2 = arrayList;
                    float f19 = f10;
                    transitionParams4.cell.A1(canvas, (int) f13, (int) f17, (int) f15, (int) f18, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                    MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                    transitionParams5.cell = null;
                    transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z11) {
                        canvas.restore();
                        for (int i26 = 0; i26 < childCount; i26++) {
                            View childAt4 = getChildAt(i26);
                            if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt4;
                                if (t1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = t1Var4.getLeft();
                                    int top = t1Var4.getTop();
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
        ArrayList arrayList3 = this.Y2;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i27 = 0; i27 < size; i27++) {
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) arrayList3.get(i27);
                canvas.save();
                canvas.translate(t1Var5.D2(false) + t1Var5.getLeft(), t1Var5.getY());
                t1Var5.l2(t1Var5.c() ? t1Var5.getAlpha() : 1.0f, canvas, z12);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.Z2;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i28 = 0; i28 < size2; i28++) {
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) arrayList4.get(i28);
                float D22 = t1Var6.D2(false) + t1Var6.getLeft();
                float y10 = t1Var6.getY();
                float alpha = t1Var6.c() ? t1Var6.getAlpha() : 1.0f;
                canvas.save();
                canvas.translate(D22, y10);
                t1Var6.setInvalidatesParent(z12);
                t1Var6.V1(canvas, alpha);
                t1Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.a3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            int i29 = 0;
            boolean z13 = z12;
            while (i29 < size3) {
                org.telegram.ui.Cells.t1 t1Var7 = (org.telegram.ui.Cells.t1) arrayList5.get(i29);
                boolean z14 = (t1Var7.getCurrentPosition() == null || (t1Var7.getCurrentPosition().flags & z13) != 0) ? false : z13;
                float alpha2 = t1Var7.c() ? t1Var7.getAlpha() : 1.0f;
                float D23 = t1Var7.D2(false) + t1Var7.getLeft();
                float y11 = t1Var7.getY();
                canvas.save();
                MessageObject.GroupedMessages currentMessagesGroup3 = t1Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null && currentMessagesGroup3.transitionParams.backgroundChangeBounds) {
                    float D24 = t1Var7.D2(z13);
                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup3.transitionParams;
                    float f20 = transitionParams6.left + D24 + transitionParams6.offsetLeft;
                    float f21 = transitionParams6.top + transitionParams6.offsetTop;
                    float f22 = transitionParams6.right + D24 + transitionParams6.offsetRight;
                    float f23 = transitionParams6.bottom + transitionParams6.offsetBottom;
                    if (!transitionParams6.backgroundChangeBounds) {
                        f21 += t1Var7.getTranslationY();
                        f23 += t1Var7.getTranslationY();
                    }
                    canvas.clipRect(f20 + AndroidUtilities.dp(8.0f), f21 + AndroidUtilities.dp(8.0f), f22 - AndroidUtilities.dp(8.0f), f23 - AndroidUtilities.dp(8.0f));
                }
                if (t1Var7.getTransitionParams().v0) {
                    canvas.translate(D23, y11);
                    t1Var7.setInvalidatesParent(true);
                    t1Var7.H1(alpha2, canvas, z14);
                    t1Var7.setInvalidatesParent(false);
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
        ArrayList arrayList6 = this.b3;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i30 = 0; i30 < size4; i30++) {
                org.telegram.ui.Cells.t1 t1Var8 = (org.telegram.ui.Cells.t1) arrayList6.get(i30);
                if (t1Var8.getCurrentPosition() == null || (t1Var8.getCurrentPosition().flags & 1) != 0) {
                    float alpha3 = t1Var8.c() ? t1Var8.getAlpha() : 1.0f;
                    float D25 = t1Var8.D2(false) + t1Var8.getLeft();
                    float y12 = t1Var8.getY();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup4 = t1Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null && currentMessagesGroup4.transitionParams.backgroundChangeBounds) {
                        float D26 = t1Var8.D2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup4.transitionParams;
                        float f24 = transitionParams7.left + D26 + transitionParams7.offsetLeft;
                        float f25 = transitionParams7.top + transitionParams7.offsetTop;
                        float f26 = transitionParams7.right + D26 + transitionParams7.offsetRight;
                        float f27 = transitionParams7.bottom + transitionParams7.offsetBottom;
                        if (!transitionParams7.backgroundChangeBounds) {
                            f25 += t1Var8.getTranslationY();
                            f27 += t1Var8.getTranslationY();
                        }
                        canvas.clipRect(f24 + AndroidUtilities.dp(f11), f25 + AndroidUtilities.dp(f11), f26 - AndroidUtilities.dp(f11), f27 - AndroidUtilities.dp(f11));
                    }
                    if (t1Var8.getTransitionParams().v0) {
                        canvas.translate(D25, y12);
                        t1Var8.setInvalidatesParent(true);
                        t1Var8.c2(canvas, alpha3, null);
                        t1Var8.M1(canvas, alpha3);
                        t1Var8.setInvalidatesParent(false);
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
    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.v0 v0Var;
        float f7;
        float f10;
        boolean z10;
        int i10;
        int b10;
        int b11;
        int i11;
        r5 r5Var = this.d3;
        MessageObject.GroupedMessages groupedMessages = r5Var.t0;
        org.telegram.ui.Cells.t1 t1Var = null;
        if (view instanceof org.telegram.ui.Cells.t1) {
            t1Var = (org.telegram.ui.Cells.t1) view;
            v0Var = null;
        } else {
            v0Var = view instanceof org.telegram.ui.Cells.v0 ? (org.telegram.ui.Cells.v0) view : null;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (t1Var != null && t1Var.T2()) {
            canvas.save();
            canvas.translate(t1Var.getX(), t1Var.getY() + t1Var.getPaddingTop());
            t1Var.W1(canvas);
            canvas.restore();
        } else if (v0Var != null) {
            canvas.save();
            canvas.translate(v0Var.getX(), v0Var.getY());
            v0Var.A(canvas);
            canvas.restore();
        }
        float f11 = 0.0f;
        if (view.getTranslationY() != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, view.getTranslationY());
        }
        if (t1Var != null) {
            t1Var.J1(canvas);
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
                        this.Y2.add(t1Var);
                    }
                    if ((currentPosition == null || (currentPosition.minX == 0 && currentPosition.minY == 0)) && t1Var.S2()) {
                        this.Z2.add(t1Var);
                    }
                }
                if (currentPosition != null || t1Var.getTransitionParams().C0 || t1Var.getTransitionParams().w0) {
                    if (currentPosition == null || (currentPosition.flags & t1Var.s0()) != 0) {
                        this.a3.add(t1Var);
                    }
                    if (currentPosition != null) {
                        int i12 = currentPosition.flags;
                        if ((i12 & 8) != 0) {
                        }
                    }
                    this.b3.add(t1Var);
                }
            }
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null) {
                boolean z11 = this.V1 || (groupedMessages != null && groupedMessages.transitionParams.backgroundChangeBounds);
                int top = z11 ? view.getTop() : (int) view.getY();
                if (!t1Var.i() || (b11 = r5Var.r0.T(view).b()) < 0) {
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
                float checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                int top2 = (int) ((z11 ? view.getTop() : view.getY()) + t1Var.getLayoutHeight() + t1Var.getTransitionParams().i0);
                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                boolean z12 = ((t1Var.m1 || t1Var.n1) && checkBoxTranslation == f10) ? z10 : false;
                if (t1Var.n3() || t1Var.getTransitionParams().k2) {
                    if (t1Var.getTransitionParams().k2) {
                        float f12 = t1Var.getTransitionParams().K1;
                        if (!t1Var.n3()) {
                            f12 = 1.0f - f12;
                        }
                        top2 = (int) k3.y(1.0f, f12, Math.min(top2, measuredHeight), top2 * f12);
                    }
                } else if (top2 > measuredHeight) {
                    top2 = measuredHeight;
                }
                if (!z11 && view.getTranslationY() != f10) {
                    canvas.restore();
                }
                if (t1Var.g() && (b10 = T(view).b()) >= 0) {
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
                        s4.b1 K = K(b10);
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
                        if (z12 && checkBoxTranslation2 > f10) {
                            checkBoxTranslation = checkBoxTranslation2;
                        }
                        if (!t1Var.g()) {
                            break;
                        }
                        top2 = i10;
                    }
                }
                i10 = top2;
                int dp = i10 - AndroidUtilities.dp(42.0f) < top ? AndroidUtilities.dp(42.0f) + top : i10;
                if (!t1Var.i()) {
                    int bottom = z11 ? t1Var.getBottom() : (int) (t1Var.getY() + t1Var.getMeasuredHeight() + t1Var.getTransitionParams().i0);
                    if (dp > bottom) {
                        dp = bottom;
                    }
                }
                canvas.save();
                if (checkBoxTranslation != f10) {
                    canvas.translate(checkBoxTranslation, f10);
                }
                if (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                    dp = (int) (dp - t1Var.getTranslationY());
                }
                avatarImage.setImageY(dp - AndroidUtilities.dp(40.0f));
                if (t1Var.c()) {
                    avatarImage.setAlpha(t1Var.getAlpha());
                    canvas.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX() + t1Var.getX(), t1Var.getY() + (t1Var.getHeight() >> 1));
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
