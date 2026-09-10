package yg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import org.telegram.ui.jk;
import org.telegram.ui.wj;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final eo a;
    public u b;
    public List c;
    public boolean d;
    public MessageObject e;
    public final int f;
    public final int h;
    public float n;
    public float r;
    public float s;
    public long v;
    public boolean w;
    public boolean x;
    public final int[] y;

    public v(eo eoVar, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = 22;
        this.h = 24;
        this.y = new int[2];
        setVisibility(8);
        this.a = eoVar;
        setClipToPadding(false);
        setClipChildren(false);
        eoVar.x0.j(new al0(this, 19));
    }

    public final void a(boolean z10) {
        int i10 = 1;
        if (z10) {
            setVisibility(0);
            post(new t(this, i10));
            return;
        }
        this.x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new qg.o(this, 13));
        duration.addListener(new b(this, i10));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.d || this.c.isEmpty()) {
            return null;
        }
        int i10 = 0;
        MessageObject messageObject = (MessageObject) this.c.get(0);
        if (messageObject.getGroupId() != 0 && (y82 = this.a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                MessageObject messageObject2 = arrayList.get(i10);
                i10++;
                MessageObject messageObject3 = messageObject2;
                TLRPC.Message message = messageObject3.messageOwner;
                if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                    return messageObject3;
                }
            }
        }
        return messageObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10) {
        int height;
        boolean z11;
        boolean z12;
        u uVar;
        if (!this.d || this.e == null || this.b == null) {
            return;
        }
        long min = Math.min(16L, System.currentTimeMillis() - this.v);
        this.v = System.currentTimeMillis();
        float f7 = this.n;
        float f10 = this.r;
        if (f7 != f10) {
            float f11 = min / 220.0f;
            if (f10 > f7) {
                this.n = Math.min(f7 + f11, f10);
            } else if (f10 < f7) {
                this.n = Math.max(f7 - f11, f10);
            }
            AndroidUtilities.runOnUIThread(new t(this, 0));
        }
        eo eoVar = this.a;
        wj wjVar = eoVar.x0;
        int[] iArr = this.y;
        wjVar.getLocationInWindow(iArr);
        boolean z13 = true;
        float f12 = iArr[1];
        getLocationInWindow(iArr);
        float f13 = (f12 - iArr[1]) - eoVar.N9;
        boolean z14 = false;
        for (int i10 = 0; i10 < wjVar.getChildCount(); i10++) {
            View childAt = wjVar.getChildAt(i10);
            if (childAt instanceof t1) {
                t1 t1Var = (t1) childAt;
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject.getId() == this.e.getId()) {
                    boolean isOutOwner = messageObject.isOutOwner();
                    u uVar2 = this.b;
                    if (uVar2 != null) {
                        uVar2.setMirrorX(isOutOwner);
                        u uVar3 = this.b;
                        int dp = AndroidUtilities.dp(4.0f);
                        boolean z15 = LocaleController.isRTL;
                        int i11 = this.h;
                        int i12 = dp + ((z15 || isOutOwner) ? 0 : i11);
                        float f14 = this.f;
                        int dp2 = AndroidUtilities.dp(f14);
                        int dp3 = AndroidUtilities.dp(4.0f);
                        if (!LocaleController.isRTL && !isOutOwner) {
                            i11 = 0;
                        }
                        uVar3.setPadding(i12, dp2, dp3 + i11, AndroidUtilities.dp(f14));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : wjVar.getHeight();
                    if (t1Var.getCurrentMessagesGroup() != null) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams = t1Var.getCurrentMessagesGroup().transitionParams;
                        height = transitionParams.bottom - transitionParams.top;
                    } else {
                        height = t1Var.getHeight();
                    }
                    float y3 = (t1Var.getY() + f13) - AndroidUtilities.dp(74.0f);
                    float dp4 = AndroidUtilities.dp(14.0f);
                    float dp5 = height2 - AndroidUtilities.dp(218.0f);
                    jk jkVar = eoVar.X1;
                    if (jkVar != null && jkVar.getVisibility() == 0) {
                        dp4 += jkVar.getHeight();
                    }
                    float f15 = height;
                    if (y3 > dp4 - (f15 / 2.0f) && y3 < dp5) {
                        this.r = 0.0f;
                        z11 = false;
                    } else {
                        if (y3 < (dp4 - f15) - AndroidUtilities.dp(92.0f) || y3 > dp5) {
                            z11 = false;
                            z12 = false;
                            if (!z10) {
                                this.n = this.r;
                            }
                            float interpolation = (wr.f.getInterpolation(this.n) * this.s) + y3;
                            uVar = this.b;
                            if (uVar != null) {
                                return;
                            }
                            if (z11 != uVar.N) {
                                uVar.setFlippedVertically(z11);
                                AndroidUtilities.runOnUIThread(new t(this, 0));
                            }
                            if (z12 != this.b.isEnabled()) {
                                this.b.setEnabled(z12);
                                this.b.invalidate();
                                if (z12) {
                                    this.b.setVisibility(0);
                                    if (!this.x) {
                                        this.x = true;
                                        this.b.p(this.e, eoVar.Z7, true);
                                    }
                                }
                            }
                            this.b.setTranslationY(w7.q.a(interpolation, dp4, dp5));
                            this.b.setTranslationX(t1Var.E2(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                            int g10 = hc.b.g(32.0f, t1Var.getBackgroundDrawableLeft(), 0);
                            int g11 = hc.b.g(32.0f, t1Var.getWidth() - t1Var.getBackgroundDrawableRight(), (int) t1Var.E2(true));
                            int dp6 = AndroidUtilities.dp(40.0f) * 8;
                            if ((getWidth() - g11) - g10 < dp6) {
                                if (isOutOwner) {
                                    g10 = Math.min(g10, getWidth() - dp6);
                                    g11 = 0;
                                } else {
                                    g11 = Math.min(g11, getWidth() - dp6);
                                    g10 = 0;
                                }
                            }
                            int i13 = isOutOwner ? 5 : 3;
                            if (i13 != layoutParams.gravity) {
                                layoutParams.gravity = i13;
                                z14 = true;
                            }
                            if (g10 != layoutParams.leftMargin) {
                                layoutParams.leftMargin = g10;
                                z14 = true;
                            }
                            if (g11 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = g11;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.b.requestLayout();
                                return;
                            }
                            return;
                        }
                        this.s = AndroidUtilities.dp(56.0f) + height;
                        this.r = 1.0f;
                        z11 = true;
                    }
                    z12 = true;
                    if (!z10) {
                    }
                    float interpolation2 = (wr.f.getInterpolation(this.n) * this.s) + y3;
                    uVar = this.b;
                    if (uVar != null) {
                    }
                }
            }
        }
        u uVar4 = this.b;
        if (uVar4 == null || !uVar4.isEnabled()) {
            return;
        }
        this.b.setEnabled(false);
    }

    public final boolean d() {
        return this.d && !this.w;
    }

    public void setHiddenByScroll(boolean z10) {
        this.w = z10;
        if (z10) {
            a(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelectedMessages(List<MessageObject> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.c = list;
        eo eoVar = this.a;
        int i10 = eoVar.R3;
        boolean z10 = true;
        if (i10 != 1 && i10 != 5 && i10 != 6 && !eoVar.A9() && !eoVar.u() && (((chatFull = eoVar.Z7) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
            long j3 = 0;
            boolean z11 = false;
            for (MessageObject messageObject : list) {
                if ((messageObject != null && (message = messageObject.messageOwner) != null && message.rich_message != null) || (messageObject != null && !messageObject.needDrawBluredPreview() && ((MessageObject.isPhoto(messageObject.messageOwner) && MessageObject.getMedia(messageObject.messageOwner).webpage == null) || (messageObject.getDocument() != null && (MessageObject.isVideoDocument(messageObject.getDocument()) || MessageObject.isGifDocument(messageObject.getDocument())))))) {
                    if (!z11) {
                        j3 = messageObject.getGroupId();
                        z11 = true;
                    } else if (j3 == messageObject.getGroupId() && j3 != 0) {
                    }
                }
            }
            if (z10 == this.d) {
                this.d = z10;
                this.w = false;
                a(z10);
                return;
            } else {
                if (z10) {
                    this.e = b();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (z10 == this.d) {
        }
    }
}
