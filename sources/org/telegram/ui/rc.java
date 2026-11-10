package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class rc extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public TLRPC.EmojiStatus D;
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.zg0 K;
    public org.telegram.ui.ActionBar.r0 L;
    public org.telegram.ui.Components.pj0 M;
    public ec N;
    public FrameLayout O;
    public fi.d P;
    public bc Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long a;
    public int a0;
    public int b;
    public int b0;
    public TL_stories.TL_premium_boostsStatus c;
    public int c0;
    public boolean d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g0;
    public long h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public org.telegram.ui.ActionBar.f2 l0;
    public cc m0;
    public long n;
    public float n0;
    public ValueAnimator o0;
    public boolean p0;
    public org.telegram.ui.ActionBar.h6 q0;
    public int r;
    public final SparseIntArray r0;
    public int s;
    public final org.telegram.ui.ActionBar.u4 s0;
    public final org.telegram.ui.ActionBar.u4 t0;
    public final org.telegram.ui.ActionBar.u4 u0;
    public final org.telegram.ui.ActionBar.u4 v0;
    public long w;
    public final Drawable w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Paint y0;

    public rc(long j3) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
        this.J = q10;
        this.R = 0;
        this.p0 = q10;
        this.r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d7, this.resourceProvider));
        this.w0 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_check_s).mutate();
        this.x0 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
        if (M0 != null) {
            this.b = M0.level;
        }
        org.telegram.messenger.qp.s1(this.currentAccount).G0().a(j3, new org.telegram.messenger.voip.k(6, this, M0));
        this.resourceProvider = new qc(this);
        this.s0 = new org.telegram.ui.ActionBar.u4(0, false, false, this.resourceProvider);
        this.t0 = new org.telegram.ui.ActionBar.u4(0, false, true, this.resourceProvider);
        this.u0 = new org.telegram.ui.ActionBar.u4(0, true, false, this.resourceProvider);
        this.v0 = new org.telegram.ui.ActionBar.u4(0, true, true, this.resourceProvider);
    }

    public static void Z(rc rcVar) {
        org.telegram.ui.ActionBar.h6 h6Var = rcVar.resourceProvider;
        if (h6Var instanceof qc) {
            rc rcVar2 = ((qc) h6Var).a;
            rcVar2.J = !rcVar2.J;
            rcVar2.k1();
            rcVar2.g1(false);
        } else {
            rcVar.J = !rcVar.J;
            rcVar.k1();
        }
        rcVar.b1(rcVar.J, true);
        rcVar.g1(false);
        org.telegram.ui.ActionBar.m6.Am++;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(rc rcVar, org.telegram.messenger.e3 e3Var) {
        int i7;
        int i10;
        long j3 = rcVar.a;
        if (rcVar.e != rcVar.f) {
            org.telegram.messenger.gp gpVar = rcVar.getMessagesController().q4;
            org.telegram.messenger.fp d = gpVar == null ? null : gpVar.d(rcVar.f);
            if (d != null && d.l(rcVar.d) > rcVar.b) {
                i7 = d.l(rcVar.d);
                if (rcVar.r != rcVar.s) {
                    org.telegram.messenger.gp gpVar2 = rcVar.getMessagesController().r4;
                    org.telegram.messenger.fp d2 = gpVar2 != null ? gpVar2.d(rcVar.s) : null;
                    if (d2 != null && d2.l(rcVar.d) > rcVar.b) {
                        i7 = d2.l(rcVar.d);
                        i10 = 24;
                        int i11 = i7;
                        if (rcVar.h != rcVar.n && rcVar.getMessagesController().q5 > rcVar.b) {
                            i10 = 27;
                        }
                        if (rcVar.w != rcVar.x && rcVar.Q0() > rcVar.b) {
                            i10 = 28;
                        }
                        if (!org.telegram.messenger.m5.a(rcVar.y, rcVar.D) && rcVar.M0() > rcVar.b) {
                            i10 = !(rcVar.D instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        if (!org.telegram.messenger.d4.v(rcVar.E, rcVar.F)) {
                            i10 = !TextUtils.isEmpty(org.telegram.messenger.d4.j(rcVar.F)) ? 22 : 23;
                        }
                        int i12 = i10;
                        if (rcVar.getParentActivity() == null || rcVar.getParentActivity() == null) {
                            return;
                        }
                        zb zbVar = new zb(rcVar, rcVar.getParentActivity(), i12, rcVar.currentAccount, rcVar.getResourceProvider(), i11);
                        zbVar.A1(e3Var);
                        zbVar.z1(rcVar.c, true);
                        zbVar.B1(j3);
                        TLRPC.Chat M0 = rcVar.getMessagesController().M0(Long.valueOf(-j3));
                        if (M0 != null) {
                            zbVar.L2 = new org.telegram.ui.ActionBar.c(23, rcVar, M0);
                        }
                        rcVar.showDialog(zbVar);
                        rcVar.P.setLoading(false);
                        return;
                    }
                }
                i10 = 20;
                int i112 = i7;
                if (rcVar.h != rcVar.n) {
                    i10 = 27;
                }
                if (rcVar.w != rcVar.x) {
                    i10 = 28;
                }
                if (!org.telegram.messenger.m5.a(rcVar.y, rcVar.D)) {
                    if (!(rcVar.D instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!org.telegram.messenger.d4.v(rcVar.E, rcVar.F)) {
                }
                int i122 = i10;
                if (rcVar.getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i7 = 0;
        if (rcVar.r != rcVar.s) {
        }
        i10 = 20;
        int i1122 = i7;
        if (rcVar.h != rcVar.n) {
        }
        if (rcVar.w != rcVar.x) {
        }
        if (!org.telegram.messenger.m5.a(rcVar.y, rcVar.D)) {
        }
        if (!org.telegram.messenger.d4.v(rcVar.E, rcVar.F)) {
        }
        int i1222 = i10;
        if (rcVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(rc rcVar, TLRPC.ChatFull chatFull, View view, int i7) {
        long j3;
        long f10;
        int i10;
        long j10 = rcVar.a;
        int i11 = 0;
        if (!(view instanceof fc)) {
            if (i7 == rcVar.e0) {
                rcVar.s = -1;
                rcVar.x = 0L;
                if (rcVar.D instanceof TLRPC.TL_emojiStatusCollectible) {
                    rcVar.D = null;
                }
                rcVar.i1();
                rcVar.e1(true);
                rcVar.j1();
                rcVar.g1(true);
                return;
            }
            if (i7 == rcVar.X) {
                Activity parentActivity = rcVar.getParentActivity();
                long j11 = rcVar.a;
                org.telegram.ui.ActionBar.h6 h6Var = rcVar.resourceProvider;
                wb wbVar = new wb(rcVar, i11);
                f fVar = new f(rcVar, 10);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = rcVar.c;
                int i12 = org.telegram.ui.Components.vo.f2;
                org.telegram.ui.Components.ci ciVar = new org.telegram.ui.Components.ci(parentActivity, rcVar, false, false, false, h6Var);
                ciVar.n = true;
                ciVar.A1(org.telegram.messenger.id.M0(2131752139, null));
                ciVar.W3 = new org.telegram.ui.Components.lo(ciVar, tL_premium_boostsStatus, h6Var, fVar, j11, wbVar, rcVar);
                ciVar.y1(1, false);
                ciVar.e1();
                ciVar.d2.i0();
                ciVar.show();
                return;
            }
            return;
        }
        if (i7 == rcVar.j0) {
            if (chatFull == null) {
                return;
            }
            p50 p50Var = new p50(-j10);
            p50Var.j0(chatFull);
            rcVar.presentFragment(p50Var);
            return;
        }
        if (i7 == rcVar.U) {
            f10 = rcVar.n;
        } else if (i7 == rcVar.c0) {
            f10 = rcVar.x;
        } else {
            if (i7 != rcVar.f0) {
                j3 = 0;
                if (i7 != rcVar.h0) {
                    int O0 = rcVar.O0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = rcVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < O0) {
                        rcVar.a1(29);
                        return;
                    }
                    p50 p50Var2 = new p50(-j10, 0);
                    p50Var2.j0(chatFull);
                    rcVar.presentFragment(p50Var2);
                    return;
                }
                fc fcVar = (fc) view;
                boolean z9 = i7 == rcVar.f0;
                vb vbVar = new vb(rcVar, i7, view);
                int w02 = rcVar.D instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v6, rcVar.resourceProvider) : fcVar.f;
                if (rcVar.Q == null) {
                    org.telegram.ui.Components.f5 f5Var = fcVar.c;
                    k11[] k11VarArr = new k11[1];
                    boolean z10 = ((float) (fcVar.getHeight() + fcVar.getTop())) > ((float) rcVar.M.getMeasuredHeight()) / 2.0f;
                    float L = org.telegram.messenger.g0.L(330.0f);
                    Point point = org.telegram.messenger.g0.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                    Drawable[] drawableArr = f5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        if (drawable instanceof org.telegram.ui.Components.h5) {
                            ((org.telegram.ui.Components.h5) drawable).o(f5Var);
                        }
                        drawableArr[1] = null;
                    }
                    f5Var.f();
                    fcVar.f();
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(f5Var.getBounds());
                    int L2 = z10 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(fcVar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                    int centerX = rect.centerX() - (point.x - min2);
                    if (z9) {
                        i10 = z10 ? 10 : 9;
                    } else {
                        i10 = z10 ? 5 : 7;
                    }
                    ac acVar = new ac(rcVar, rcVar, rcVar.getParentActivity(), Integer.valueOf(centerX), i10, rcVar.getResourceProvider(), z10 ? 24 : 16, w02, vbVar, k11VarArr);
                    acVar.g1 = true;
                    acVar.setSelected(j3 == 0 ? null : Long.valueOf(j3));
                    acVar.setSaveState(3);
                    acVar.y(f5Var, fcVar);
                    bc bcVar = new bc(rcVar, acVar);
                    rcVar.Q = bcVar;
                    k11VarArr[0] = bcVar;
                    bcVar.showAsDropDown(fcVar, 0, L2, 53);
                    k11VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = rcVar.D;
            f10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : org.telegram.messenger.m5.f(emojiStatus);
        }
        j3 = f10;
        if (i7 != rcVar.h0) {
        }
    }

    public static void f1(View view) {
        if (view instanceof fc) {
            ((fc) view).updateColors();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.m8) {
            ((org.telegram.ui.Cells.m8) view).updateColors();
        } else if (view instanceof ic) {
            ((ic) view).updateColors();
        } else if (view instanceof pc) {
            ((pc) view).updateColors();
        }
    }

    public final void B0() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null) {
            return;
        }
        lVar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.m6.A8) : -1);
        this.actionBar.G((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.m6.v8) : -1, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.s8));
        }
        org.telegram.ui.Components.pj0 pj0Var = this.M;
        if (pj0Var != null && this.d) {
            pj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.a7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        long j3;
        int i7;
        int i10;
        boolean z9;
        int i11;
        int i12;
        long j10;
        long j11;
        ?? r72;
        if (this.c == null || this.P.Q) {
            return;
        }
        int i13 = this.b;
        int Z0 = Z0();
        long j12 = this.a;
        int i14 = 1;
        if (i13 < Z0) {
            this.P.setLoading(true);
            getMessagesController().G0().b(j12, this.c, new wb(this, i14));
            return;
        }
        int[] iArr = {0};
        final di.s2 s2Var = new di.s2(this, new boolean[]{false}, new int[]{0}, iArr, 4);
        long j13 = -j12;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j13));
        if (M0 == null) {
            org.telegram.messenger.a8.d("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.gc.a0(this), R.raw.error, 36);
            return;
        }
        this.P.setLoading(true);
        final int i15 = 2;
        if (this.e == this.f) {
            j3 = j12;
            i7 = 3;
            if (this.h == this.n) {
                i10 = 3;
                z9 = true;
                i11 = 0;
                if (this.r == this.s || this.w != this.x) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    tL_channels_updateColor.channel = getMessagesController().h1(j13);
                    tL_channels_updateColor.for_profile = z9;
                    if (M0.profile_color == null) {
                        M0.profile_color = new TLRPC.TL_peerColor();
                        M0.flags2 |= 256;
                    }
                    i12 = this.s;
                    if (i12 < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i12;
                        TLRPC.PeerColor peerColor = M0.profile_color;
                        peerColor.flags |= 1;
                        peerColor.color = i12;
                    } else {
                        M0.profile_color.flags &= -2;
                    }
                    j10 = this.x;
                    if (j10 == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j10;
                        TLRPC.PeerColor peerColor2 = M0.profile_color;
                        peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j10;
                    } else {
                        TLRPC.PeerColor peerColor3 = M0.profile_color;
                        peerColor3.flags &= -3;
                        peerColor3.background_emoji_id = 0L;
                    }
                    iArr[i11] = iArr[i11] + 1;
                    final int i16 = i10;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.ub
                        public final /* synthetic */ rc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i16) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                }
                if (org.telegram.messenger.d4.v(this.E, this.F)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    j11 = j3;
                    tL_messages_setChatWallPaper.peer = getMessagesController().j1(j11);
                    TLRPC.WallPaper wallPaper = this.F;
                    if (wallPaper != null) {
                        if (TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.WallPaper wallPaper2 = this.F;
                            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                                TLRPC.WallPaper wallPaper3 = this.F;
                                tL_inputWallPaper.id = wallPaper3.id;
                                tL_inputWallPaper.access_hash = wallPaper3.access_hash;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                            } else if (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = this.F.id;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                            }
                        } else {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                            tL_inputWallPaperNoFile2.id = 0L;
                            tL_messages_setChatWallPaper.flags |= 4;
                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                            tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                            tL_wallPaperSettings.flags |= 128;
                            tL_wallPaperSettings.emoticon = org.telegram.messenger.d4.j(this.F);
                        }
                    }
                    iArr[i11] = iArr[i11] + 1;
                    final int i17 = i11;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.ub
                        public final /* synthetic */ rc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i17) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull N0 = getMessagesController().N0(j13);
                    org.telegram.messenger.d4.f(this.currentAccount).r(j11, this.F);
                    if (N0 != null) {
                        TLRPC.WallPaper wallPaper4 = this.F;
                        if (wallPaper4 == null) {
                            N0.flags2 &= -129;
                            N0.wallpaper = null;
                        } else {
                            N0.flags2 |= 128;
                            N0.wallpaper = wallPaper4;
                        }
                        getMessagesController().R3(N0);
                        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.k(org.telegram.messenger.qs.T, N0, 0, bool, bool);
                    }
                } else {
                    j11 = j3;
                }
                if (org.telegram.messenger.m5.a(this.y, this.D)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().h1(j13);
                    TLRPC.EmojiStatus emojiStatus = this.D;
                    if (emojiStatus == null || (emojiStatus instanceof TLRPC.TL_emojiStatusEmpty)) {
                        tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        M0.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        M0.flags2 &= -513;
                    } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_inputEmojiStatusCollectible.collectible_id = tL_emojiStatusCollectible.collectible_id;
                        tL_inputEmojiStatusCollectible.flags = tL_emojiStatusCollectible.flags;
                        tL_inputEmojiStatusCollectible.until = tL_emojiStatusCollectible.until;
                        tL_channels_updateEmojiStatus.emoji_status = tL_inputEmojiStatusCollectible;
                        M0.emoji_status = this.D;
                        M0.flags |= 512;
                    } else {
                        tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                        M0.emoji_status = emojiStatus;
                        M0.flags |= 512;
                    }
                    getMessagesController().j5(j11, this.D);
                    r72 = 0;
                    final int i18 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.ub
                        public final /* synthetic */ rc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i18) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    s2Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    r72 = 0;
                }
                if (iArr[r72] != 0) {
                    finishFragment();
                    this.P.setLoading(r72);
                    return;
                }
                getMessagesController().Q3(M0, r72);
                org.telegram.messenger.qs notificationCenter2 = getNotificationCenter();
                int i19 = org.telegram.messenger.qp.C8;
                Object[] objArr = new Object[1];
                objArr[r72] = Integer.valueOf(TLObject.FLAG_19);
                notificationCenter2.k(org.telegram.messenger.qs.r, objArr);
                return;
            }
        } else {
            j3 = j12;
            i7 = 3;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().h1(j13);
        tL_channels_updateColor2.for_profile = false;
        if (M0.color == null) {
            M0.color = new TLRPC.TL_peerColor();
            M0.flags2 |= 128;
        }
        int i20 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i20 | 4;
        int i21 = this.f;
        tL_channels_updateColor2.color = i21;
        TLRPC.PeerColor peerColor4 = M0.color;
        i10 = i7;
        int i22 = peerColor4.flags;
        int i23 = i22 | 1;
        peerColor4.flags = i23;
        peerColor4.color = i21;
        z9 = true;
        i11 = 0;
        long j14 = this.n;
        if (j14 != 0) {
            tL_channels_updateColor2.flags = i20 | 5;
            tL_channels_updateColor2.background_emoji_id = j14;
            peerColor4.flags = i22 | 3;
            peerColor4.background_emoji_id = j14;
        } else {
            peerColor4.flags = i23 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.ub
            public final /* synthetic */ rc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i15) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        s2Var.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        s2Var.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        s2Var.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        s2Var.a(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor3.channel = getMessagesController().h1(j13);
        tL_channels_updateColor3.for_profile = z9;
        if (M0.profile_color == null) {
        }
        i12 = this.s;
        if (i12 < 0) {
        }
        j10 = this.x;
        if (j10 == 0) {
        }
        iArr[i11] = iArr[i11] + 1;
        final int i162 = i10;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.ub
            public final /* synthetic */ rc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i162) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        s2Var.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        s2Var.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        s2Var.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        s2Var.a(tL_error);
                        break;
                }
            }
        });
        if (org.telegram.messenger.d4.v(this.E, this.F)) {
        }
        if (org.telegram.messenger.m5.a(this.y, this.D)) {
        }
        if (iArr[r72] != 0) {
        }
    }

    public void E0() {
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(getParentActivity(), this.resourceProvider);
        this.M = pj0Var;
        pj0Var.setSections(false);
    }

    public final View F0(int i7) {
        for (int i10 = 0; i10 < this.M.getChildCount(); i10++) {
            View childAt = this.M.getChildAt(i10);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i7) {
                return childAt;
            }
        }
        return null;
    }

    public int G0() {
        return getMessagesController().u5;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 0;
    }

    public final TLRPC.Document J0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0);
            }
        }
        return null;
    }

    public final long K0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j3 = stickerSet.thumb_document_id;
        if (j3 == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0).id;
            }
        }
        return j3;
    }

    public int L0() {
        return 2131752412;
    }

    public int M0() {
        return getMessagesController().s5;
    }

    public int N0() {
        return 2131752413;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 3;
    }

    public int Q0() {
        return getMessagesController().r5;
    }

    public int R0() {
        return 2131752320;
    }

    public int S0() {
        return 0;
    }

    public int T0() {
        return 0;
    }

    public int U0() {
        return 2131752263;
    }

    public int V0() {
        return getMessagesController().t5;
    }

    public int W0() {
        return 2131752264;
    }

    public final boolean X0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && org.telegram.messenger.m5.a(this.y, this.D) && org.telegram.messenger.d4.v(this.E, this.F)) ? false : true;
    }

    public boolean Y0() {
        return false;
    }

    public final int Z0() {
        int i7 = 0;
        if (this.e != this.f) {
            org.telegram.messenger.gp gpVar = getMessagesController().q4;
            org.telegram.messenger.fp d = gpVar == null ? null : gpVar.d(this.f);
            if (d != null) {
                i7 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i7 = Math.max(i7, getMessagesController().q5);
        }
        if (this.r != this.s) {
            org.telegram.messenger.gp gpVar2 = getMessagesController().r4;
            org.telegram.messenger.fp d2 = gpVar2 != null ? gpVar2.d(this.s) : null;
            if (d2 != null) {
                i7 = Math.max(i7, d2.l(this.d));
            }
        }
        if (this.w != this.x) {
            i7 = Math.max(i7, Q0());
        }
        if (!org.telegram.messenger.m5.a(this.y, this.D)) {
            i7 = Math.max(i7, M0());
        }
        return !org.telegram.messenger.d4.v(this.E, this.F) ? Math.max(i7, V0()) : i7;
    }

    public final void b1(boolean z9, boolean z10) {
        if (this.p0 == z9) {
            return;
        }
        this.p0 = z9;
        if (z10) {
            org.telegram.ui.Components.zg0 zg0Var = this.K;
            zg0Var.P(z9 ? zg0Var.e[0] : 0);
            org.telegram.ui.Components.zg0 zg0Var2 = this.K;
            if (zg0Var2 != null) {
                zg0Var2.start();
                return;
            }
            return;
        }
        int i7 = z9 ? this.K.e[0] - 1 : 0;
        this.K.N(i7, false, true);
        this.K.P(i7);
        org.telegram.ui.ActionBar.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.invalidate();
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i7 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.id.M0(2131752426, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131752425, null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751369, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.yb
            public final /* synthetic */ rc b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                switch (i7) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.D0();
                        break;
                }
            }
        });
        final int i10 = 1;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.yb
            public final /* synthetic */ rc b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i102) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.D0();
                        break;
                }
            }
        });
        showDialog(u1Var);
        org.telegram.ui.ActionBar.t6.U((TextView) u1Var.d(-2), org.telegram.ui.ActionBar.m6.q7, getResourceProvider());
    }

    @Override // org.telegram.ui.ActionBar.f2
    public View createView(Context context) {
        org.telegram.ui.ActionBar.r0 d;
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = -this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (M0 != null) {
            int F = org.telegram.messenger.t3.F(M0);
            this.f = F;
            this.e = F;
            long G = org.telegram.messenger.t3.G(M0);
            this.n = G;
            this.h = G;
            int I = org.telegram.messenger.t3.I(M0);
            this.s = I;
            this.r = I;
            long J = org.telegram.messenger.t3.J(M0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
            this.D = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(j3);
        if (N0 != null) {
            TLRPC.WallPaper wallPaper = N0.wallpaper;
            this.F = wallPaper;
            this.E = wallPaper;
            String j10 = org.telegram.messenger.d4.j(wallPaper);
            if (j10 != null && j10.length() == 0) {
                this.G = this.E;
            }
        }
        w9 w9Var = new w9(this, 3);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752427, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(w9Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131752427, null));
            this.actionBar.setActionBarMenuOnItemClick(w9Var);
        }
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.K = zg0Var;
        zg0Var.h = true;
        if (this.J) {
            zg0Var.M(35);
            this.K.P(36);
        } else {
            zg0Var.P(0);
            this.K.M(0);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        if (z4Var2 != null) {
            org.telegram.ui.ActionBar.f5 q10 = z4Var2.q();
            org.telegram.ui.Components.zg0 zg0Var2 = this.K;
            q10.getClass();
            d = q10.c(1, 0, null, zg0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else {
            d = this.actionBar.s().d(1, this.K);
        }
        this.L = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        E0();
        if (this.d) {
            this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.a7));
        } else {
            setHasOwnBackground(true);
            this.M.setSectionsDrawBackground(true);
        }
        org.telegram.ui.Components.pj0 pj0Var = this.M;
        ec ecVar = new ec(this);
        this.N = ecVar;
        pj0Var.setAdapter(ecVar);
        new v4.s(3);
        this.M.setLayoutManager(new v4.b0());
        frameLayout.addView(this.M, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, this.d ? 68.0f : 0.0f));
        this.M.setOnItemClickListener(new di.q4(4, this, N0));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.C = false;
        kVar.m = false;
        this.M.setItemAnimator(kVar);
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.i(org.telegram.messenger.id.M0(2131754218, null), false, true);
        this.P.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.O));
        }
        this.O.addView(this.P, c8.ha.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, c8.ha.e(-1, 68, 80));
        setBulletinDelegate(new y8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i7 = tL_premium_boostsStatus.level;
            this.b = i7;
            if (M0 != null) {
                M0.level = i7;
            }
            ec ecVar = this.N;
            if (ecVar != null) {
                ecVar.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.p3;
        long j3 = this.a;
        if (i7 == i11) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i7 == org.telegram.messenger.qs.V2) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().G0().a(j3, new wb(this, 2));
        } else if (i7 == org.telegram.messenger.qs.y1 && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var == null || r4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public void e1(boolean z9) {
        if (this.P == null || this.c == null) {
            return;
        }
        int Z0 = Z0();
        if (this.b >= Z0) {
            this.P.g(null, z9);
            return;
        }
        if (this.I == null) {
            this.I = new SpannableStringBuilder("l");
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_switch_lock, 0);
            wpVar.n = 1;
            this.I.setSpan(wpVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) org.telegram.messenger.id.G(Z0, "BoostLevelRequired", new Object[0]));
        this.P.g(spannableStringBuilder, z9);
    }

    public void g1(boolean z9) {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.updateColors();
        } else {
            this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.m6.A8) : -1);
            this.actionBar.G((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.m6.v8) : -1, false);
            this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.m6.t8), false);
        }
        if (z9) {
            return;
        }
        this.N.f();
        org.telegram.messenger.g0.d0(this.M, new di.e(this));
        if (this.d) {
            this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.a7));
        }
        this.P.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        if (this.d) {
            return null;
        }
        return this.M;
    }

    public final void h1(boolean z9) {
        org.telegram.messenger.ij messageObject;
        View F0 = F0(this.S);
        View F02 = F0(this.T);
        View F03 = F0(this.U);
        View F04 = F0(this.W);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) F0;
            org.telegram.ui.Cells.q1[] cells = z9Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.c1 = this.f;
                    messageObject.d1 = this.n;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
            Drawable f10 = fi.y5.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f10;
            z9Var.setOverrideBackground(f10);
        }
        if (F02 instanceof hm0) {
            ((hm0) F02).a(this.f, z9);
        } else if (F02 instanceof ic) {
            ((ic) F02).a(this.f, z9);
        }
        if (F03 instanceof fc) {
            fc fcVar = (fc) F03;
            fcVar.a(this.currentAccount, this.f, true);
            fcVar.c(this.n, false, z9);
        }
        if (F04 instanceof pc) {
            pc pcVar = (pc) F04;
            String j3 = org.telegram.messenger.d4.j(this.F);
            if (j3 == null && this.F == null && this.G != null) {
                j3 = "❌";
            }
            pcVar.a(j3, z9);
            pcVar.setGalleryWallpaper(this.G);
        }
    }

    public final void i1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View F0 = F0(this.Z);
        View F02 = F0(this.b0);
        View F03 = F0(this.c0);
        View F04 = F0(this.f0);
        View F05 = F0(this.h0);
        View F06 = F0(this.j0);
        if (F0 instanceof kc) {
            TLRPC.EmojiStatus emojiStatus = this.D;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                kc kcVar = (kc) F0;
                jc jcVar = kcVar.b;
                org.telegram.messenger.fp a10 = org.telegram.messenger.fp.a(emojiStatus);
                jcVar.c(a10, true);
                kcVar.a.c(a10, true);
                jcVar.d(((TLRPC.TL_emojiStatusCollectible) this.D).pattern_document_id, true, true);
            } else {
                kc kcVar2 = (kc) F0;
                jc jcVar2 = kcVar2.b;
                int i7 = this.s;
                jcVar2.b(i7, true);
                kcVar2.a.b(kcVar2.h.currentAccount, i7, true);
                jcVar2.d(this.x, false, true);
            }
            kc kcVar3 = (kc) F0;
            jc jcVar3 = kcVar3.b;
            jcVar3.e(org.telegram.messenger.m5.f(this.D), false, true);
            jcVar3.a(this.f);
            kcVar3.updateColors();
        }
        if (F02 instanceof hm0) {
            ((hm0) F02).a(this.s, true);
        } else if (F02 instanceof ic) {
            ((ic) F02).a(this.f, true);
        }
        if (F03 instanceof fc) {
            fc fcVar = (fc) F03;
            fcVar.a(this.currentAccount, this.s, false);
            fcVar.c(this.x, false, true);
        }
        if (F04 instanceof fc) {
            TLRPC.EmojiStatus emojiStatus2 = this.D;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((fc) F04).b(org.telegram.messenger.fp.a(emojiStatus2));
            } else {
                ((fc) F04).a(this.currentAccount, this.s, false);
            }
            ((fc) F04).c(org.telegram.messenger.m5.f(this.D), org.telegram.messenger.m5.B(this.D), true);
        }
        boolean z9 = F05 instanceof fc;
        long j3 = this.a;
        if (z9) {
            fc fcVar2 = (fc) F05;
            fcVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 == null || (stickerSet2 = N0.emojiset) == null) {
                fcVar2.c(0L, false, false);
            } else {
                fcVar2.c(K0(stickerSet2), false, false);
            }
        }
        if (F06 instanceof fc) {
            TLRPC.ChatFull N02 = getMessagesController().N0(-j3);
            if (N02 == null || (stickerSet = N02.stickerset) == null) {
                ((fc) F06).c(0L, false, false);
            } else {
                ((fc) F06).d(J0(stickerSet));
            }
        }
        j1();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X0() || this.b < Z0();
    }

    public void j1() {
        ec ecVar;
        ec ecVar2;
        this.S = 0;
        int i7 = 1 + 1;
        this.T = 1;
        this.U = i7;
        this.V = i7 + 1;
        this.W = i7 + 2;
        this.X = i7 + 3;
        this.Y = i7 + 4;
        this.Z = i7 + 5;
        this.b0 = i7 + 6;
        int i10 = i7 + 8;
        this.R = i10;
        this.c0 = i7 + 7;
        if (this.x != 0 || this.s >= 0 || (this.D instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z9 = this.e0 >= 0;
            this.R = i7 + 9;
            this.e0 = i10;
            if (!z9 && (ecVar = this.N) != null) {
                ecVar.i(i10);
                this.N.g(this.c0);
            }
        } else {
            int i11 = this.e0;
            this.e0 = -1;
            if (i11 >= 0 && (ecVar2 = this.N) != null) {
                ecVar2.s(i11);
                this.N.g(this.c0);
            }
        }
        int i12 = this.R;
        this.d0 = i12;
        this.f0 = i12 + 1;
        this.R = i12 + 3;
        this.g0 = i12 + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[LOOP:1: B:32:0x009b->B:34:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1() {
        SparseIntArray T0;
        int[] iArr;
        int i7;
        org.telegram.ui.ActionBar.j6 k10;
        View F0;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.m6.Q0(string) == null || org.telegram.ui.ActionBar.m6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.m6.Q0(string2) == null || !org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (l6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.l6 Q0 = !this.J ? org.telegram.ui.ActionBar.m6.Q0(str2) : org.telegram.ui.ActionBar.m6.Q0(str);
            this.r0.clear();
            String[] strArr = new String[1];
            String str3 = Q0.d;
            T0 = str3 == null ? org.telegram.ui.ActionBar.m6.T0(null, str3, strArr) : org.telegram.ui.ActionBar.m6.T0(new File(Q0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.m6.em;
            if (iArr != null) {
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    this.r0.put(i10, iArr[i10]);
                }
            }
            for (i7 = 0; i7 < T0.size(); i7++) {
                this.r0.put(T0.keyAt(i7), T0.valueAt(i7));
            }
            k10 = Q0.k(false);
            if (k10 != null) {
                k10.d(T0, this.r0);
            }
            this.y0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d7, this.resourceProvider));
            this.H = fi.y5.f(this.H, this.currentAccount, this.F, this.J);
            F0 = F0(this.S);
            if (F0 instanceof org.telegram.ui.Cells.z9) {
                return;
            }
            ((org.telegram.ui.Cells.z9) F0).setOverrideBackground(this.H);
            return;
        }
        str = string;
        if (!this.J) {
        }
        this.r0.clear();
        String[] strArr2 = new String[1];
        String str32 = Q0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.m6.em;
        if (iArr != null) {
        }
        while (i7 < T0.size()) {
        }
        k10 = Q0.k(false);
        if (k10 != null) {
        }
        this.y0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d7, this.resourceProvider));
        this.H = fi.y5.f(this.H, this.currentAccount, this.F, this.J);
        F0 = F0(this.S);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (this.b < Z0() || !X0()) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        c1();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public boolean onFragmentCreate() {
        getMediaDataController().Y0();
        getNotificationCenter().c(this, org.telegram.messenger.qs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.p3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.p3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.y1);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        if (this.d || this.O == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(68.0f) + i12;
        ViewGroup.LayoutParams layoutParams = this.O.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.O.setLayoutParams(layoutParams);
        }
        if (this.O.getPaddingLeft() != i7 || this.O.getPaddingRight() != i11 || this.O.getPaddingBottom() != i12) {
            this.O.setPadding(i7, 0, i11, i12);
        }
        oi.a.e(this.M, i10, i12, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), org.telegram.messenger.g0.L(68.0f));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            C0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.b bVar = this.mSystemInsets;
        onInsets(bVar.a, bVar.b, bVar.c, bVar.d);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void setResourceProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.q0 = h6Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i7) {
    }
}
