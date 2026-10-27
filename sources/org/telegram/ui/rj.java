package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rj extends di.p5 {
    public final o1.j A3;
    public final ac.a B3;
    public final o1.j C3;
    public boolean D3;
    public final Path E3;
    public boolean F3;
    public int G3;
    public final /* synthetic */ wn H3;
    public int h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public int n3;
    public int o3;
    public int p3;
    public long q3;
    public float r3;
    public float s3;
    public boolean t3;
    public final float u3;
    public final Paint v3;
    public final Paint w3;
    public final ac.a x3;
    public final o1.j y3;
    public final ac.a z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(wn wnVar, Context context, un unVar) {
        super(wnVar, context, unVar, 1);
        this.H3 = wnVar;
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList(10);
        this.u3 = 2000.0f;
        Paint paint = new Paint(1);
        this.v3 = paint;
        Paint paint2 = new Paint(1);
        this.w3 = paint2;
        ac.a aVar = new ac.a(0.0f);
        this.x3 = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.h = 0.0f;
        jVar.g = 2000.0f;
        jVar.u = d3.l(0.0f, 1500.0f, 1.0f);
        final int i10 = 0;
        jVar.b(new o1.g(this) { // from class: org.telegram.ui.qj
            public final /* synthetic */ rj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                switch (i10) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.y3 = jVar;
        ac.a aVar2 = new ac.a(0.0f);
        this.z3 = aVar2;
        o1.j jVar2 = new o1.j(aVar2);
        jVar2.h = 0.0f;
        jVar2.u = d3.l(0.0f, 400.0f, 0.5f);
        final int i11 = 1;
        jVar2.b(new o1.g(this) { // from class: org.telegram.ui.qj
            public final /* synthetic */ rj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                switch (i11) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.A3 = jVar2;
        ac.a aVar3 = new ac.a(0.0f);
        this.B3 = aVar3;
        o1.j jVar3 = new o1.j(aVar3);
        jVar3.h = 0.0f;
        jVar3.u = d3.l(0.0f, 200.0f, 1.0f);
        final int i12 = 2;
        jVar3.b(new o1.g(this) { // from class: org.telegram.ui.qj
            public final /* synthetic */ rj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                switch (i12) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.C3 = jVar3;
        this.E3 = new Path();
        this.G3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x03bf, code lost:
    
        if (r2.messages.size() != 1) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(Canvas canvas, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        wn wnVar;
        float f11;
        int i12;
        float f12;
        int i13;
        int i14;
        float f13;
        boolean z10;
        int i15;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i16;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        rj rjVar = this;
        Canvas canvas2 = canvas;
        int childCount = rjVar.getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        int i19 = 0;
        while (true) {
            i10 = 8;
            i11 = 2;
            f7 = 0.0f;
            f10 = 2.0f;
            wnVar = rjVar.H3;
            if (i19 >= childCount) {
                f11 = 1.0f;
                break;
            }
            View childAt = rjVar.getChildAt(i19);
            f11 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!wn.h2(wnVar, childAt, rectF)) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.t1) childAt).a(canvas2);
                        canvas2.restore();
                    } else if (wnVar.A0.n && (childAt instanceof org.telegram.ui.Cells.g0)) {
                        float measuredHeight3 = ((((rjVar.getMeasuredHeight() - wnVar.I9) - wnVar.Ra) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + wnVar.I9;
                        if (!((org.telegram.ui.Cells.g0) childAt).I && !wnVar.x0.V1) {
                            if (childAt.getTop() > measuredHeight3) {
                                childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.cb) {
                        float measuredHeight4 = ((((rjVar.getMeasuredHeight() - wnVar.I9) - wnVar.Ra) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + wnVar.I9;
                        if (!((org.telegram.ui.Cells.cb) childAt).N && !wnVar.x0.V1) {
                            if (childAt.getTop() > measuredHeight4) {
                                childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else {
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                            MessageObject.GroupedMessages currentMessagesGroup2 = s1Var.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                                MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                                org.telegram.ui.Components.jb0 backgroundDrawable = s1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f || s1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                                    boolean z12 = s1Var.f8;
                                    org.telegram.ui.ActionBar.u6 u6Var = rjVar.n2;
                                    z11 = true;
                                    if (z12 || s1Var.g8) {
                                        i16 = i19;
                                        if (currentPosition == null) {
                                            Paint X0 = rjVar.X0("paintChatMessageBackgroundSelected");
                                            un unVar = wnVar.ua;
                                            if ((unVar == null || !unVar.q) && X0 != null) {
                                                if (wnVar.I9()) {
                                                    measuredHeight = wnVar.x0.getTop();
                                                } else {
                                                    kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                                    measuredHeight = kVar.getMeasuredHeight();
                                                }
                                                float backgroundTranslationY = measuredHeight - wnVar.j1.getBackgroundTranslationY();
                                                int backgroundSizeY = wnVar.j1.getBackgroundSizeY();
                                                un unVar2 = wnVar.ua;
                                                if (unVar2 != null) {
                                                    unVar2.b(s1Var.getX(), backgroundTranslationY, rjVar.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.y6.q(s1Var.getX(), backgroundTranslationY, rjVar.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                X0 = org.telegram.ui.ActionBar.y6.a2;
                                                X0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Hc, u6Var));
                                            }
                                            Paint paint = X0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, s1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (s1Var.getAlpha() * s1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, s1Var.getTop(), rjVar.getMeasuredWidth(), s1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y3 = (int) s1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            i17 = s1Var.getMeasuredHeight();
                                            i16 = i19;
                                        } else {
                                            int measuredHeight5 = s1Var.getMeasuredHeight() + y3;
                                            long j10 = 0;
                                            float f14 = 0.0f;
                                            int i20 = 0;
                                            while (i20 < childCount) {
                                                View childAt2 = rjVar.getChildAt(i20);
                                                int i21 = i19;
                                                if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt2;
                                                    if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.jb0 backgroundDrawable2 = s1Var2.getBackgroundDrawable();
                                                        i18 = i20;
                                                        y3 = Math.min(y3, (int) s1Var2.getY());
                                                        measuredHeight5 = Math.max(measuredHeight5, s1Var2.getMeasuredHeight() + ((int) s1Var2.getY()));
                                                        long j11 = backgroundDrawable2.l;
                                                        if (j11 > j10) {
                                                            j10 = j11;
                                                            f7 = s1Var2.getX() + backgroundDrawable2.h;
                                                            f14 = s1Var2.getY() + backgroundDrawable2.i;
                                                        }
                                                        i20 = i18 + 1;
                                                        i19 = i21;
                                                    }
                                                }
                                                i18 = i20;
                                                i20 = i18 + 1;
                                                i19 = i21;
                                            }
                                            i16 = i19;
                                            backgroundDrawable.j = f7;
                                            backgroundDrawable.k = f14 - y3;
                                            i17 = measuredHeight5 - y3;
                                        }
                                        int i22 = i17 + y3;
                                        canvas2.clipRect(0, y3, rjVar.getMeasuredWidth(), i22);
                                        Paint X02 = rjVar.X0("paintChatMessageBackgroundSelected");
                                        un unVar3 = wnVar.ua;
                                        if (unVar3 == null || unVar3.q || X02 == null) {
                                            backgroundDrawable.b = null;
                                            backgroundDrawable.a.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Hc, u6Var));
                                        } else {
                                            backgroundDrawable.b = X02;
                                            if (wnVar.I9()) {
                                                measuredHeight2 = wnVar.x0.getTop();
                                            } else {
                                                kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                                measuredHeight2 = kVar2.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY2 = measuredHeight2 - wnVar.j1.getBackgroundTranslationY();
                                            int backgroundSizeY2 = wnVar.j1.getBackgroundSizeY();
                                            un unVar4 = wnVar.ua;
                                            if (unVar4 != null) {
                                                unVar4.b(s1Var.getX(), backgroundTranslationY2, rjVar.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.y6.q(s1Var.getX(), backgroundTranslationY2, rjVar.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y3, rjVar.getMeasuredWidth(), i22);
                                        backgroundDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                } else {
                                    i16 = i19;
                                    z11 = true;
                                }
                                groupedMessages = currentMessagesGroup2;
                            } else {
                                i16 = i19;
                                z11 = true;
                            }
                            if (wnVar.Z8 != s1Var && currentMessagesGroup2 == null && s1Var.C1()) {
                                canvas2.save();
                                canvas2.translate(s1Var.getX(), s1Var.getY() + s1Var.getPaddingTop());
                                if (s1Var.getScaleX() != 1.0f) {
                                    canvas2.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX(), s1Var.getHeight() >> 1);
                                }
                                s1Var.D1(canvas2, z11, false);
                                canvas2.restore();
                            }
                        } else {
                            i16 = i19;
                            if (childAt instanceof org.telegram.ui.Cells.v0) {
                                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                                if (v0Var.J()) {
                                    canvas2.save();
                                    canvas2.translate(v0Var.getX(), v0Var.getY() + v0Var.getPaddingTop());
                                    canvas2.scale(v0Var.getScaleX(), v0Var.getScaleY(), v0Var.getMeasuredWidth() / 2.0f, v0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(wnVar.e9() / 2.0f, 0.0f);
                                    v0Var.y(canvas2, true);
                                    v0Var.B(canvas2, true);
                                    canvas2.restore();
                                }
                            }
                        }
                        i19 = i16 + 1;
                    }
                }
            }
            i16 = i19;
            i19 = i16 + 1;
        }
        View view = wnVar.Z8;
        MessageObject.GroupedMessages currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getCurrentMessagesGroup() : null;
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList = rjVar.m3;
            arrayList.clear();
            if (i23 != i11 || wnVar.x0.V1) {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = wnVar.x0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= wnVar.x0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && s1Var3.getVisibility() != i10 && (currentMessagesGroup = s1Var3.getCurrentMessagesGroup()) != null) {
                            int i25 = i23 == 0 ? 1 : 1;
                            if ((i23 != i25 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i23 != 0 || !s1Var3.getMessageObject().deleted) && ((i23 != 1 || s1Var3.getMessageObject().deleted) && ((i23 != i11 || s1Var3.oc) && (i23 == i11 || !s1Var3.oc))))) {
                                if (!arrayList.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                    transitionParams.left = 0;
                                    transitionParams.top = 0;
                                    transitionParams.right = 0;
                                    transitionParams.bottom = 0;
                                    transitionParams.pinnedBotton = false;
                                    transitionParams.pinnedTop = false;
                                    transitionParams.cell = s1Var3;
                                    arrayList.add(currentMessagesGroup);
                                }
                                i15 = i10;
                                currentMessagesGroup.transitionParams.pinnedTop = s1Var3.n3();
                                currentMessagesGroup.transitionParams.pinnedBotton = s1Var3.m3();
                                int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                                int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                                int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                if ((s1Var3.getCurrentPosition().flags & 4) == 0) {
                                    backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                                }
                                int i26 = backgroundDrawableTop;
                                if ((s1Var3.getCurrentPosition().flags & 8) == 0) {
                                    backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                                }
                                int i27 = backgroundDrawableBottom;
                                if (s1Var3.oc) {
                                    currentMessagesGroup.transitionParams.cell = s1Var3;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                int i28 = transitionParams2.top;
                                if (i28 == 0 || i26 < i28) {
                                    transitionParams2.top = i26;
                                }
                                int i29 = transitionParams2.bottom;
                                if (i29 == 0 || i27 > i29) {
                                    transitionParams2.bottom = i27;
                                }
                                int i30 = transitionParams2.left;
                                if (i30 == 0 || backgroundDrawableLeft < i30) {
                                    transitionParams2.left = backgroundDrawableLeft;
                                }
                                int i31 = transitionParams2.right;
                                if (i31 == 0 || backgroundDrawableRight > i31) {
                                    transitionParams2.right = backgroundDrawableRight;
                                }
                                i24++;
                                i10 = i15;
                                i11 = 2;
                                f7 = 0.0f;
                            }
                        }
                    }
                    i15 = i10;
                    i24++;
                    i10 = i15;
                    i11 = 2;
                    f7 = 0.0f;
                }
                i12 = i10;
                int i32 = 0;
                while (i32 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i32);
                    float E2 = groupedMessages2.transitionParams.cell.E2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f15 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                    float f16 = transitionParams3.top + transitionParams3.offsetTop;
                    float f17 = transitionParams3.offsetRight + transitionParams3.right + E2;
                    float f18 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        f16 += transitionParams3.cell.getTranslationY();
                        f18 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f19 = f16;
                    if (f18 > AndroidUtilities.dp(20.0f) + wnVar.x0.getMeasuredHeight()) {
                        f18 = AndroidUtilities.dp(20.0f) + wnVar.x0.getMeasuredHeight();
                    }
                    float f20 = f18;
                    boolean z13 = (groupedMessages2.transitionParams.cell.getScaleX() == f11 && groupedMessages2.transitionParams.cell.getScaleY() == f11) ? false : true;
                    if (z13) {
                        canvas2.save();
                        i14 = i23;
                        canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), c3.h0.B(f17, f15, f10, f15), c3.h0.B(f20, f19, f10, f19));
                    } else {
                        i14 = i23;
                    }
                    int size = groupedMessages2.messages.size();
                    int i33 = 0;
                    while (true) {
                        if (i33 >= size) {
                            f13 = f20;
                            z10 = true;
                            break;
                        }
                        MessageObject messageObject = groupedMessages2.messages.get(i33);
                        f13 = f20;
                        if (wnVar.m6[messageObject.getDialogId() == wnVar.j6 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                            z10 = false;
                            break;
                        } else {
                            i33++;
                            f20 = f13;
                        }
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    float f21 = f13;
                    wn wnVar2 = wnVar;
                    transitionParams4.cell.B1(canvas, (int) f15, (int) f19, (int) f17, (int) f21, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, z10, 0);
                    if (groupedMessages2 != currentMessagesGroup3) {
                        groupedMessages2.transitionParams.cell = null;
                    }
                    groupedMessages2.transitionParams.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z13) {
                        canvas.restore();
                        for (int i34 = 0; i34 < childCount; i34++) {
                            View childAt4 = wnVar2.x0.getChildAt(i34);
                            if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt4;
                                if (s1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = s1Var4.getLeft();
                                    int top = s1Var4.getTop();
                                    childAt4.setPivotX(((f17 - f15) / 2.0f) + (f15 - left));
                                    childAt4.setPivotY(((f21 - f19) / 2.0f) + (f19 - top));
                                }
                            }
                        }
                    }
                    i32++;
                    canvas2 = canvas;
                    wnVar = wnVar2;
                    i23 = i14;
                    f10 = 2.0f;
                }
                f12 = 0.0f;
                i13 = 2;
            } else {
                i12 = i10;
                i13 = i11;
                f12 = f7;
            }
            canvas2 = canvas;
            wnVar = wnVar;
            i10 = i12;
            f7 = f12;
            i11 = i13;
            f10 = f10;
            i23++;
            rjVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D1(Canvas canvas, RectF rectF) {
        float f7;
        ArrayList arrayList;
        ArrayList arrayList2 = this.i3;
        int size = arrayList2.size();
        wn wnVar = this.H3;
        boolean z10 = 1;
        boolean z11 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) arrayList2.get(i10);
                if (!wn.h2(wnVar, s1Var, rectF)) {
                    canvas.save();
                    canvas.translate(s1Var.E2(false) + s1Var.getLeft(), s1Var.getY() + s1Var.getPaddingTop());
                    s1Var.m2(s1Var.a() ? s1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.j3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) arrayList3.get(i11);
                if (!wn.h2(wnVar, s1Var2, rectF)) {
                    float E2 = s1Var2.E2(false) + s1Var2.getLeft();
                    float y3 = s1Var2.getY() + s1Var2.getPaddingTop();
                    float alpha = s1Var2.a() ? s1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(E2, y3);
                    s1Var2.setInvalidatesParent(true);
                    s1Var2.W1(canvas, alpha);
                    s1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.k3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) arrayList4.get(i12);
                if (wn.h2(wnVar, s1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    boolean z12 = (s1Var3.getCurrentPosition() == null || (s1Var3.getCurrentPosition().flags & z10) != 0) ? z11 : z10;
                    float alpha2 = s1Var3.a() ? s1Var3.getAlpha() : 1.0f;
                    float E22 = s1Var3.E2(z11) + s1Var3.getLeft();
                    float y10 = s1Var3.getY() + s1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        arrayList = arrayList4;
                    } else if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                        float E23 = s1Var3.E2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                        float f10 = transitionParams.left + E23 + transitionParams.offsetLeft;
                        arrayList = arrayList4;
                        float f11 = transitionParams.top + transitionParams.offsetTop;
                        float f12 = transitionParams.right + E23 + transitionParams.offsetRight;
                        float f13 = transitionParams.bottom + transitionParams.offsetBottom;
                        if (!transitionParams.backgroundChangeBounds) {
                            f11 += s1Var3.getTranslationY();
                            f13 += s1Var3.getTranslationY();
                        }
                        canvas.clipRect(f10 + AndroidUtilities.dp(8.0f), f11 + AndroidUtilities.dp(8.0f), f12 - AndroidUtilities.dp(8.0f), f13 - AndroidUtilities.dp(8.0f));
                    } else {
                        arrayList = arrayList4;
                    }
                    if (s1Var3.getTransitionParams().v0) {
                        canvas.translate(E22, y10);
                        s1Var3.setInvalidatesParent(true);
                        s1Var3.I1(alpha2, canvas, z12);
                        s1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z10 = 1;
                z11 = false;
            }
            f7 = 8.0f;
            arrayList4.clear();
        } else {
            f7 = 8.0f;
        }
        ArrayList arrayList5 = this.l3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) arrayList5.get(i13);
                if (!wn.h2(wnVar, s1Var4, rectF)) {
                    boolean z13 = s1Var4.getCurrentPosition() != null && (s1Var4.getCurrentPosition().flags & 1) == 0;
                    float alpha3 = s1Var4.a() ? s1Var4.getAlpha() : 1.0f;
                    float E24 = s1Var4.E2(false) + s1Var4.getLeft();
                    float y11 = s1Var4.getY() + s1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = s1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = s1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f14 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f15 = transitionParams2.top + transitionParams2.offsetTop;
                        float f16 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f17 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f15 += s1Var4.getTranslationY();
                            f17 += s1Var4.getTranslationY();
                        }
                        canvas.clipRect(f14 + AndroidUtilities.dp(f7), f15 + AndroidUtilities.dp(f7), f16 - AndroidUtilities.dp(f7), f17 - AndroidUtilities.dp(f7));
                    }
                    if (!z13 && s1Var4.getTransitionParams().v0) {
                        canvas.translate(E24, y11);
                        s1Var4.setInvalidatesParent(true);
                        s1Var4.d2(canvas, alpha3, null);
                        s1Var4.N1(canvas, alpha3);
                        s1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void E1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        MessageObject.GroupedMessages K8;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        wn wnVar = this.H3;
        if (motionEvent != null) {
            wnVar.P4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !wnVar.v9 && !wnVar.u9 && wnVar.t9 == null) {
            z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.s1)) {
                    if (!(pressedChildView instanceof org.telegram.ui.Cells.v0)) {
                        return;
                    }
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) pressedChildView;
                    float x9 = motionEvent.getX() - pressedChildView.getX();
                    float y3 = motionEvent.getY() - pressedChildView.getY();
                    if (!v0Var.L()) {
                        return;
                    }
                    org.telegram.ui.Wallet.m3 m3Var = v0Var.I0;
                    float f7 = (x9 - v0Var.K0) - (v0Var.j0 / 2.0f);
                    float paddingTop = (y3 - v0Var.L0) - v0Var.getPaddingTop();
                    org.telegram.ui.Wallet.l3 l3Var = m3Var.m;
                    if (l3Var != null && l3Var.n && m3Var.w.contains((int) f7, (int) paddingTop)) {
                        return;
                    }
                }
                if (wnVar.t9 != null) {
                    wn.Z1(wnVar, 0.0f);
                }
                wnVar.t9 = pressedChildView;
                MessageObject X1 = wn.X1(wnVar);
                boolean M6 = wnVar.M6(X1);
                int i10 = wnVar.d4;
                if ((i10 != 0 && i10 != 5 && i10 != 8 && (i10 != 3 || wnVar.p4 != wnVar.getUserConfig().getClientUserId())) || (((arrayList = wnVar.m4) != null && arrayList.contains(X1)) || ((wnVar.Q8(X1) == 1 && (X1.getDialogId() == wnVar.b7 || X1.needDrawBluredPreview())) || ((wnVar.h == null && X1.getId() < 0) || (((chat2 = wnVar.e) != null && ChatObject.isForum(chat2) && !M6) || wnVar.o9() || (X1.isEphemeral() && X1.isOut())))))) {
                    wn.Z1(wnVar, 0.0f);
                    wnVar.t9 = null;
                    return;
                } else {
                    this.p3 = motionEvent.getPointerId(0);
                    wnVar.u9 = true;
                    this.n3 = (int) motionEvent.getX();
                    this.o3 = (int) motionEvent.getY();
                    return;
                }
            }
        }
        if (wnVar.t9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.p3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.n3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.o3);
            if (getScrollState() == 0 && wnVar.u9 && !wnVar.v9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                wnVar.t9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                wnVar.z0.R = false;
                wnVar.u9 = false;
                wnVar.v9 = true;
                this.n3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (wnVar.v9) {
                if (Math.abs(max) < AndroidUtilities.dp(50.0f)) {
                    this.t3 = false;
                } else if (!this.t3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.t3 = true;
                }
                float f10 = max;
                wn.Z1(wnVar, f10);
                MessageObject X12 = wn.X1(wnVar);
                if (X12 != null && (X12.isRoundVideo() || X12.isVideo())) {
                    wnVar.dd(false, false);
                }
                View view = wnVar.t9;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    F1((org.telegram.ui.Cells.s1) view, f10);
                }
                invalidate();
                return;
            }
            return;
        }
        if (wnVar.t9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.p3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = wnVar.t9;
                if (Math.abs(view2 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view2).E2(false) : view2 instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view2).getWalletSlidingOffset() : 0.0f) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject X13 = wn.X1(wnVar);
                    boolean M62 = wnVar.M6(X13);
                    nk nkVar = wnVar.a1;
                    if ((nkVar == null || nkVar.getVisibility() != 0 || ((wnVar.U0 && M62) || X13.wasJustSent)) && ((chat = wnVar.e) == null || ((!ChatObject.isNotInChat(chat) || wnVar.R9()) && ((!ChatObject.isChannel(wnVar.e) || ChatObject.canPost(wnVar.e) || wnVar.e.megagroup) && ChatObject.canSendMessages(wnVar.e))))) {
                        wnVar.Rb(wn.X1(wnVar));
                    } else {
                        if (X13.getGroupId() != 0 && (K8 = wnVar.K8(X13.getGroupId())) != null && (messageObject = K8.captionMessage) != null) {
                            X13 = messageObject;
                        }
                        wnVar.D5 = X13;
                        Bundle c10 = org.telegram.messenger.wh.c(3, "onlySelect", "dialogsType", true);
                        c10.putBoolean("quote", true);
                        c10.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(X13.getFromPeer());
                        if (peerDialogId != 0 && peerDialogId != wnVar.a() && peerDialogId != wnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                            c10.putLong("reply_to_author", peerDialogId);
                        }
                        c10.putInt("messagesCount", 1);
                        c10.putBoolean("canSelectTopics", true);
                        ey eyVar = new ey(c10);
                        eyVar.C2 = wnVar;
                        wnVar.presentFragment(eyVar);
                    }
                }
            }
            View view3 = wnVar.t9;
            float slidingOffsetX = view3 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view3).getSlidingOffsetX() : view3 instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view3).getWalletSlidingOffset() : 0.0f;
            this.s3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                wnVar.t9 = null;
            }
            this.q3 = System.currentTimeMillis();
            this.r3 = 0.0f;
            invalidate();
            wnVar.u9 = false;
            wnVar.v9 = false;
            wnVar.z0.R = true;
        }
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    public final void F1(org.telegram.ui.Cells.s1 s1Var, float f7) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != s1Var && (childAt instanceof org.telegram.ui.Cells.s1)) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    s1Var2.setSlidingOffset(f7);
                    s1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.H3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wn wnVar = this.H3;
        wnVar.K8 = null;
        canvas.save();
        if (wnVar.la != null && wnVar.ha) {
            boolean z10 = wnVar.ia;
        }
        this.E1.setEmpty();
        if (wnVar.da != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-wnVar.da) - (wnVar.ka != 0.0f ? (wnVar.x0.getMeasuredHeight() - wnVar.da) * wnVar.ka : 0.0f);
            wnVar.Pa = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            C1(canvas, null);
            super.dispatchDraw(canvas);
            D1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            C1(canvas, null);
            super.dispatchDraw(canvas);
            D1(canvas, null);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.d7) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z10;
        float f7;
        int i10;
        int dp;
        org.telegram.ui.ActionBar.l5 l5Var;
        int i11;
        float f10;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.l5 l5Var2;
        boolean z11;
        boolean z12;
        kn knVar;
        int i14;
        int i15;
        float f11;
        int dp2;
        int i16;
        float f12;
        float f13;
        boolean z13;
        wn wnVar = this.H3;
        ArrayList arrayList = wnVar.K6;
        ColorMatrix colorMatrix = wnVar.h7;
        m.d3 d3Var = wnVar.i7;
        org.telegram.ui.ActionBar.l5 l5Var3 = wnVar.j7;
        Paint paint = wnVar.r7;
        Paint paint2 = wnVar.f7;
        ArrayList arrayList2 = wnVar.e7;
        Paint paint3 = wnVar.g7;
        long j10 = wnVar.d7 != 0 ? 0L : 0L;
        if (!AndroidUtilities.isTablet() && !wnVar.s4 && wnVar.f == null) {
            TLRPC.Chat chat = wnVar.e;
            boolean z14 = (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) && wnVar.d4 != 7;
            if (wnVar.da != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -wnVar.da);
            }
            int i17 = org.telegram.ui.ActionBar.y6.d6;
            org.telegram.ui.ActionBar.u6 u6Var = this.n2;
            boolean z15 = i0.a.h(org.telegram.ui.ActionBar.y6.w0(i17, u6Var)) <= 0.699999988079071d;
            int i18 = org.telegram.ui.ActionBar.y6.i6;
            boolean z16 = z14;
            int f14 = i0.a.f(z15 ? 0.9f : 0.5f, org.telegram.ui.ActionBar.y6.w0(i18, u6Var), Color.argb(z15 ? 33 : 3, 255, 255, 255));
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(i18, u6Var), z15 ? 24 : wn.fd);
            if (wnVar.q7 != o10 || wnVar.p7 != f14) {
                wnVar.p7 = f14;
                wnVar.q7 = o10;
                int dp3 = AndroidUtilities.dp(200.0f);
                wnVar.l7 = dp3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp3, 0.0f, new int[]{o10, f14, f14, o10}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                wnVar.o7 = linearGradient;
                wnVar.m7 = (-wnVar.l7) * 2;
                paint2.setShader(linearGradient);
                int argb = Color.argb(z15 ? 43 : 96, 255, 255, 255);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, wnVar.l7, 0.0f, new int[]{0, argb, argb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                wnVar.t7 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.l5 l5Var4 = l5Var3;
            long j11 = wnVar.k7;
            int i19 = 2;
            Matrix matrix = wnVar.s7;
            m.d3 d3Var2 = d3Var;
            Matrix matrix2 = wnVar.n7;
            long abs = Math.abs(j11 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            long j12 = abs < 4 ? j10 : abs;
            int width = getWidth();
            wnVar.k7 = elapsedRealtime;
            int i20 = (int) (wnVar.m7 + ((width * j12) / 400.0f));
            wnVar.m7 = i20;
            if (i20 >= width * 2) {
                wnVar.m7 = (-wnVar.l7) * 2;
            }
            matrix2.setTranslate(wnVar.m7, 0.0f);
            LinearGradient linearGradient3 = wnVar.o7;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(wnVar.m7, 0.0f);
            LinearGradient linearGradient4 = wnVar.t7;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - wnVar.Ra) - ((int) (wnVar.j9(org.telegram.ui.Components.b41.c) + wnVar.v.d()))) - AndroidUtilities.dp(57.0f);
            int i21 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                int top = getChildAt(i22).getTop();
                if (top < i21) {
                    i21 = top;
                }
            }
            if (wnVar.d7 == j10 && i21 <= 0) {
                z13 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
                wnVar.U6(z13);
            }
            Paint X0 = X0("paintChatActionBackground");
            if (paint3.getColor() != X0.getColor()) {
                paint3.setColor(X0.getColor());
            }
            if (paint3.getShader() != X0.getShader()) {
                paint3.setShader(X0.getShader());
                colorMatrix.setSaturation(wn.gd);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt = getChildAt(i23);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                    float top2 = childAt.getTop() + s1Var.y2(true).getBounds().top;
                    if (currentMessagesGroup != null) {
                        f12 = 1.0f;
                        f13 = r13.top + currentMessagesGroup.transitionParams.offsetTop;
                    } else {
                        f12 = 1.0f;
                        f13 = 0.0f;
                    }
                    int i24 = (int) (top2 + f13);
                    i16 = i23;
                    if (wnVar.d7 == j10 && wnVar.P9()) {
                        i24 = AndroidUtilities.lerp(height, i24, childAt.getAlpha());
                    } else if (childAt.getAlpha() != f12) {
                        i24 = height;
                    }
                    if (i24 < height) {
                        height = i24;
                    }
                } else {
                    i16 = i23;
                    if (childAt instanceof org.telegram.ui.Cells.v0) {
                        int lerp = (wnVar.d7 == j10 && wnVar.P9()) ? AndroidUtilities.lerp(height, childAt.getTop(), childAt.getAlpha()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (lerp < height) {
                            height = lerp;
                        }
                    }
                }
                i23 = i16 + 1;
            }
            if (wnVar.P9()) {
                boolean z17 = SharedConfig.getDevicePerformanceClass() != 0 && org.telegram.ui.ActionBar.y6.c1();
                int i25 = org.telegram.ui.ActionBar.y6.d6;
                boolean z18 = i0.a.h(org.telegram.ui.ActionBar.y6.w0(i25, u6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.y6.c1();
                boolean z19 = i0.a.h(org.telegram.ui.ActionBar.y6.w0(i25, u6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.y6.c1();
                if (z17) {
                    org.telegram.ui.ActionBar.y6.q(0.0f, getY() - wnVar.M9, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                }
                int alpha = org.telegram.ui.ActionBar.y6.h2.getAlpha();
                if (z19) {
                    org.telegram.ui.ActionBar.y6.h2.setAlpha((int) (alpha * 4.0f));
                }
                if (wnVar.d7 != j10) {
                    z10 = z18;
                    f7 = 1.0f - ((System.currentTimeMillis() - wnVar.d7) / 200.0f);
                } else {
                    z10 = z18;
                    f7 = 1.0f;
                }
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                un unVar = wnVar.ua;
                float f15 = (unVar == null || !unVar.q || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * f7 * f15));
                float f16 = alpha2;
                paint2.setAlpha((int) (f7 * f15 * f16));
                paint.setAlpha((int) (f7 * f16));
                int i26 = 0;
                while (height > wnVar.Qa) {
                    int dp4 = height - AndroidUtilities.dp(3.0f);
                    if (i26 >= arrayList2.size()) {
                        knVar = new kn();
                        l5Var2 = l5Var4;
                        TLRPC.Chat chat2 = wnVar.e;
                        if (chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            z11 = z17;
                            knVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(64.0f);
                        } else {
                            z11 = z17;
                            knVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(128.0f);
                        }
                        float width2 = wnVar.x0.getWidth() * 0.8f;
                        if (z16) {
                            f11 = 42.0f;
                            dp2 = 0;
                        } else {
                            f11 = 42.0f;
                            dp2 = AndroidUtilities.dp(42.0f);
                        }
                        float f17 = width2 - dp2;
                        float dp5 = AndroidUtilities.dp(f11);
                        z12 = z10;
                        i13 = alpha;
                        knVar.a = (int) Math.min(f17, (d3.f(Utilities.fastRandom, 0.35f, 0.4f) * wnVar.x0.getWidth()) + dp5);
                        arrayList2.add(knVar);
                    } else {
                        i13 = alpha;
                        l5Var2 = l5Var4;
                        z11 = z17;
                        z12 = z10;
                        knVar = (kn) arrayList2.get(i26);
                    }
                    if (wnVar.d7 != j10) {
                        i14 = i19;
                        i15 = arrayList.size() <= i14 ? Math.min(knVar.c, dp4) : knVar.c;
                    } else {
                        i14 = i19;
                        i15 = dp4;
                    }
                    knVar.c = i15;
                    height = dp4 - knVar.b;
                    i26++;
                    i19 = i14;
                    z10 = z12;
                    z17 = z11;
                    l5Var4 = l5Var2;
                    alpha = i13;
                }
                int i27 = alpha;
                org.telegram.ui.ActionBar.l5 l5Var5 = l5Var4;
                boolean z20 = z17;
                boolean z21 = z10;
                if (arrayList2.isEmpty()) {
                    dp = getHeight() - wnVar.Ra;
                    i10 = 0;
                } else {
                    i10 = 0;
                    dp = ((kn) arrayList2.get(0)).c + AndroidUtilities.dp(3.0f);
                }
                int dp6 = AndroidUtilities.dp(z16 ? 3.0f : 51.0f);
                if (wnVar.O9()) {
                    dp6 = AndroidUtilities.lerp(dp6, AndroidUtilities.dp(71.0f), wnVar.d9());
                }
                while (i10 < arrayList2.size() && dp > wnVar.Qa) {
                    int dp7 = dp - AndroidUtilities.dp(3.0f);
                    kn knVar2 = (kn) arrayList2.get(i10);
                    int i28 = knVar2.c;
                    org.telegram.ui.ActionBar.l5 l5Var6 = l5Var5;
                    l5Var6.setBounds(dp6, i28 - knVar2.b, knVar2.a, i28);
                    m.d3 d3Var3 = d3Var2;
                    if (z20) {
                        l5Var6.d(canvas, d3Var3, paint3);
                    }
                    l5Var6.d(canvas, d3Var3, paint2);
                    if (z21) {
                        l5Var6.d(canvas, d3Var3, org.telegram.ui.ActionBar.y6.h2);
                    }
                    l5Var6.d(canvas, d3Var3, paint);
                    if (z16) {
                        l5Var = l5Var6;
                        i11 = dp6;
                    } else {
                        if (z20) {
                            f10 = 27.0f;
                            l5Var = l5Var6;
                            i11 = dp6;
                            canvas.drawCircle(AndroidUtilities.dp(27.0f), i28 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint3);
                        } else {
                            l5Var = l5Var6;
                            i11 = dp6;
                            f10 = 27.0f;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i28 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint2);
                        if (z21) {
                            i12 = i28;
                            canvas.drawCircle(AndroidUtilities.dp(f10), i28 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.y6.h2);
                        } else {
                            i12 = i28;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i12 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint);
                    }
                    dp = dp7 - knVar2.b;
                    i10++;
                    d3Var2 = d3Var3;
                    dp6 = i11;
                    l5Var5 = l5Var;
                }
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.y6.h2.setAlpha(i27);
                invalidate();
            } else if (System.currentTimeMillis() - wnVar.d7 > 200) {
                arrayList2.clear();
            }
            arrayList2.size();
            arrayList.size();
            if (wnVar.da != 0.0f) {
                canvas.restore();
            }
        }
        super.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x028c, code lost:
    
        if ((r4 & 1) != 0) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v61, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [org.telegram.ui.Cells.s4] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.ui.Cells.s4] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [org.telegram.ui.Cells.s4] */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        boolean z10;
        org.telegram.ui.Cells.s1 s1Var2;
        int i10;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        boolean z11;
        float f7;
        boolean z12;
        float f10;
        boolean z13;
        float f11;
        boolean z14;
        boolean z15;
        int paddingTop;
        float f12;
        float checkBoxTranslation;
        int i12;
        float f13;
        int b10;
        int b11;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject;
        wn wnVar = this.H3;
        if (wnVar.P9()) {
            invalidate();
        }
        boolean z16 = view == wnVar.Z8;
        boolean z17 = view instanceof org.telegram.ui.Cells.s1;
        if (z17) {
            s1Var = (org.telegram.ui.Cells.s1) view;
            z10 = s1Var.Zc.w0;
        } else {
            s1Var = null;
            z10 = false;
        }
        if ((!org.telegram.ui.Components.ww0.k0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z10)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z16 = true;
        }
        if (z17) {
            s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (wnVar.D6.contains(s1Var2)) {
                z16 = true;
            }
            MessageObject.GroupedMessagePosition currentPosition = s1Var2.getCurrentPosition();
            groupedMessages = s1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i16 = currentPosition.pw;
                int i17 = currentPosition.spanSize;
                if (i16 != i17 && i17 == 1000 && currentPosition.siblingHeights == null && groupedMessages.hasSibling) {
                    i10 = s1Var2.getBackgroundDrawableLeft();
                    i14 = 0;
                    i15 = s1Var2.K1;
                    if (i15 != 7) {
                    }
                    wnVar.K8 = s1Var2;
                    if (!z16) {
                    }
                    if (z16) {
                    }
                    i11 = i14;
                    v0Var = null;
                } else if (currentPosition.siblingHeights != null) {
                    i14 = view.getBottom() - AndroidUtilities.dp((s1Var2.m3() ? 1 : 0) + 1);
                    i10 = 0;
                    i15 = s1Var2.K1;
                    if ((i15 != 7 || i15 == 4) && (messageObject = s1Var2.y7) != null && messageObject.type != 5 && MediaController.getInstance().isPlayingMessage(s1Var2.y7)) {
                        wnVar.K8 = s1Var2;
                    }
                    if (!z16) {
                        View view2 = wnVar.Z8;
                        if (view2 instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) view2;
                            if (s1Var3.getCurrentMessagesGroup() != null && s1Var3.getCurrentMessagesGroup() == groupedMessages) {
                                z16 = true;
                            }
                        }
                    }
                    if (z16) {
                        s1Var2.getPhotoImage().skipDraw();
                    }
                    i11 = i14;
                    v0Var = null;
                }
            }
            i10 = 0;
            i14 = 0;
            i15 = s1Var2.K1;
            if (i15 != 7) {
            }
            wnVar.K8 = s1Var2;
            if (!z16) {
            }
            if (z16) {
            }
            i11 = i14;
            v0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.v0) {
                v0Var = (org.telegram.ui.Cells.v0) view;
                s1Var2 = null;
                i10 = 0;
            } else {
                s1Var2 = null;
                i10 = 0;
                v0Var = null;
            }
            groupedMessages = null;
            i11 = 0;
        }
        if (i10 != 0) {
            canvas.save();
        } else if (i11 != 0) {
            canvas.save();
        }
        if (z16) {
            z16 = false;
        }
        if (z16) {
            z11 = true;
            f7 = 0.0f;
            z12 = false;
        } else {
            boolean z18 = (s1Var2 == null || s1Var2.Zc.v1 || groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) ? false : true;
            if (z18) {
                canvas.save();
                float E2 = s1Var2.E2(true);
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                z11 = true;
                float f14 = transitionParams.right + E2;
                f7 = 0.0f;
                canvas.clipRect(transitionParams.left + E2 + transitionParams.offsetLeft + AndroidUtilities.dp(4.0f), transitionParams.top + transitionParams.offsetTop + AndroidUtilities.dp(4.0f), (f14 + transitionParams.offsetRight) - AndroidUtilities.dp(4.0f), (transitionParams.bottom + transitionParams.offsetBottom) - AndroidUtilities.dp(4.0f));
            } else {
                z11 = true;
                f7 = 0.0f;
            }
            if (s1Var2 != null) {
                org.telegram.ui.Cells.r1 r1Var = s1Var2.Zc;
                if (r1Var.v1) {
                    canvas.save();
                    canvas.translate(s1Var2.getX(), s1Var2.getY());
                    s1Var2.S1(canvas);
                    canvas.restore();
                    z12 = r1Var.g;
                    if (z18) {
                        canvas.restore();
                    }
                    if (s1Var2 == null && s1Var2.U2()) {
                        canvas.save();
                        canvas.translate(s1Var2.getX(), s1Var2.getPaddingTopAnimated() + s1Var2.getY());
                        s1Var2.X1(canvas);
                        canvas.restore();
                    } else if (v0Var != null) {
                        canvas.save();
                        canvas.translate(v0Var.getX(), v0Var.getY());
                        v0Var.A(canvas);
                        canvas.restore();
                    }
                }
            }
            z12 = (s1Var2 == null || !z18) ? super.drawChild(canvas, view, j10) : super.drawChild(canvas, view, j10);
            if (z18) {
            }
            if (s1Var2 == null) {
            }
            if (v0Var != null) {
            }
        }
        if (i10 != 0 || i11 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f7) {
            canvas.save();
            f10 = f7;
            canvas.translate(f10, view.getTranslationY());
        } else {
            f10 = f7;
        }
        if (s1Var2 != null) {
            s1Var2.K1(canvas);
        }
        if (view.getTranslationY() != f10) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            canvas.translate(f10, view.getTranslationY());
        }
        if (s1Var2 != null) {
            MessageObject messageObject2 = s1Var2.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition2 = s1Var2.getCurrentPosition();
            if (!z16) {
                if (currentPosition2 != null || s1Var2.getTransitionParams().w0) {
                    if (currentPosition2 == null || currentPosition2.last || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) {
                        if (currentPosition2 == null || currentPosition2.last) {
                            this.i3.add(s1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) && s1Var2.T2()) {
                            this.j3.add(s1Var2);
                        }
                    }
                    if (currentPosition2 != null || s1Var2.getTransitionParams().C0 || s1Var2.getTransitionParams().w0) {
                        if (currentPosition2 == null || (currentPosition2.flags & s1Var2.s0()) != 0) {
                            this.k3.add(s1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i18 = currentPosition2.flags;
                            if ((i18 & 8) != 0) {
                            }
                        }
                        this.l3.add(s1Var2);
                    }
                }
                if (wnVar.J8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                    ImageReceiver photoImage = s1Var2.getPhotoImage();
                    float x9 = s1Var2.getX() + photoImage.getImageX();
                    float y3 = (wnVar.x0.getY() + (photoImage.getImageY() + (s1Var2.getY() + s1Var2.getPaddingTop()))) - wnVar.J8.getTop();
                    if (wnVar.J8.getTranslationX() != x9 || wnVar.J8.getTranslationY() != y3) {
                        wnVar.J8.setTranslationX(x9);
                        wnVar.J8.setTranslationY(y3);
                        wnVar.fragmentView.invalidate();
                        wnVar.J8.invalidate();
                    }
                }
            }
        }
        if (s1Var != null) {
            MessageObject messageObject3 = s1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition3 = s1Var.getCurrentPosition();
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage != null && wnVar.d9() < 1.0f) {
                MessageObject.GroupedMessages k92 = wnVar.k9(messageObject3);
                if (!s1Var.getMessageObject().deleted) {
                    wnVar.x0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z14 = z11;
                        z15 = (!wnVar.x0.V1 || (k92 != null && k92.transitionParams.backgroundChangeBounds)) ? z11 : false;
                        paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                        if (s1Var.i()) {
                            if (s1Var.oc) {
                                b11 = ((SparseArray) wnVar.m9.j).indexOfValue(view);
                                if (b11 >= 0) {
                                    b11 = ((SparseArray) wnVar.m9.j).keyAt(b11);
                                }
                            } else {
                                b11 = wnVar.x0.T(view).b();
                            }
                            if (b11 >= 0) {
                                if (k92 == null || currentPosition3 == null) {
                                    z13 = z12;
                                    f12 = 1.0f;
                                    i13 = b11 - 1;
                                } else {
                                    int indexOf = k92.posArray.indexOf(currentPosition3);
                                    f12 = 1.0f;
                                    int size = k92.posArray.size();
                                    if ((currentPosition3.flags & 8) != 0) {
                                        i13 = (b11 - size) + indexOf;
                                    } else {
                                        i13 = b11 - 1;
                                        int i19 = indexOf + 1;
                                        while (i19 < size) {
                                            z13 = z12;
                                            if (k92.posArray.get(i19).minY > currentPosition3.maxY) {
                                                break;
                                            }
                                            i13--;
                                            i19++;
                                            z12 = z13;
                                        }
                                    }
                                    z13 = z12;
                                }
                                if (s1Var.oc) {
                                    if (((View) ((SparseArray) wnVar.m9.j).get(i13)) != null) {
                                        if (view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        avatarImage.setVisible(false, false);
                                        return z13;
                                    }
                                } else if (wnVar.x0.K(i13) != null) {
                                    if (view.getTranslationY() != 0.0f) {
                                        canvas.restore();
                                    }
                                    avatarImage.setVisible(false, false);
                                    return z13;
                                }
                                checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                                int layoutHeight = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z15 ? view.getTop() : view.getY()))))));
                                int measuredHeight = wnVar.x0.getMeasuredHeight() - wnVar.x0.getPaddingBottom();
                                boolean z19 = ((!s1Var.m1 || s1Var.n1) && checkBoxTranslation == 0.0f) ? z11 : false;
                                if (!s1Var.o3() || s1Var.getTransitionParams().k2) {
                                    if (s1Var.getTransitionParams().k2) {
                                        float f15 = s1Var.getTransitionParams().K1;
                                        if (!s1Var.o3()) {
                                            f15 = f12 - f15;
                                        }
                                        layoutHeight = (int) c3.h0.z(f12, f15, Math.min(layoutHeight, measuredHeight), layoutHeight * f15);
                                    }
                                } else if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (!z15 && view.getTranslationY() != 0.0f) {
                                    canvas.restore();
                                }
                                if (s1Var.g()) {
                                    if (s1Var.oc) {
                                        b10 = ((SparseArray) wnVar.m9.j).indexOfValue(view);
                                        if (b10 >= 0) {
                                            b10 = ((SparseArray) wnVar.m9.j).keyAt(b10);
                                        }
                                    } else {
                                        b10 = wnVar.x0.T(view).b();
                                    }
                                    if (b10 >= 0) {
                                        float f16 = checkBoxTranslation;
                                        ?? r11 = s1Var;
                                        int i20 = b10;
                                        int i21 = 0;
                                        while (i21 < 20) {
                                            i21++;
                                            if (k92 == null || currentPosition3 == null) {
                                                i12 = layoutHeight;
                                                i20++;
                                            } else {
                                                int indexOf2 = k92.posArray.indexOf(currentPosition3);
                                                if (indexOf2 < 0) {
                                                    break;
                                                }
                                                i12 = layoutHeight;
                                                k92.posArray.size();
                                                if ((currentPosition3.flags & 4) != 0) {
                                                    i20 = i20 + indexOf2 + 1;
                                                } else {
                                                    i20++;
                                                    for (int i22 = indexOf2 - 1; i22 >= 0 && k92.posArray.get(i22).maxY >= currentPosition3.minY; i22--) {
                                                        i20++;
                                                    }
                                                }
                                            }
                                            if (!r11.h()) {
                                                s4.e1 K = wnVar.x0.K(i20);
                                                if (K == null) {
                                                    break;
                                                }
                                                ?? r02 = K.a;
                                                paddingTop = r02.getPaddingTop() + r02.getTop();
                                                if (!(r02 instanceof org.telegram.ui.Cells.s1)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.s4) r02;
                                                float checkBoxTranslation2 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z19 && checkBoxTranslation2 > 0.0f) {
                                                    f16 = checkBoxTranslation2;
                                                }
                                                if (!r11.g()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            } else {
                                                ?? r03 = (View) ((SparseArray) wnVar.m9.j).get(i20);
                                                if (r03 == 0) {
                                                    break;
                                                }
                                                paddingTop = r03.getPaddingTop() + r03.getTop();
                                                if (!(r03 instanceof org.telegram.ui.Cells.s4)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.s4) r03;
                                                float checkBoxTranslation3 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z19 && checkBoxTranslation3 > 0.0f) {
                                                    f16 = checkBoxTranslation3;
                                                }
                                                if (!r11.g()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            }
                                            int dp = i12 - AndroidUtilities.dp(48.0f) < paddingTop ? AndroidUtilities.dp(48.0f) + paddingTop : i12;
                                            if (!s1Var.i()) {
                                                int bottom = z15 ? view.getBottom() : (int) (s1Var.getDeltaBottom() + s1Var.getY() + s1Var.getMeasuredHeight());
                                                if (dp > bottom) {
                                                    dp = bottom;
                                                }
                                            }
                                            canvas.save();
                                            if (checkBoxTranslation != 0.0f) {
                                                canvas.translate(checkBoxTranslation, 0.0f);
                                            }
                                            if (s1Var instanceof org.telegram.ui.Cells.s1) {
                                                org.telegram.ui.Cells.s1 s1Var4 = s1Var;
                                                if (s1Var4.getCurrentMessagesGroup() != null && s1Var4.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                                                    dp = (int) (dp - s1Var4.getTranslationY());
                                                }
                                            }
                                            if (z14) {
                                                avatarImage.setImageY(dp - AndroidUtilities.dp(44.0f));
                                            }
                                            if (s1Var.a()) {
                                                avatarImage.setAlpha(s1Var.getAlpha() * (1.0f - wnVar.d9()));
                                                canvas.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX() + s1Var.getX(), s1Var.getY() + (s1Var.getHeight() >> 1));
                                                f13 = 1.0f;
                                            } else {
                                                f13 = 1.0f;
                                                avatarImage.setAlpha(1.0f - wnVar.d9());
                                            }
                                            if (z14) {
                                                avatarImage.setVisible(z11, false);
                                            }
                                            if (wnVar.d9() > 0.0f) {
                                                canvas.scale(f13 - wnVar.d9(), f13 - wnVar.d9(), avatarImage.getImageX2(), avatarImage.getImageY2());
                                                f11 = 0.0f;
                                                canvas.translate(wnVar.d9() * AndroidUtilities.dp(24.0f), 0.0f);
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            avatarImage.draw(canvas);
                                            canvas.restore();
                                            if (!z15 && view.getTranslationY() != f11) {
                                                canvas.save();
                                            }
                                            if (view.getTranslationY() != f11) {
                                                canvas.restore();
                                            }
                                            return z13;
                                        }
                                        i12 = layoutHeight;
                                        s1Var = r11;
                                        checkBoxTranslation = f16;
                                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                        }
                                        if (!s1Var.i()) {
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                        }
                                        if (s1Var instanceof org.telegram.ui.Cells.s1) {
                                        }
                                        if (z14) {
                                        }
                                        if (s1Var.a()) {
                                        }
                                        if (z14) {
                                        }
                                        if (wnVar.d9() > 0.0f) {
                                        }
                                        avatarImage.draw(canvas);
                                        canvas.restore();
                                        if (!z15) {
                                            canvas.save();
                                        }
                                        if (view.getTranslationY() != f11) {
                                        }
                                        return z13;
                                    }
                                }
                                i12 = layoutHeight;
                                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                }
                                if (!s1Var.i()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (s1Var instanceof org.telegram.ui.Cells.s1) {
                                }
                                if (z14) {
                                }
                                if (s1Var.a()) {
                                }
                                if (z14) {
                                }
                                if (wnVar.d9() > 0.0f) {
                                }
                                avatarImage.draw(canvas);
                                canvas.restore();
                                if (!z15) {
                                }
                                if (view.getTranslationY() != f11) {
                                }
                                return z13;
                            }
                        }
                        z13 = z12;
                        f12 = 1.0f;
                        checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                        int layoutHeight2 = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z15 ? view.getTop() : view.getY()))))));
                        int measuredHeight2 = wnVar.x0.getMeasuredHeight() - wnVar.x0.getPaddingBottom();
                        if (s1Var.m1) {
                        }
                        if (s1Var.o3()) {
                        }
                        if (s1Var.getTransitionParams().k2) {
                        }
                        if (!z15) {
                            canvas.restore();
                        }
                        if (s1Var.g()) {
                        }
                        i12 = layoutHeight2;
                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                        }
                        if (!s1Var.i()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (s1Var instanceof org.telegram.ui.Cells.s1) {
                        }
                        if (z14) {
                        }
                        if (s1Var.a()) {
                        }
                        if (z14) {
                        }
                        if (wnVar.d9() > 0.0f) {
                        }
                        avatarImage.draw(canvas);
                        canvas.restore();
                        if (!z15) {
                        }
                        if (view.getTranslationY() != f11) {
                        }
                        return z13;
                    }
                }
                z14 = false;
                if (wnVar.x0.V1) {
                }
                paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                if (s1Var.i()) {
                }
                z13 = z12;
                f12 = 1.0f;
                checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                int layoutHeight22 = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z15 ? view.getTop() : view.getY()))))));
                int measuredHeight22 = wnVar.x0.getMeasuredHeight() - wnVar.x0.getPaddingBottom();
                if (s1Var.m1) {
                }
                if (s1Var.o3()) {
                }
                if (s1Var.getTransitionParams().k2) {
                }
                if (!z15) {
                }
                if (s1Var.g()) {
                }
                i12 = layoutHeight22;
                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                }
                if (!s1Var.i()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (s1Var instanceof org.telegram.ui.Cells.s1) {
                }
                if (z14) {
                }
                if (s1Var.a()) {
                }
                if (z14) {
                }
                if (wnVar.d9() > 0.0f) {
                }
                avatarImage.draw(canvas);
                canvas.restore();
                if (!z15) {
                }
                if (view.getTranslationY() != f11) {
                }
                return z13;
            }
        }
        z13 = z12;
        f11 = 0.0f;
        if (view.getTranslationY() != f11) {
        }
        return z13;
    }

    @Override // org.telegram.ui.Components.nm0
    public final void k1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.k1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject.isMusic() || messageObject.isDocument() || (currentMessagesGroup = s1Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && (childAt instanceof org.telegram.ui.Cells.s1)) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        s1Var2.setPressed(z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        tp tpVar;
        int i10;
        float f11;
        int i11;
        String string;
        String string2;
        String string3;
        int i12;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i13;
        Paint paint;
        Paint paint2;
        int i14;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        Paint paint3;
        float f17;
        Paint paint4;
        Paint paint5;
        float f18;
        float f19;
        float f20;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i15;
        float f21;
        float f22;
        super.onDraw(canvas);
        wn wnVar = this.H3;
        View view = wnVar.t9;
        if (view != null) {
            float slidingOffsetX = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getSlidingOffsetX() : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getWalletSlidingOffset() : 0.0f;
            if (!wnVar.u9 && !wnVar.v9 && this.s3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f23 = ((currentTimeMillis - this.q3) / 180.0f) + this.r3;
                this.r3 = f23;
                if (f23 > 1.0f) {
                    this.r3 = 1.0f;
                }
                this.q3 = currentTimeMillis;
                float interpolation = (1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(this.r3)) * this.s3;
                if (interpolation == 0.0f) {
                    this.s3 = 0.0f;
                }
                View view2 = wnVar.t9;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                    F1((org.telegram.ui.Cells.s1) view2, interpolation);
                }
                wn.Z1(wnVar, interpolation);
                MessageObject X1 = wn.X1(wnVar);
                if (X1 != null && (X1.isRoundVideo() || X1.isVideo())) {
                    wnVar.dd(false, false);
                }
                float f24 = this.r3;
                if (f24 == 1.0f || f24 == 0.0f) {
                    wn.Z1(wnVar, 0.0f);
                    wnVar.t9 = null;
                }
                invalidate();
            }
            if (wnVar.t9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint X0 = X0("paintChatActionBackground");
                Paint paint6 = org.telegram.ui.ActionBar.y6.h2;
                Paint paint7 = this.v3;
                if (paint7.getColor() != X0.getColor()) {
                    paint7.setColor(X0.getColor());
                }
                Paint paint8 = this.w3;
                if (paint8.getColor() != paint6.getColor()) {
                    paint8.setColor(paint6.getColor());
                }
                if (paint7.getShader() != X0.getShader()) {
                    paint7.setShader(X0.getShader());
                }
                if (paint8.getShader() != paint6.getShader()) {
                    paint8.setShader(paint6.getShader());
                }
                ac.a aVar = this.z3;
                float f25 = aVar.a;
                float f26 = this.u3;
                float f27 = f25 / f26;
                f7 = 255.0f;
                int color = paint8.getColor();
                if (f27 > 1.0f) {
                    this.D3 = true;
                }
                f10 = 2.0f;
                View view3 = wnVar.t9;
                float E2 = view3 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view3).E2(false) : view3 instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view3).getWalletSlidingOffset() : 0.0f;
                ac.a aVar2 = this.x3;
                float f28 = aVar2.a;
                ac.a aVar3 = this.B3;
                o1.j jVar = this.C3;
                o1.j jVar2 = this.A3;
                if (f28 == 0.0f) {
                    jVar2.c();
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                    double d = 0.0f;
                    jVar2.u.i = d;
                    aVar.a = 0.0f;
                    jVar.c();
                    jVar.u.i = d;
                    aVar3.a = 0.0f;
                    this.D3 = false;
                } else {
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                }
                if (((float) jVar2.u.i) != f26) {
                    f12 = 1.0f;
                    f13 = a8.ee.a(((-E2) - AndroidUtilities.dp(20.0f)) / AndroidUtilities.dp(30.0f), 0.0f, 1.0f);
                } else {
                    f12 = 1.0f;
                    f13 = 1.0f;
                }
                if (f13 == f12) {
                    o1.k kVar = jVar2.u;
                    f14 = 20.0f;
                    f15 = f27;
                    if (((float) kVar.i) != f26) {
                        double d10 = f26;
                        kVar.i = d10;
                        jVar2.h();
                        jVar.u.i = d10;
                        jVar.h();
                    }
                } else {
                    f14 = 20.0f;
                    f15 = f27;
                }
                float f29 = E2 <= ((float) (-AndroidUtilities.dp(f14))) ? f26 : 0.0f;
                o1.j jVar3 = this.y3;
                o1.k kVar2 = jVar3.u;
                if (f29 != ((float) kVar2.i)) {
                    kVar2.i = f29;
                    if (!jVar3.f) {
                        jVar3.h();
                    }
                }
                float f30 = aVar2.a / f26;
                MessageObject X12 = wn.X1(wnVar);
                float measuredWidth = (E2 * ((X12 == null || !X12.isOut()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (wnVar.t9.getMeasuredHeight() / 2.0f) + wnVar.t9.getTop();
                boolean z10 = this.D3;
                float f31 = z10 ? f15 : f30;
                float f32 = z10 ? 0.0f : 1.0f - f15;
                int i16 = org.telegram.ui.ActionBar.y6.d6;
                org.telegram.ui.ActionBar.u6 u6Var2 = this.n2;
                boolean z11 = i0.a.h(org.telegram.ui.ActionBar.y6.w0(i16, u6Var2)) <= 0.5d;
                if (f30 != 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    f18 = f26;
                    rectF.set((int) ((paint2.getStrokeWidth() / 2.0f) + (measuredWidth - (AndroidUtilities.dp(16.0f) * f31))), (int) ((paint2.getStrokeWidth() / 2.0f) + (measuredHeight - (AndroidUtilities.dp(16.0f) * f31))), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredWidth) - (paint2.getStrokeWidth() / 2.0f)), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredHeight) - (paint2.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.y6.q(0.0f, getY() + rectF.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                    if (f15 == 0.0f) {
                        int alpha = paint2.getAlpha();
                        Paint paint9 = paint2;
                        paint9.setAlpha((int) (alpha * f30));
                        float f33 = f13 * 360.0f;
                        f16 = f13;
                        f19 = f30;
                        paint3 = paint;
                        u6Var = u6Var2;
                        f17 = measuredWidth;
                        f20 = measuredHeight;
                        canvas.drawArc(rectF, -90.0f, f33, false, paint9);
                        paint9.setAlpha(alpha);
                        if (wnVar.ua.f()) {
                            int alpha2 = paint8.getAlpha();
                            paint5 = paint8;
                            if (z11) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha2 * f19));
                            paint4 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f33, false, paint5);
                        } else {
                            paint4 = paint9;
                            paint5 = paint8;
                            canvas2 = canvas;
                        }
                    } else {
                        Paint paint10 = paint2;
                        f16 = f13;
                        paint3 = paint;
                        f17 = measuredWidth;
                        paint4 = paint10;
                        canvas2 = canvas;
                        f19 = f30;
                        paint5 = paint8;
                        u6Var = u6Var2;
                        f20 = measuredHeight;
                    }
                } else {
                    Paint paint11 = paint2;
                    f16 = f13;
                    paint3 = paint;
                    f17 = measuredWidth;
                    paint4 = paint11;
                    canvas2 = canvas;
                    paint5 = paint8;
                    f18 = f26;
                    f19 = f30;
                    f20 = measuredHeight;
                    u6Var = u6Var2;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f31)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f31)), (int) ((AndroidUtilities.dp(16.0f) * f31) + f17), (int) ((AndroidUtilities.dp(16.0f) * f31) + f20));
                org.telegram.ui.ActionBar.y6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                Path path = this.E3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f31, AndroidUtilities.dp(16.0f) * f31, direction);
                int alpha3 = X0.getAlpha();
                float f34 = 0.6f * f19 * f16;
                X0.setAlpha((int) (alpha3 * f34));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha3);
                if (wnVar.ua.f()) {
                    int alpha4 = org.telegram.ui.ActionBar.y6.h2.getAlpha();
                    if (z11) {
                        f22 = f34;
                        org.telegram.ui.ActionBar.y6.h2.setColor(-1);
                    } else {
                        f22 = f34;
                    }
                    org.telegram.ui.ActionBar.y6.h2.setAlpha((int) (alpha4 * f22));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.y6.h2);
                    org.telegram.ui.ActionBar.y6.h2.setAlpha(alpha4);
                }
                int i17 = (f32 > 0.0f ? 1 : (f32 == 0.0f ? 0 : -1));
                if (i17 != 0) {
                    i15 = i17;
                    f21 = f31;
                    rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f32)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f32)), (int) ((AndroidUtilities.dp(16.0f) * f32) + f17), (int) ((AndroidUtilities.dp(16.0f) * f32) + f20));
                    path.rewind();
                    path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i15 = i17;
                    f21 = f31;
                }
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f21)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f21)), (int) ((AndroidUtilities.dp(16.0f) * f21) + f17), (int) ((AndroidUtilities.dp(16.0f) * f21) + f20));
                org.telegram.ui.ActionBar.y6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f21, AndroidUtilities.dp(16.0f) * f21, direction);
                int alpha5 = X0.getAlpha();
                float f35 = 0.4f * f19;
                X0.setAlpha((int) (alpha5 * f35));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha5);
                if (wnVar.ua.f()) {
                    int alpha6 = org.telegram.ui.ActionBar.y6.h2.getAlpha();
                    if (z11) {
                        org.telegram.ui.ActionBar.y6.h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.y6.h2.setAlpha((int) (f35 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.y6.h2);
                    org.telegram.ui.ActionBar.y6.h2.setAlpha(alpha6);
                }
                if (i15 != 0) {
                    canvas2.restore();
                }
                float f36 = aVar3.a / f18;
                if (f36 != 0.0f && f36 != 1.0f) {
                    float f37 = f36 + 1.0f;
                    float strokeWidth = paint4.getStrokeWidth();
                    float f38 = (1.0f - f36) * strokeWidth;
                    if (f38 != 0.0f) {
                        rectF2.set((int) ((f17 - (AndroidUtilities.dp(16.0f) * f37)) + f38), (int) ((f20 - (AndroidUtilities.dp(16.0f) * f37)) + f38), (int) (((AndroidUtilities.dp(16.0f) * f37) + f17) - f38), (int) (((AndroidUtilities.dp(16.0f) * f37) + f20) - f38));
                        org.telegram.ui.ActionBar.y6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                        int alpha7 = paint4.getAlpha();
                        paint4.setAlpha((int) (alpha7 * f19));
                        paint4.setStrokeWidth(f38);
                        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f37, AndroidUtilities.dp(16.0f) * f37, paint4);
                        paint4.setStrokeWidth(strokeWidth);
                        paint4.setAlpha(alpha7);
                        if (wnVar.ua.f()) {
                            int alpha8 = paint5.getAlpha();
                            if (z11) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha8 * f19));
                            paint5.setStrokeWidth(f38);
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f37, AndroidUtilities.dp(16.0f) * f37, paint5);
                            paint5.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i18 = (int) (f19 * 255.0f);
                Drawable drawable = u6Var != null ? u6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.y6.Q0("drawableReplyIcon");
                }
                drawable.setAlpha(i18);
                drawable.setBounds((int) (f17 - ((drawable.getIntrinsicWidth() / 2) * f21)), (int) (f20 - ((drawable.getIntrinsicHeight() / 2) * f21)), (int) (((drawable.getIntrinsicWidth() / 2) * f21) + f17), (int) (((drawable.getIntrinsicHeight() / 2) * f21) + f20));
                drawable.draw(canvas2);
                drawable.setAlpha(255);
                int i19 = i14;
                paint5.setColor(i19);
                paint3.setColor(i19);
                if (wnVar.da != 0.0f || wnVar.isInPreviewMode() || wnVar.fb || (i10 = wnVar.d4) == 3 || i10 == 1) {
                    tpVar = wnVar.fa;
                    if (tpVar == null) {
                        tpVar.O = 0.0f;
                        tpVar.N = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (wnVar.ka != 0.0f) {
                    float measuredHeight2 = wnVar.x0.getMeasuredHeight() - wnVar.da;
                    wn wnVar2 = wnVar.ja;
                    f11 = (measuredHeight2 + (wnVar2 == null ? 0.0f : wnVar2.ea)) * wnVar.ka;
                } else {
                    f11 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - wnVar.Ra) - f11);
                if (wnVar.fa == null) {
                    i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    tp tpVar2 = new tp(i13, wnVar.fragmentView, wnVar.j6, wnVar.Ka, wnVar.La, wnVar.b(), wnVar.ua);
                    wnVar.fa = tpVar2;
                    tpVar2.S = wnVar.Vc.e;
                    ArrayList arrayList = wnVar.Fb;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        wnVar.fa.i((TLRPC.Chat) wnVar.Fb.get(0));
                    } else if (wnVar.t4) {
                        wnVar.fa.j();
                    } else {
                        wnVar.fa.h();
                    }
                    wnVar.fa.f();
                }
                tp tpVar3 = wnVar.fa;
                int measuredWidth2 = getMeasuredWidth() - (wnVar.O9() ? AndroidUtilities.dp(71.0f) : 0);
                ImageReceiver imageReceiver = tpVar3.F;
                TextPaint textPaint = tpVar3.f;
                TextPaint textPaint2 = tpVar3.h;
                boolean z12 = tpVar3.X;
                if (measuredWidth2 != tpVar3.c || (z12 && (tL_forumTopic = tpVar3.H) != null && tpVar3.I != tL_forumTopic.id)) {
                    tpVar3.d = AndroidUtilities.dp(56.0f) / f10;
                    tpVar3.c = measuredWidth2;
                    TLRPC.Chat chat = tpVar3.G;
                    if (chat != null) {
                        string = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = tpVar3.H;
                        if (tL_forumTopic2 != null) {
                            string = tL_forumTopic2.title;
                        } else {
                            if (z12) {
                                i11 = 0;
                                string = LocaleController.formatString(R.string.SwipeToGoNextTopicEnd, MessagesController.getInstance(tpVar3.e0).getChat(Long.valueOf(-tpVar3.i0)).title);
                            } else {
                                i11 = 0;
                                string = LocaleController.getString(R.string.SwipeToGoNextChannelEnd);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                            tpVar3.x = measureText;
                            int g7 = d3.g(60.0f, tpVar3.c, measureText);
                            tpVar3.x = g7;
                            tpVar3.s = org.telegram.ui.Components.qx0.c(string, textPaint, g7, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, g7, 1, true);
                            if (!tpVar3.V) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextRecommendedChannel);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextRecommendedChannel);
                            } else if (z12) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextUnreadTopic);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextUnreadTopic);
                            } else {
                                boolean z13 = tpVar3.W;
                                if (z13 && (i12 = tpVar3.a) != tpVar3.f0 && i12 != 0) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextArchive);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextArchive);
                                } else if (z13) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextFolder);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextFolder);
                                } else {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextChannel);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextChannel);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(string2);
                            tpVar3.y = measureText2;
                            tpVar3.y = d3.g(60.0f, tpVar3.c, measureText2);
                            int i20 = tpVar3.y;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            tpVar3.v = new StaticLayout(string2, textPaint2, i20, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(string3);
                            tpVar3.E = measureText3;
                            tpVar3.E = d3.g(60.0f, tpVar3.c, measureText3);
                            tpVar3.w = new StaticLayout(string3, textPaint2, tpVar3.E, alignment, 1.0f, 0.0f, false);
                            imageReceiver.setImageCoords((tpVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + tpVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                            imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                            tpVar3.c0.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                            if (z12) {
                                tpVar3.I = tpVar3.H == null ? 0L : r3.id;
                            }
                        }
                    }
                    i11 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                    tpVar3.x = measureText4;
                    int g72 = d3.g(60.0f, tpVar3.c, measureText4);
                    tpVar3.x = g72;
                    tpVar3.s = org.telegram.ui.Components.qx0.c(string, textPaint, g72, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, g72, 1, true);
                    if (!tpVar3.V) {
                    }
                    int measureText22 = (int) textPaint2.measureText(string2);
                    tpVar3.y = measureText22;
                    tpVar3.y = d3.g(60.0f, tpVar3.c, measureText22);
                    int i202 = tpVar3.y;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    tpVar3.v = new StaticLayout(string2, textPaint2, i202, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(string3);
                    tpVar3.E = measureText32;
                    tpVar3.E = d3.g(60.0f, tpVar3.c, measureText32);
                    tpVar3.w = new StaticLayout(string3, textPaint2, tpVar3.E, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.setImageCoords((tpVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + tpVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                    tpVar3.c0.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                    if (z12) {
                    }
                }
                float min = Math.min(1.0f, wnVar.da / AndroidUtilities.dp(110.0f));
                canvas2.translate(wnVar.O9() ? AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(71.0f), wnVar.d9()) : 0.0f, -(wnVar.j9(org.telegram.ui.Components.b41.c) + wnVar.S.getInputBubbleHeight() + wnVar.v.d() + AndroidUtilities.dp(10.0f)));
                wnVar.fa.a(canvas2, wnVar.x0, min, 1.0f - wnVar.ka);
                canvas2.restore();
                if (wnVar.ja != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.x0.getMeasuredWidth(), wnVar.ja.x0.getMeasuredHeight(), (int) (wnVar.ka * f7), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - wnVar.da) - f11);
                    wnVar.ja.x0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f7 = 255.0f;
        f10 = 2.0f;
        if (wnVar.da != 0.0f) {
        }
        tpVar = wnVar.fa;
        if (tpVar == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.H3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.H3;
        pm pmVar = wnVar.s9;
        pmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(pmVar.f0);
            pmVar.z = false;
        }
        if (this.V1 || ((iVar = wnVar.na) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (!kVar.q() && !wnVar.M9()) {
            E1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rj rjVar;
        hm hmVar;
        View view;
        MessageObject messageObject;
        wn wnVar = this.H3;
        if (wnVar.ob && wnVar.nb && getMeasuredHeight() > 0 && getPaddingTop() > 0 && wnVar.A0 != null) {
            wnVar.ob = false;
            wnVar.z0.G = false;
            MessageObject messageObject2 = (MessageObject) wnVar.E6[0].get(wnVar.pb);
            int indexOf = messageObject2 != null ? wnVar.K6.indexOf(messageObject2) : -1;
            if (indexOf >= 0) {
                wnVar.z0.i1(wnVar.A0.J + indexOf, Math.max(AndroidUtilities.dp(50.0f) + wnVar.X8(messageObject2), AndroidUtilities.dp(102.0f)), false);
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (wnVar.pb != 0 && (rjVar = wnVar.x0) != null && (hmVar = wnVar.A0) != null && !hmVar.N && !rjVar.V1) {
            int childCount = rjVar.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    view = null;
                    break;
                }
                view = wnVar.x0.getChildAt(i14);
                if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view).getMessageObject()) != null && messageObject.getId() == wnVar.pb && messageObject.getDialogId() == wnVar.j6) {
                    break;
                } else {
                    i14++;
                }
            }
            if (view != null) {
                int i15 = wnVar.qb;
                if (i15 != Integer.MIN_VALUE) {
                    int top = view.getTop() - i15;
                    if (top != 0) {
                        wnVar.x0.scrollBy(0, top);
                    }
                } else if (wnVar.x0.getPaddingTop() > 0 && !wnVar.ob) {
                    wnVar.qb = view.getTop();
                }
            } else if (wnVar.qb != Integer.MIN_VALUE) {
                wnVar.pb = 0;
                wnVar.qb = TLObject.FLAG_31;
            }
        }
        int i16 = this.h3;
        int i17 = i12 - i10;
        if (i16 != i17) {
            if (i16 != 0) {
                wnVar.u9(false);
            }
            this.h3 = i17;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.G3 != measuredHeight) {
            this.F3 = true;
            tj tjVar = wnVar.y0;
            if (tjVar != null) {
                tjVar.g();
            }
            wnVar.m9.a();
            this.F3 = false;
            this.G3 = measuredHeight;
        }
        wnVar.h6 = false;
        pm pmVar = wnVar.s9;
        if (pmVar != null && pmVar.x()) {
            wnVar.s9.w();
        }
        wnVar.B9();
        wnVar.P9();
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        tp tpVar;
        wn wnVar = this.H3;
        oe.b bVar = wnVar.Vc;
        pm pmVar = wnVar.s9;
        pmVar.getClass();
        final int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(pmVar.f0);
            pmVar.z = false;
        }
        if (motionEvent.getAction() == 0) {
            wnVar.Ia = true;
        }
        if (wnVar.da != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, wnVar.da / AndroidUtilities.dp(110.0f));
            final int i13 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (tpVar = wnVar.fa) == null || tpVar.R) {
                tp tpVar2 = wnVar.fa;
                if (tpVar2 != null && tpVar2.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    tp tpVar3 = wnVar.fa;
                    if (currentTimeMillis - tpVar3.U < 500 && tpVar3.M) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        wnVar.ga = animatorSet;
                        if (wnVar.fa != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(wnVar.da, AndroidUtilities.dp(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                            public final /* synthetic */ rj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        wn wnVar2 = this.b.H3;
                                        wnVar2.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar2.x0.invalidate();
                                        break;
                                    case 1:
                                        wn wnVar3 = this.b.H3;
                                        wnVar3.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar3.x0.invalidate();
                                        break;
                                    case 2:
                                        wn wnVar4 = this.b.H3;
                                        wnVar4.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar4.x0.invalidate();
                                        break;
                                    default:
                                        wn wnVar5 = this.b.H3;
                                        wnVar5.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar5.x0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.ds.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                            public final /* synthetic */ rj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        wn wnVar2 = this.b.H3;
                                        wnVar2.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar2.x0.invalidate();
                                        break;
                                    case 1:
                                        wn wnVar3 = this.b.H3;
                                        wnVar3.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar3.x0.invalidate();
                                        break;
                                    case 2:
                                        wn wnVar4 = this.b.H3;
                                        wnVar4.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar4.x0.invalidate();
                                        break;
                                    default:
                                        wn wnVar5 = this.b.H3;
                                        wnVar5.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar5.x0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(mi.m.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(wnVar.da, 0.0f);
                wnVar.ga = ofFloat3;
                if (wnVar.fa != null) {
                    bVar.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                    public final /* synthetic */ rj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                wn wnVar2 = this.b.H3;
                                wnVar2.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar2.x0.invalidate();
                                break;
                            case 1:
                                wn wnVar3 = this.b.H3;
                                wnVar3.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar3.x0.invalidate();
                                break;
                            case 2:
                                wn wnVar4 = this.b.H3;
                                wnVar4.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar4.x0.invalidate();
                                break;
                            default:
                                wn wnVar5 = this.b.H3;
                                wnVar5.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar5.x0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(mi.m.V);
                ofFloat3.start();
            } else if (tpVar.K != 1.0f) {
                float f7 = wnVar.da;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                wnVar.ga = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                    public final /* synthetic */ rj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                wn wnVar2 = this.b.H3;
                                wnVar2.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar2.x0.invalidate();
                                break;
                            case 1:
                                wn wnVar3 = this.b.H3;
                                wnVar3.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar3.x0.invalidate();
                                break;
                            case 2:
                                wn wnVar4 = this.b.H3;
                                wnVar4.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar4.x0.invalidate();
                                break;
                            default:
                                wn wnVar5 = this.b.H3;
                                wnVar5.da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar5.x0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
                ofFloat4.setInterpolator(dsVar);
                ofFloat4.start();
                final tp tpVar4 = wnVar.fa;
                xi xiVar = new xi(this, i13);
                AnimatorSet animatorSet2 = tpVar4.J;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    tpVar4.J.cancel();
                }
                tpVar4.Y = xiVar;
                tpVar4.J = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(tpVar4.K, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.rp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                tp tpVar5 = tpVar4;
                                tpVar5.getClass();
                                tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tpVar5.T.invalidate();
                                View view = tpVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                tp tpVar6 = tpVar4;
                                tpVar6.getClass();
                                tpVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = tpVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(tpVar4.L, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.rp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                tp tpVar5 = tpVar4;
                                tpVar5.getClass();
                                tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tpVar5.T.invalidate();
                                View view = tpVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                tp tpVar6 = tpVar4;
                                tpVar6.getClass();
                                tpVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = tpVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                tpVar4.J.addListener(new sp(tpVar4, i11));
                tpVar4.J.playTogether(ofFloat5, ofFloat6);
                tpVar4.J.setDuration(120L);
                tpVar4.J.setInterpolator(dsVar);
                tpVar4.J.start();
            } else {
                wn.a2(wnVar);
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            if (kVar.q() || wnVar.M9()) {
                return onTouchEvent;
            }
            E1(motionEvent);
            if (wnVar.v9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.H3.g9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.bn0 C4;
        org.telegram.ui.Components.ub1 ub1Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.H3.t9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.s1) && (C4 = ((org.telegram.ui.Cells.s1) view).C4()) != null && (ub1Var = C4.n) != null && C4.r && ub1Var.w && !ub1Var.D) {
                if (!ub1Var.x) {
                    return;
                }
                if (!ub1Var.y && (ub1Var.K & 3) != 1) {
                    return;
                }
            }
            E1(null);
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.F3) {
            return;
        }
        jh.a aVar = this.H3.qc;
        if (aVar.b != 0) {
            int childCount = aVar.a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(s4.m0 m0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(m0Var);
    }

    @Override // org.telegram.ui.Components.nm0, android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            wn wnVar = this.H3;
            wnVar.A9();
            wnVar.C9();
        }
    }
}
