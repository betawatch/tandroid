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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rt {
    public static TextPaint f0;
    public static volatile rt g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.id0 C;
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
    public xg1 O;
    public org.telegram.ui.Components.rb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final nt U;
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
    public et j;
    public org.telegram.ui.ActionBar.p1 k;
    public pt l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final sg.b s;
    public final ng.a t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public n0 y;
    public ah.e z;
    public float e = 0.0f;
    public i0.b q = i0.b.e;

    public rt() {
        sg.b bVar = new sg.b();
        this.s = bVar;
        this.t = new ng.a(bVar);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new nt(this);
    }

    public static /* synthetic */ void a(rt rtVar, Bitmap bitmap, Bitmap bitmap2) {
        sg.b bVar = rtVar.s;
        Paint paint = rtVar.N;
        rtVar.A.setVisible(true, false);
        rtVar.v = bitmap;
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
        tg.c.c(bVar, rtVar.y);
        rtVar.t.d();
        rtVar.e0 = false;
        ah.e eVar = rtVar.z;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    public static int d(rt rtVar, int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, rtVar.c0);
    }

    public static boolean h(rt rtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z4;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        dh.u uVar;
        pt ptVar = rtVar.l;
        if (ptVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll e = ptVar.e();
        TLRPC.PollAnswer h = rtVar.l.h();
        if (e == null || e.poll == null || h == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(e, h.option);
        boolean z10 = pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(e);
        boolean z11 = (MessageObject.isVoted(e) || e.poll.closed || rtVar.l.c()) ? false : true;
        boolean z12 = !z11 && MessageObject.canUnvote(e);
        if (z10) {
            dh.u uVar2 = new dh.u(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), rtVar.r, rtVar.c0);
            org.telegram.ui.Components.p70 p70Var = new org.telegram.ui.Components.p70(actionBarPopupWindow$ActionBarPopupWindowLayout, rtVar.c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(p70Var.B);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            p70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, rtVar.c0)));
            ng.a aVar = rtVar.t;
            qg.d k10 = rg.b.k(rtVar.c0);
            org.telegram.ui.ActionBar.p2 p2Var = null;
            LinearLayout linearLayout = p70Var.B;
            if (linearLayout != null) {
                pg.b c3 = aVar.c(linearLayout, null, true);
                c3.n(k10);
                linearLayout.setBackground(c3);
            }
            z4 = true;
            p70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new bj(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            p70Var.k();
            MessageObject z13 = rtVar.l.z();
            Activity activity = rtVar.w;
            if ((activity instanceof LaunchActivity) && z13 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    p2Var = launchActivity.O().getLastFragment();
                }
                if (p2Var != null) {
                    org.telegram.ui.Components.g61 a2 = uVar2.a(p2Var, z13.getDialogId(), z13.getId(), h.option, pollResult.voters, new org.telegram.ui.Components.vk(10, rtVar, p2Var));
                    uVar = uVar2;
                    p70Var.q(a2);
                    uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    uVar.a.d(pollResult.recent_voters, false);
                    uVar.setLayoutParams(k7.b6.n(-1, 48));
                    uVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, rtVar.c0), 12, 0));
                    uVar.setOnClickListener(new lh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
                    org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), rtVar.c0);
                    m1Var.setTag(R.id.fit_width_tag, 1);
                    m1Var.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, rtVar.c0)));
                    m1Var.setLayoutParams(k7.b6.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var);
                }
            }
            uVar = uVar2;
            uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            uVar.a.d(pollResult.recent_voters, false);
            uVar.setLayoutParams(k7.b6.n(-1, 48));
            uVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, rtVar.c0), 12, 0));
            uVar.setOnClickListener(new lh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), rtVar.c0);
            m1Var2.setTag(R.id.fit_width_tag, 1);
            m1Var2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, rtVar.c0)));
            m1Var2.setLayoutParams(k7.b6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var2);
        } else {
            z4 = true;
        }
        if (z11) {
            f10 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, rtVar.c0).setOnClickListener(new ft(rtVar, 2));
        } else {
            f10 = 0.06f;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, rtVar.c0).setOnClickListener(new ft(rtVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.m1 m1Var3 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), rtVar.c0);
            m1Var3.setTag(R.id.fit_width_tag, 1);
            m1Var3.setColor(org.telegram.ui.ActionBar.j6.l1(f10, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, rtVar.c0)));
            m1Var3.setLayoutParams(k7.b6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(m1Var3);
        }
        if (z10 || z11 || z12) {
            return z4;
        }
        return false;
    }

    public static rt q() {
        rt rtVar;
        rt rtVar2 = g0;
        if (rtVar2 != null) {
            return rtVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                rtVar = g0;
                if (rtVar == null) {
                    rtVar = new rt();
                    g0 = rtVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rtVar;
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
        AndroidUtilities.runOnUIThread(new ct(this, 0), 200L);
        xg1 xg1Var = this.O;
        if (xg1Var != null) {
            xg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.mr.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.mr.f).start();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    public final void o() {
        mg.d0 reactionsWindow;
        org.telegram.ui.Components.rb rbVar = this.P;
        if (rbVar != null && (reactionsWindow = rbVar.getReactionsWindow()) != null && !reactionsWindow.q) {
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
            b.p(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.mr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.rl0 rl0Var, pt ptVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        this.l = ptVar;
        if (ptVar != null) {
            this.m = ptVar.k();
            this.n = this.l.p();
        }
        pt ptVar2 = this.l;
        if ((ptVar2 == null || ptVar2.i()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = rl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = rl0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top > y10 || bottom < y10 || left > x10 || right < x10) {
                    i11++;
                } else {
                    boolean z4 = childAt instanceof org.telegram.ui.Cells.c8;
                    ImageReceiver imageReceiver = this.A;
                    if (z4) {
                        if (((org.telegram.ui.Cells.c8) childAt).a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.a8) {
                        if (((org.telegram.ui.Cells.a8) childAt).a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                            if (d2Var.a.getBitmap() != null) {
                                int i12 = d2Var.L;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && d2Var.s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.cv) {
                            imageReceiver.setRoundRadius(0);
                        } else if (!(childAt instanceof org.telegram.ui.Components.sy) || ((org.telegram.ui.Components.sy) childAt).getSpan() == null) {
                            if ((childAt instanceof org.telegram.ui.Components.py0) && (((org.telegram.ui.Components.py0) childAt).b instanceof org.telegram.ui.Components.l5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        } else {
                            imageReceiver.setRoundRadius(0);
                        }
                    }
                    if (i10 != -1) {
                        this.a = x10;
                        this.b = y10;
                        this.h = childAt;
                        et etVar = new et(this, rl0Var, i10, f6Var, 0);
                        this.j = etVar;
                        AndroidUtilities.runOnUIThread(etVar, 200L);
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
    public final boolean s(MotionEvent motionEvent, org.telegram.ui.Components.rl0 rl0Var, Object obj, pt ptVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        pt ptVar2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = ptVar;
        if (ptVar != null) {
            this.m = ptVar.k();
            this.n = this.l.p();
        }
        pt ptVar3 = this.l;
        if ((ptVar3 == null || ptVar3.i()) && (this.j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(10, rl0Var, obj), 150L);
                et etVar = this.j;
                if (etVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(etVar);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    n();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof org.telegram.ui.Cells.c8) {
                            ((org.telegram.ui.Cells.c8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.a8) {
                            ((org.telegram.ui.Cells.a8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.d2) {
                            ((org.telegram.ui.Cells.d2) view3).setScaled(false);
                        }
                        this.h = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.E) {
                    if (motionEvent.getAction() == 2) {
                        if (this.V != 1 || this.m) {
                            int x10 = (int) motionEvent.getX();
                            int y10 = (int) motionEvent.getY();
                            int childCount = rl0Var.getChildCount();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= childCount) {
                                    break;
                                }
                                View childAt = rl0Var.getChildAt(i12);
                                if (childAt == null) {
                                    break;
                                }
                                int top = childAt.getTop();
                                int bottom = childAt.getBottom();
                                int left = childAt.getLeft();
                                int right = childAt.getRight();
                                if (top > y10 || bottom < y10 || left > x10 || right < x10) {
                                    i12++;
                                } else {
                                    boolean z4 = childAt instanceof org.telegram.ui.Cells.c8;
                                    ImageReceiver imageReceiver = this.A;
                                    if (z4) {
                                        imageReceiver.setRoundRadius(0);
                                    } else if (childAt instanceof org.telegram.ui.Cells.a8) {
                                        imageReceiver.setRoundRadius(0);
                                    } else {
                                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                                            int i13 = d2Var.L;
                                            if (i13 == 6) {
                                                imageReceiver.setRoundRadius(0);
                                                i11 = 0;
                                            } else if (i13 == 2 && d2Var.s) {
                                                imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                                i11 = 1;
                                            } else {
                                                i11 = -1;
                                            }
                                            i10 = i11;
                                        } else {
                                            if (childAt instanceof org.telegram.ui.Components.cv) {
                                                imageReceiver.setRoundRadius(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.sy) || ((org.telegram.ui.Components.sy) childAt).getSpan() == null) {
                                                i10 = -1;
                                            } else {
                                                imageReceiver.setRoundRadius(0);
                                            }
                                            i10 = 2;
                                        }
                                        if (i10 != -1 && childAt != this.h) {
                                            ptVar2 = this.l;
                                            if (ptVar2 != null) {
                                                ptVar2.t();
                                            }
                                            view = this.h;
                                            if (!(view instanceof org.telegram.ui.Cells.c8)) {
                                                ((org.telegram.ui.Cells.c8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.a8) {
                                                ((org.telegram.ui.Cells.a8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.d2) {
                                                ((org.telegram.ui.Cells.d2) view).setScaled(false);
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            p();
                                            AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof org.telegram.ui.Cells.c8)) {
                                                org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) view2;
                                                TLRPC.Document sticker = c8Var.getSticker();
                                                SendMessagesHelper.ImportingSticker stickerPath = c8Var.getStickerPath();
                                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(c8Var.getSticker(), null, Integer.valueOf(this.r));
                                                pt ptVar4 = this.l;
                                                t(sticker, stickerPath, findAnimatedEmojiEmoticon, ptVar4 != null ? ptVar4.G(false) : null, null, i10, c8Var.y, c8Var.getParentObject(), f6Var, 0);
                                                c8Var.setScaled(true);
                                            } else if (view2 instanceof org.telegram.ui.Cells.a8) {
                                                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                                TLRPC.Document sticker2 = a8Var.getSticker();
                                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(a8Var.getSticker(), null, Integer.valueOf(this.r));
                                                pt ptVar5 = this.l;
                                                t(sticker2, null, findAnimatedEmojiEmoticon2, ptVar5 != null ? ptVar5.G(false) : null, null, i10, false, a8Var.getParentObject(), f6Var, 0);
                                                a8Var.setScaled(true);
                                                this.i = a8Var.h;
                                            } else if (view2 instanceof org.telegram.ui.Cells.d2) {
                                                org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) view2;
                                                TLRPC.Document document2 = d2Var2.getDocument();
                                                pt ptVar6 = this.l;
                                                t(document2, null, null, ptVar6 != null ? ptVar6.G(true) : null, d2Var2.getBotInlineResult(), i10, false, d2Var2.getBotInlineResult() != null ? d2Var2.getInlineBot() : d2Var2.getParentObject(), f6Var, 0);
                                                if (i10 != 1 || this.m) {
                                                    d2Var2.setScaled(true);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.cv) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.cv) view2).getDocument();
                                                if (document3 != null) {
                                                    t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.r)), null, null, i10, false, null, f6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.sy) {
                                                org.telegram.ui.Components.u5 span = ((org.telegram.ui.Components.sy) view2).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document document4 = span.document;
                                                    if (document4 == null) {
                                                        document4 = org.telegram.ui.Components.l5.f(this.r, span.getDocumentId());
                                                    }
                                                    document = document4;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.r)), null, null, i10, false, null, f6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.py0) {
                                                Drawable drawable = ((org.telegram.ui.Components.py0) view2).b;
                                                TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.l5 ? ((org.telegram.ui.Components.l5) drawable).e : null;
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
                                        ptVar2 = this.l;
                                        if (ptVar2 != null) {
                                        }
                                        view = this.h;
                                        if (!(view instanceof org.telegram.ui.Cells.c8)) {
                                        }
                                        this.h = childAt;
                                        this.i = false;
                                        this.K = false;
                                        this.R = false;
                                        p();
                                        AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                        view2 = this.h;
                                        if (!(view2 instanceof org.telegram.ui.Cells.c8)) {
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
                                float y11 = motionEvent.getY();
                                float f10 = (y11 - this.c) + this.d;
                                this.d = f10;
                                this.c = y11;
                                if (f10 > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f10 < (-AndroidUtilities.dp(60.0f))) {
                                    this.d = -AndroidUtilities.dp(60.0f);
                                }
                                float f11 = this.d;
                                float dp = AndroidUtilities.dp(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f11) * 0.55f) / dp) + 1.0f))) * dp)) * (f11 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-AndroidUtilities.dp(55.0f))) {
                                    nt ntVar = this.U;
                                    AndroidUtilities.cancelRunOnUIThread(ntVar);
                                    ntVar.run();
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

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z4, Object obj, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        ImageReceiver imageReceiver;
        String str3;
        boolean z10;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver2;
        CharSequence charSequence;
        String str4;
        int i12;
        String str5;
        ImageReceiver imageReceiver3;
        nt ntVar;
        if (this.w == null || this.y == null) {
            return;
        }
        this.c0 = f6Var;
        this.p = z4;
        this.G = null;
        this.u.setColor(AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)) ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver4 = this.A;
        imageReceiver4.setColorFilter(null);
        ImageReceiver imageReceiver5 = this.B;
        nt ntVar2 = this.U;
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
                    AndroidUtilities.cancelRunOnUIThread(ntVar2);
                    AndroidUtilities.runOnUIThread(ntVar2, i11 > 0 ? i11 : 1300L);
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
                            org.telegram.ui.Components.id0 id0Var = new org.telegram.ui.Components.id0(this.z.getContext());
                            this.C = id0Var;
                            this.z.addView(id0Var, new FrameLayout.LayoutParams(512, 512));
                        }
                        z10 = false;
                        this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                    } else {
                        z10 = false;
                    }
                    if (str != null) {
                        this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f0.getFontMetricsInt(), z10), f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.l.getClass();
                    AndroidUtilities.cancelRunOnUIThread(ntVar2);
                    AndroidUtilities.runOnUIThread(ntVar2, i11 > 0 ? i11 : 1300L);
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
                    ntVar = ntVar2;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver3 = imageReceiver5;
                    ntVar = ntVar2;
                    imageReceiver4 = imageReceiver4;
                    imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver3 = imageReceiver5;
                ntVar = ntVar2;
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
            AndroidUtilities.cancelRunOnUIThread(ntVar);
            AndroidUtilities.runOnUIThread(ntVar, 2000L);
            str3 = "window";
            imageReceiver = imageReceiver3;
        }
        if (imageReceiver4.getLottieAnimation() != null) {
            i12 = 0;
            imageReceiver4.getLottieAnimation().K(0);
        } else {
            i12 = 0;
        }
        if (this.S && imageReceiver.getLottieAnimation() != null) {
            imageReceiver.getLottieAnimation().K(i12);
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
        } catch (Exception e6) {
            e = e6;
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
        et etVar = this.j;
        if (etVar != null) {
            AndroidUtilities.cancelRunOnUIThread(etVar);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(pt ptVar) {
        this.l = ptVar;
        if (ptVar != null) {
            this.m = ptVar.k();
            this.n = this.l.p();
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
        this.y = new n0(this, activity, 5);
        ug.i iVar = new ug.i(this.y);
        n0 n0Var = this.y;
        ng.a aVar = this.t;
        aVar.d = iVar;
        aVar.e = n0Var;
        aVar.c = new be.b(true);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        n0 n0Var2 = this.y;
        dt dtVar = new dt(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(n0Var2, dtVar);
        ah.e eVar = new ah.e(this, activity);
        this.z = eVar;
        eVar.setFocusable(false);
        this.y.addView(this.z, k7.b6.e(-1, -1, 51));
        this.z.setOnTouchListener(new g0(this, 1));
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
        if (!(view instanceof org.telegram.ui.Cells.c8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.c8) {
            ((org.telegram.ui.Cells.c8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.a8) {
            ((org.telegram.ui.Cells.a8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view2).setScaled(false);
        }
        this.h = c8Var;
        TLRPC.Document sticker = c8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = c8Var.getStickerPath();
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(c8Var.getSticker(), null, Integer.valueOf(this.r));
        pt ptVar = this.l;
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, ptVar != null ? ptVar.G(false) : null, null, 0, c8Var.y, c8Var.getParentObject(), this.c0, 0);
        nt ntVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ntVar);
        AndroidUtilities.runOnUIThread(ntVar, 16L);
        c8Var.setScaled(true);
        return true;
    }
}
