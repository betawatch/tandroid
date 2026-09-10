package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tt {
    public static TextPaint f0;
    public static volatile tt g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.pd0 C;
    public Path D;
    public boolean E;
    public float F;
    public StaticLayout G;
    public long H;
    public int I;
    public Drawable J;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L;
    public float M;
    public final Paint N;
    public nh1 O;
    public org.telegram.ui.Components.yb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final pt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public org.telegram.ui.ActionBar.f6 c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public org.telegram.ui.Components.g21 j;
    public org.telegram.ui.ActionBar.p1 k;
    public rt l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final eh.b s;
    public final zg.a t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public k0 y;
    public bi.n7 z;
    public float e = 0.0f;
    public i0.c q = i0.c.e;

    public tt() {
        eh.b bVar = new eh.b();
        this.s = bVar;
        this.t = new zg.a(bVar);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new pt(this);
    }

    public static /* synthetic */ void a(tt ttVar, Bitmap bitmap, Bitmap bitmap2) {
        eh.b bVar = ttVar.s;
        Paint paint = ttVar.N;
        ttVar.A.setVisible(true, false);
        ttVar.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        bVar.a(bitmap2);
        fh.d.c(bVar, ttVar.y);
        ttVar.t.d();
        ttVar.e0 = false;
        bi.n7 n7Var = ttVar.z;
        if (n7Var != null) {
            n7Var.invalidate();
        }
    }

    public static int d(tt ttVar, int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, ttVar.c0);
    }

    public static boolean h(tt ttVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        float f7;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        ph.q qVar;
        rt rtVar = ttVar.l;
        if (rtVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = rtVar.d();
        TLRPC.PollAnswer g10 = ttVar.l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        boolean z11 = pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d);
        boolean z12 = (MessageObject.isVoted(d) || d.poll.closed || ttVar.l.c()) ? false : true;
        boolean z13 = !z12 && MessageObject.canUnvote(d);
        if (z11) {
            ph.q qVar2 = new ph.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ttVar.r, ttVar.c0);
            org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(actionBarPopupWindow$ActionBarPopupWindowLayout, ttVar.c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(w70Var.B);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, ttVar.c0)));
            zg.a aVar = ttVar.t;
            ch.e k10 = dh.c.k(ttVar.c0);
            org.telegram.ui.ActionBar.p2 p2Var = null;
            LinearLayout linearLayout = w70Var.B;
            if (linearLayout != null) {
                bh.d c10 = aVar.c(linearLayout, null, true);
                c10.n(k10);
                linearLayout.setBackground(c10);
            }
            z10 = true;
            w70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new fj(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            w70Var.k();
            MessageObject y3 = ttVar.l.y();
            Activity activity = ttVar.w;
            if ((activity instanceof LaunchActivity) && y3 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    p2Var = launchActivity.O().getLastFragment();
                }
                if (p2Var != null) {
                    org.telegram.ui.Components.r61 a2 = qVar2.a(p2Var, y3.getDialogId(), y3.getId(), g10.option, pollResult.voters, new pf(23, ttVar, p2Var));
                    qVar = qVar2;
                    w70Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.a6.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, ttVar.c0), 12, 0));
                    qVar.setOnClickListener(new bi.j5(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ttVar.c0);
                    m1Var.setTag(R.id.fit_width_tag, 1);
                    m1Var.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, ttVar.c0)));
                    m1Var.setLayoutParams(w7.a6.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.a6.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, ttVar.c0), 12, 0));
            qVar.setOnClickListener(new bi.j5(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ttVar.c0);
            m1Var2.setTag(R.id.fit_width_tag, 1);
            m1Var2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, ttVar.c0)));
            m1Var2.setLayoutParams(w7.a6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var2);
        } else {
            z10 = true;
        }
        if (z12) {
            f7 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, ttVar.c0).setOnClickListener(new ht(ttVar, 2));
        } else {
            f7 = 0.06f;
        }
        if (z13) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, ttVar.c0).setOnClickListener(new ht(ttVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z11 && (z12 || z13)) {
            org.telegram.ui.ActionBar.m1 m1Var3 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ttVar.c0);
            m1Var3.setTag(R.id.fit_width_tag, 1);
            m1Var3.setColor(org.telegram.ui.ActionBar.j6.l1(f7, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, ttVar.c0)));
            m1Var3.setLayoutParams(w7.a6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(m1Var3);
        }
        if (z11 || z12 || z13) {
            return z10;
        }
        return false;
    }

    public static tt q() {
        tt ttVar;
        tt ttVar2 = g0;
        if (ttVar2 != null) {
            return ttVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                ttVar = g0;
                if (ttVar == null) {
                    ttVar = new tt();
                    g0 = ttVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ttVar;
    }

    public final void n() {
        if (this.w == null || this.K) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.U);
        this.F = 1.0f;
        this.H = System.currentTimeMillis();
        this.z.invalidate();
        this.W = null;
        this.a0 = null;
        this.Y = null;
        this.l = null;
        this.E = false;
        AndroidUtilities.runOnUIThread(new ft(this, 0), 200L);
        nh1 nh1Var = this.O;
        if (nh1Var != null) {
            nh1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.wr.f).start();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    public final void o() {
        yg.c0 reactionsWindow;
        org.telegram.ui.Components.yb ybVar = this.P;
        if (ybVar != null && (reactionsWindow = ybVar.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.p1 p1Var = this.k;
        if (p1Var != null) {
            p1Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.em.q(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.wr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.vl0 vl0Var, rt rtVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        this.l = rtVar;
        if (rtVar != null) {
            this.m = rtVar.j();
            this.n = this.l.o();
        }
        rt rtVar2 = this.l;
        if ((rtVar2 == null || rtVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = vl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = vl0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top > y3 || bottom < y3 || left > x10 || right < x10) {
                    i11++;
                } else {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.g8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.g8) childAt).a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.e8) {
                        if (((org.telegram.ui.Cells.e8) childAt).a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                            if (e2Var.a.getBitmap() != null) {
                                int i12 = e2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && e2Var.s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.nv) {
                            imageReceiver.setRoundRadius(0);
                        } else if (!(childAt instanceof org.telegram.ui.Components.az) || ((org.telegram.ui.Components.az) childAt).getSpan() == null) {
                            if ((childAt instanceof org.telegram.ui.Components.yy0) && (((org.telegram.ui.Components.yy0) childAt).b instanceof org.telegram.ui.Components.p5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        } else {
                            imageReceiver.setRoundRadius(0);
                        }
                    }
                    if (i10 != -1) {
                        this.a = x10;
                        this.b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.g21 g21Var = new org.telegram.ui.Components.g21(this, vl0Var, i10, f6Var, 1);
                        this.j = g21Var;
                        AndroidUtilities.runOnUIThread(g21Var, 200L);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(MotionEvent motionEvent, org.telegram.ui.Components.vl0 vl0Var, Object obj, rt rtVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        rt rtVar2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = rtVar;
        if (rtVar != null) {
            this.m = rtVar.j();
            this.n = this.l.o();
        }
        rt rtVar3 = this.l;
        if ((rtVar3 == null || rtVar3.h()) && (this.j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yo0(26, vl0Var, obj), 150L);
                org.telegram.ui.Components.g21 g21Var = this.j;
                if (g21Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(g21Var);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    n();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof org.telegram.ui.Cells.g8) {
                            ((org.telegram.ui.Cells.g8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.e8) {
                            ((org.telegram.ui.Cells.e8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.e2) {
                            ((org.telegram.ui.Cells.e2) view3).setScaled(false);
                        }
                        this.h = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.E) {
                    if (motionEvent.getAction() == 2) {
                        if (this.V != 1 || this.m) {
                            int x10 = (int) motionEvent.getX();
                            int y3 = (int) motionEvent.getY();
                            int childCount = vl0Var.getChildCount();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= childCount) {
                                    break;
                                }
                                View childAt = vl0Var.getChildAt(i12);
                                if (childAt == null) {
                                    break;
                                }
                                int top = childAt.getTop();
                                int bottom = childAt.getBottom();
                                int left = childAt.getLeft();
                                int right = childAt.getRight();
                                if (top > y3 || bottom < y3 || left > x10 || right < x10) {
                                    i12++;
                                } else {
                                    boolean z10 = childAt instanceof org.telegram.ui.Cells.g8;
                                    ImageReceiver imageReceiver = this.A;
                                    if (z10) {
                                        imageReceiver.setRoundRadius(0);
                                    } else if (childAt instanceof org.telegram.ui.Cells.e8) {
                                        imageReceiver.setRoundRadius(0);
                                    } else {
                                        if (childAt instanceof org.telegram.ui.Cells.e2) {
                                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                                            int i13 = e2Var.O;
                                            if (i13 == 6) {
                                                imageReceiver.setRoundRadius(0);
                                                i11 = 0;
                                            } else if (i13 == 2 && e2Var.s) {
                                                imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                                i11 = 1;
                                            } else {
                                                i11 = -1;
                                            }
                                            i10 = i11;
                                        } else {
                                            if (childAt instanceof org.telegram.ui.Components.nv) {
                                                imageReceiver.setRoundRadius(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.az) || ((org.telegram.ui.Components.az) childAt).getSpan() == null) {
                                                i10 = -1;
                                            } else {
                                                imageReceiver.setRoundRadius(0);
                                            }
                                            i10 = 2;
                                        }
                                        if (i10 != -1 && childAt != this.h) {
                                            rtVar2 = this.l;
                                            if (rtVar2 != null) {
                                                rtVar2.s();
                                            }
                                            view = this.h;
                                            if (!(view instanceof org.telegram.ui.Cells.g8)) {
                                                ((org.telegram.ui.Cells.g8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.e8) {
                                                ((org.telegram.ui.Cells.e8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.e2) {
                                                ((org.telegram.ui.Cells.e2) view).setScaled(false);
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            p();
                                            AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof org.telegram.ui.Cells.g8)) {
                                                org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view2;
                                                TLRPC.Document sticker = g8Var.getSticker();
                                                SendMessagesHelper.ImportingSticker stickerPath = g8Var.getStickerPath();
                                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(g8Var.getSticker(), null, Integer.valueOf(this.r));
                                                rt rtVar4 = this.l;
                                                t(sticker, stickerPath, findAnimatedEmojiEmoticon, rtVar4 != null ? rtVar4.E(false) : null, null, i10, g8Var.y, g8Var.getParentObject(), f6Var, 0);
                                                g8Var.setScaled(true);
                                            } else if (view2 instanceof org.telegram.ui.Cells.e8) {
                                                org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view2;
                                                TLRPC.Document sticker2 = e8Var.getSticker();
                                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(e8Var.getSticker(), null, Integer.valueOf(this.r));
                                                rt rtVar5 = this.l;
                                                t(sticker2, null, findAnimatedEmojiEmoticon2, rtVar5 != null ? rtVar5.E(false) : null, null, i10, false, e8Var.getParentObject(), f6Var, 0);
                                                e8Var.setScaled(true);
                                                this.i = e8Var.h;
                                            } else if (view2 instanceof org.telegram.ui.Cells.e2) {
                                                org.telegram.ui.Cells.e2 e2Var2 = (org.telegram.ui.Cells.e2) view2;
                                                TLRPC.Document document2 = e2Var2.getDocument();
                                                rt rtVar6 = this.l;
                                                t(document2, null, null, rtVar6 != null ? rtVar6.E(true) : null, e2Var2.getBotInlineResult(), i10, false, e2Var2.getBotInlineResult() != null ? e2Var2.getInlineBot() : e2Var2.getParentObject(), f6Var, 0);
                                                if (i10 != 1 || this.m) {
                                                    e2Var2.setScaled(true);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.nv) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.nv) view2).getDocument();
                                                if (document3 != null) {
                                                    t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.r)), null, null, i10, false, null, f6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.az) {
                                                org.telegram.ui.Components.y5 span = ((org.telegram.ui.Components.az) view2).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document document4 = span.document;
                                                    if (document4 == null) {
                                                        document4 = org.telegram.ui.Components.p5.f(this.r, span.getDocumentId());
                                                    }
                                                    document = document4;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.r)), null, null, i10, false, null, f6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.yy0) {
                                                Drawable drawable = ((org.telegram.ui.Components.yy0) view2).b;
                                                TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.p5 ? ((org.telegram.ui.Components.p5) drawable).e : null;
                                                if (document5 != null) {
                                                    t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(this.r)), null, null, i10, false, null, f6Var, 0);
                                                }
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                Vibrator vibrator = (Vibrator) this.z.getContext().getSystemService("vibrator");
                                                if (this.d0 == null) {
                                                    this.d0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
                                                }
                                                vibrator.cancel();
                                                vibrator.vibrate(this.d0);
                                                return true;
                                            }
                                        }
                                    }
                                    i10 = 0;
                                    if (i10 != -1) {
                                        rtVar2 = this.l;
                                        if (rtVar2 != null) {
                                        }
                                        view = this.h;
                                        if (!(view instanceof org.telegram.ui.Cells.g8)) {
                                        }
                                        this.h = childAt;
                                        this.i = false;
                                        this.K = false;
                                        this.R = false;
                                        p();
                                        AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                        view2 = this.h;
                                        if (!(view2 instanceof org.telegram.ui.Cells.g8)) {
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                    }
                                }
                            }
                        } else if (!this.K) {
                            if (this.F == 1.0f) {
                                if (this.c == -10000.0f) {
                                    this.c = motionEvent.getY();
                                    this.d = 0.0f;
                                    this.e = 0.0f;
                                    return true;
                                }
                                float y10 = motionEvent.getY();
                                float f7 = (y10 - this.c) + this.d;
                                this.d = f7;
                                this.c = y10;
                                if (f7 > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f7 < (-AndroidUtilities.dp(60.0f))) {
                                    this.d = -AndroidUtilities.dp(60.0f);
                                }
                                float f10 = this.d;
                                float dp = AndroidUtilities.dp(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f10) * 0.55f) / dp) + 1.0f))) * dp)) * (f10 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-AndroidUtilities.dp(55.0f))) {
                                    pt ptVar = this.U;
                                    AndroidUtilities.cancelRunOnUIThread(ptVar);
                                    ptVar.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.j != null) {
                    if (motionEvent.getAction() != 2) {
                        AndroidUtilities.cancelRunOnUIThread(this.j);
                        this.j = null;
                        return false;
                    }
                    if (Math.hypot(this.a - motionEvent.getX(), this.b - motionEvent.getY()) > AndroidUtilities.dp(10.0f)) {
                        AndroidUtilities.cancelRunOnUIThread(this.j);
                        this.j = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        ImageReceiver imageReceiver;
        String str3;
        boolean z11;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver2;
        CharSequence charSequence;
        String str4;
        int i12;
        String str5;
        ImageReceiver imageReceiver3;
        pt ptVar;
        if (this.w == null || this.y == null) {
            return;
        }
        this.c0 = f6Var;
        this.p = z10;
        this.G = null;
        this.u.setColor(AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)) ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver4 = this.A;
        imageReceiver4.setColorFilter(null);
        ImageReceiver imageReceiver5 = this.B;
        pt ptVar2 = this.U;
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            ImageReceiver imageReceiver6 = imageReceiver5;
            if (document == null && importingSticker == null) {
                return;
            }
            if (f0 == null) {
                TextPaint textPaint = new TextPaint(1);
                f0 = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(24.0f));
            }
            imageReceiver6.clearImage();
            this.S = false;
            if (document != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= document.attributes.size()) {
                        imageReceiver = imageReceiver6;
                        inputStickerSet = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                    imageReceiver = imageReceiver6;
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                        break;
                    }
                    i13++;
                    imageReceiver6 = imageReceiver;
                }
                if (str != null) {
                    imageReceiver2 = imageReceiver4;
                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f0.getFontMetricsInt(), false), f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    imageReceiver2 = imageReceiver4;
                }
                if (inputStickerSet != null || i10 == 2) {
                    AndroidUtilities.cancelRunOnUIThread(ptVar2);
                    AndroidUtilities.runOnUIThread(ptVar2, i11 > 0 ? i11 : 1300L);
                }
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.r).getStickerSet(inputStickerSet, true);
                if (stickerSet != null && stickerSet.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.a0 = inputStickerSet;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (MessageObject.isVideoStickerDocument(document)) {
                    charSequence = "";
                    str4 = "…";
                    imageReceiver4 = imageReceiver2;
                    imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.a0, 1);
                } else {
                    charSequence = "";
                    str4 = "…";
                    imageReceiver4 = imageReceiver2;
                    imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.a0, 1);
                    if (MessageObject.isPremiumSticker(document)) {
                        this.S = true;
                        imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.a0, 1);
                    }
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.j6.n0(f6Var));
                }
                if (this.G == null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i14);
                        if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str4, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f0.getFontMetricsInt(), false), f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            break;
                        }
                        i14++;
                    }
                }
            } else {
                imageReceiver = imageReceiver6;
                if (importingSticker != null) {
                    str3 = "window";
                    imageReceiver4.setImage(importingSticker.path, null, null, importingSticker.animated ? "tgs" : null, 0L);
                    if (importingSticker.videoEditedInfo != null) {
                        if (this.C == null) {
                            org.telegram.ui.Components.pd0 pd0Var = new org.telegram.ui.Components.pd0(this.z.getContext());
                            this.C = pd0Var;
                            this.z.addView(pd0Var, new FrameLayout.LayoutParams(512, 512));
                        }
                        z11 = false;
                        this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                    } else {
                        z11 = false;
                    }
                    if (str != null) {
                        this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f0.getFontMetricsInt(), z11), f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.l.getClass();
                    AndroidUtilities.cancelRunOnUIThread(ptVar2);
                    AndroidUtilities.runOnUIThread(ptVar2, i11 > 0 ? i11 : 1300L);
                }
            }
            str3 = "window";
        } else {
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document);
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                forDocument.imageType = 2;
                if (documentVideoThumb != null) {
                    imageReceiver3 = imageReceiver5;
                    ptVar = ptVar2;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver3 = imageReceiver5;
                    ptVar = ptVar2;
                    imageReceiver4 = imageReceiver4;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver3 = imageReceiver5;
                ptVar = ptVar2;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver4 = imageReceiver4;
                    imageReceiver4.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver4 = imageReceiver4;
                    imageReceiver4.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            AndroidUtilities.cancelRunOnUIThread(ptVar);
            AndroidUtilities.runOnUIThread(ptVar, 2000L);
            str3 = "window";
            imageReceiver = imageReceiver3;
        }
        if (imageReceiver4.getLottieAnimation() != null) {
            i12 = 0;
            imageReceiver4.getLottieAnimation().M(0);
        } else {
            i12 = 0;
        }
        if (this.S && imageReceiver.getLottieAnimation() != null) {
            imageReceiver.getLottieAnimation().M(i12);
        }
        this.V = i10;
        this.W = document;
        this.X = importingSticker;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = f6Var;
        this.z.invalidate();
        if (this.E) {
            return;
        }
        AndroidUtilities.lockOrientation(this.w);
        try {
            if (this.y.getParent() != null) {
                str5 = str3;
                try {
                    ((WindowManager) this.w.getSystemService(str5)).removeView(this.y);
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    ((WindowManager) this.w.getSystemService(str5)).addView(this.y, this.x);
                    this.E = true;
                    this.F = 0.0f;
                    this.c = -10000.0f;
                    this.g = 0.0f;
                    this.d = 0.0f;
                    this.e = 0.0f;
                    this.H = System.currentTimeMillis();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
                }
            } else {
                str5 = str3;
            }
        } catch (Exception e7) {
            e = e7;
            str5 = str3;
        }
        ((WindowManager) this.w.getSystemService(str5)).addView(this.y, this.x);
        this.E = true;
        this.F = 0.0f;
        this.c = -10000.0f;
        this.g = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.H = System.currentTimeMillis();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
    }

    public final void u() {
        org.telegram.ui.Components.g21 g21Var = this.j;
        if (g21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g21Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(rt rtVar) {
        this.l = rtVar;
        if (rtVar != null) {
            this.m = rtVar.j();
            this.n = this.l.o();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        int i11 = this.r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.w == activity) {
            return;
        }
        this.w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.y = new k0(this, activity, 5);
        gh.k kVar = new gh.k(this.y);
        k0 k0Var = this.y;
        zg.a aVar = this.t;
        aVar.d = kVar;
        aVar.e = k0Var;
        aVar.c = new pe.b(true);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.y;
        gt gtVar = new gt(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(k0Var2, gtVar);
        bi.n7 n7Var = new bi.n7(this, activity);
        this.z = n7Var;
        n7Var.setFocusable(false);
        this.y.addView(this.z, w7.a6.e(-1, -1, 51));
        this.z.setOnTouchListener(new e0(this, 1));
        MessagesController.getInstance(this.r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.g8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.g8) {
            ((org.telegram.ui.Cells.g8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.e8) {
            ((org.telegram.ui.Cells.e8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view2).setScaled(false);
        }
        this.h = g8Var;
        TLRPC.Document sticker = g8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = g8Var.getStickerPath();
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(g8Var.getSticker(), null, Integer.valueOf(this.r));
        rt rtVar = this.l;
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, rtVar != null ? rtVar.E(false) : null, null, 0, g8Var.y, g8Var.getParentObject(), this.c0, 0);
        pt ptVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ptVar);
        AndroidUtilities.runOnUIThread(ptVar, 16L);
        g8Var.setScaled(true);
        return true;
    }
}
