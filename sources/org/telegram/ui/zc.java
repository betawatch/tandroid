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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class zc extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public TLRPC.EmojiStatus D;
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.bi0 K;
    public org.telegram.ui.ActionBar.t0 L;
    public org.telegram.ui.Components.tk0 M;
    public lc N;
    public FrameLayout O;
    public vh.d P;
    public hc Q;
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
    public org.telegram.ui.ActionBar.k2 l0;
    public ic m0;
    public long n;
    public float n0;
    public ValueAnimator o0;
    public boolean p0;
    public org.telegram.ui.ActionBar.p6 q0;
    public int r;
    public final SparseIntArray r0;
    public int s;
    public final org.telegram.ui.ActionBar.c5 s0;
    public final org.telegram.ui.ActionBar.c5 t0;
    public final org.telegram.ui.ActionBar.c5 u0;
    public final org.telegram.ui.ActionBar.c5 v0;
    public long w;
    public final Drawable w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Paint y0;

    public zc(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
        this.J = q6;
        this.R = 0;
        this.p0 = q6;
        this.r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, this.resourceProvider));
        this.w0 = org.telegram.messenger.w0.b.getDrawable(R.drawable.msg_check_s).mutate();
        this.x0 = org.telegram.messenger.w0.b.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j10;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
        if (L0 != null) {
            this.b = L0.level;
        }
        org.telegram.messenger.vp.r1(this.currentAccount).G0().a(j10, new ag.e0(13, this, L0));
        this.resourceProvider = new yc(this);
        this.s0 = new org.telegram.ui.ActionBar.c5(0, false, false, this.resourceProvider);
        this.t0 = new org.telegram.ui.ActionBar.c5(0, false, true, this.resourceProvider);
        this.u0 = new org.telegram.ui.ActionBar.c5(0, true, false, this.resourceProvider);
        this.v0 = new org.telegram.ui.ActionBar.c5(0, true, true, this.resourceProvider);
    }

    public static void Y(zc zcVar) {
        org.telegram.ui.ActionBar.p6 p6Var = zcVar.resourceProvider;
        if (p6Var instanceof yc) {
            zc zcVar2 = ((yc) p6Var).a;
            zcVar2.J = !zcVar2.J;
            zcVar2.j1();
            zcVar2.f1(false);
        } else {
            zcVar.J = !zcVar.J;
            zcVar.j1();
        }
        zcVar.a1(zcVar.J, true);
        zcVar.f1(false);
        org.telegram.ui.ActionBar.t6.Am++;
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
    public static void Z(zc zcVar, org.telegram.messenger.h3 h3Var) {
        int i10;
        int i11;
        long j10 = zcVar.a;
        if (zcVar.e != zcVar.f) {
            org.telegram.messenger.lp lpVar = zcVar.getMessagesController().r4;
            org.telegram.messenger.kp d = lpVar == null ? null : lpVar.d(zcVar.f);
            if (d != null && d.l(zcVar.d) > zcVar.b) {
                i10 = d.l(zcVar.d);
                if (zcVar.r != zcVar.s) {
                    org.telegram.messenger.lp lpVar2 = zcVar.getMessagesController().s4;
                    org.telegram.messenger.kp d10 = lpVar2 != null ? lpVar2.d(zcVar.s) : null;
                    if (d10 != null && d10.l(zcVar.d) > zcVar.b) {
                        i10 = d10.l(zcVar.d);
                        i11 = 24;
                        int i12 = i10;
                        if (zcVar.h != zcVar.n && zcVar.getMessagesController().r5 > zcVar.b) {
                            i11 = 27;
                        }
                        if (zcVar.w != zcVar.x && zcVar.P0() > zcVar.b) {
                            i11 = 28;
                        }
                        if (!org.telegram.messenger.o5.a(zcVar.y, zcVar.D) && zcVar.L0() > zcVar.b) {
                            i11 = !(zcVar.D instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        if (!org.telegram.messenger.g4.v(zcVar.E, zcVar.F)) {
                            i11 = !TextUtils.isEmpty(org.telegram.messenger.g4.j(zcVar.F)) ? 22 : 23;
                        }
                        int i13 = i11;
                        if (zcVar.getParentActivity() == null || zcVar.getParentActivity() == null) {
                            return;
                        }
                        fc fcVar = new fc(zcVar, zcVar.getParentActivity(), i13, zcVar.currentAccount, zcVar.getResourceProvider(), i12);
                        fcVar.A1(h3Var);
                        fcVar.z1(zcVar.c, true);
                        fcVar.B1(j10);
                        TLRPC.Chat L0 = zcVar.getMessagesController().L0(Long.valueOf(-j10));
                        if (L0 != null) {
                            fcVar.I2 = new h0(16, zcVar, L0);
                        }
                        zcVar.showDialog(fcVar);
                        zcVar.P.setLoading(false);
                        return;
                    }
                }
                i11 = 20;
                int i122 = i10;
                if (zcVar.h != zcVar.n) {
                    i11 = 27;
                }
                if (zcVar.w != zcVar.x) {
                    i11 = 28;
                }
                if (!org.telegram.messenger.o5.a(zcVar.y, zcVar.D)) {
                    if (!(zcVar.D instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!org.telegram.messenger.g4.v(zcVar.E, zcVar.F)) {
                }
                int i132 = i11;
                if (zcVar.getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i10 = 0;
        if (zcVar.r != zcVar.s) {
        }
        i11 = 20;
        int i1222 = i10;
        if (zcVar.h != zcVar.n) {
        }
        if (zcVar.w != zcVar.x) {
        }
        if (!org.telegram.messenger.o5.a(zcVar.y, zcVar.D)) {
        }
        if (!org.telegram.messenger.g4.v(zcVar.E, zcVar.F)) {
        }
        int i1322 = i11;
        if (zcVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(zc zcVar, TLRPC.ChatFull chatFull, View view, int i10) {
        long j10;
        long f7;
        int i11;
        long j11 = zcVar.a;
        int i12 = 0;
        if (!(view instanceof mc)) {
            if (i10 == zcVar.e0) {
                zcVar.s = -1;
                zcVar.x = 0L;
                if (zcVar.D instanceof TLRPC.TL_emojiStatusCollectible) {
                    zcVar.D = null;
                }
                zcVar.h1();
                zcVar.d1(true);
                zcVar.i1();
                zcVar.f1(true);
                return;
            }
            if (i10 == zcVar.X) {
                Activity parentActivity = zcVar.getParentActivity();
                long j12 = zcVar.a;
                org.telegram.ui.ActionBar.p6 p6Var = zcVar.resourceProvider;
                cc ccVar = new cc(zcVar, i12);
                e eVar = new e(zcVar, 10);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = zcVar.c;
                int i13 = org.telegram.ui.Components.dp.c2;
                org.telegram.ui.Components.bi biVar = new org.telegram.ui.Components.bi(parentActivity, zcVar, false, false, false, p6Var);
                biVar.n = true;
                biVar.z1(org.telegram.messenger.cd.L0(2131752139, null));
                biVar.T3 = new org.telegram.ui.Components.uo(biVar, tL_premium_boostsStatus, p6Var, eVar, j12, ccVar, zcVar);
                biVar.x1(1, false);
                biVar.d1();
                biVar.a2.g0();
                biVar.show();
                return;
            }
            return;
        }
        if (i10 == zcVar.j0) {
            if (chatFull == null) {
                return;
            }
            k60 k60Var = new k60(-j11);
            k60Var.i0(chatFull);
            zcVar.presentFragment(k60Var);
            return;
        }
        if (i10 == zcVar.U) {
            f7 = zcVar.n;
        } else if (i10 == zcVar.c0) {
            f7 = zcVar.x;
        } else {
            if (i10 != zcVar.f0) {
                j10 = 0;
                if (i10 != zcVar.h0) {
                    int N0 = zcVar.N0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = zcVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < N0) {
                        zcVar.Z0(29);
                        return;
                    }
                    k60 k60Var2 = new k60(-j11, 0);
                    k60Var2.i0(chatFull);
                    zcVar.presentFragment(k60Var2);
                    return;
                }
                mc mcVar = (mc) view;
                boolean z10 = i10 == zcVar.f0;
                bc bcVar = new bc(zcVar, i10, view);
                int w02 = zcVar.D instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, zcVar.resourceProvider) : mcVar.f;
                if (zcVar.Q == null) {
                    org.telegram.ui.Components.d5 d5Var = mcVar.c;
                    z21[] z21VarArr = new z21[1];
                    boolean z11 = ((float) (mcVar.getHeight() + mcVar.getTop())) > ((float) zcVar.M.getMeasuredHeight()) / 2.0f;
                    float L = org.telegram.messenger.i0.L(330.0f);
                    Point point = org.telegram.messenger.i0.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f);
                    Drawable[] drawableArr = d5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        if (drawable instanceof org.telegram.ui.Components.f5) {
                            ((org.telegram.ui.Components.f5) drawable).o(d5Var);
                        }
                        drawableArr[1] = null;
                    }
                    d5Var.f();
                    mcVar.f();
                    Rect rect = org.telegram.messenger.i0.Q;
                    rect.set(d5Var.getBounds());
                    int L2 = z11 ? (org.telegram.messenger.i0.L(12.0f) + (-rect.centerY())) - min : (-(mcVar.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                    int centerX = rect.centerX() - (point.x - min2);
                    if (z10) {
                        i11 = z11 ? 10 : 9;
                    } else {
                        i11 = z11 ? 5 : 7;
                    }
                    gc gcVar = new gc(zcVar, zcVar, zcVar.getParentActivity(), Integer.valueOf(centerX), i11, zcVar.getResourceProvider(), z11 ? 24 : 16, w02, bcVar, z21VarArr);
                    gcVar.g1 = true;
                    gcVar.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                    gcVar.setSaveState(3);
                    gcVar.y(d5Var, mcVar);
                    hc hcVar = new hc(zcVar, gcVar);
                    zcVar.Q = hcVar;
                    z21VarArr[0] = hcVar;
                    hcVar.showAsDropDown(mcVar, 0, L2, 53);
                    z21VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = zcVar.D;
            f7 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : org.telegram.messenger.o5.f(emojiStatus);
        }
        j10 = f7;
        if (i10 != zcVar.h0) {
        }
    }

    public static void e1(View view) {
        if (view instanceof mc) {
            ((mc) view).updateColors();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.p8) {
            ((org.telegram.ui.Cells.p8) view).updateColors();
        } else if (view instanceof qc) {
            ((qc) view).updateColors();
        } else if (view instanceof xc) {
            ((xc) view).updateColors();
        }
    }

    public final void A0() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null) {
            return;
        }
        lVar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.t6.A8) : -1);
        this.actionBar.D((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.t6.v8) : -1, false);
    }

    public void B0() {
        A0();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.s8));
        }
        org.telegram.ui.Components.tk0 tk0Var = this.M;
        if (tk0Var != null && this.d) {
            tk0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.a7));
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
    public final void C0() {
        long j10;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        long j11;
        long j12;
        ?? r72;
        if (this.c == null || this.P.Q) {
            return;
        }
        int i14 = this.b;
        int Y0 = Y0();
        long j13 = this.a;
        int i15 = 1;
        if (i14 < Y0) {
            this.P.setLoading(true);
            getMessagesController().G0().b(j13, this.c, new cc(this, i15));
            return;
        }
        int[] iArr = {0};
        final ag.m2 m2Var = new ag.m2(this, new boolean[]{false}, new int[]{0}, iArr, 4);
        long j14 = -j13;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j14));
        if (L0 == null) {
            org.telegram.messenger.f8.d("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(this), R.raw.error, 36);
            return;
        }
        this.P.setLoading(true);
        final int i16 = 2;
        if (this.e == this.f) {
            j10 = j13;
            i10 = 3;
            if (this.h == this.n) {
                i11 = 3;
                z10 = true;
                i12 = 0;
                if (this.r == this.s || this.w != this.x) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    tL_channels_updateColor.channel = getMessagesController().g1(j14);
                    tL_channels_updateColor.for_profile = z10;
                    if (L0.profile_color == null) {
                        L0.profile_color = new TLRPC.TL_peerColor();
                        L0.flags2 |= 256;
                    }
                    i13 = this.s;
                    if (i13 < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i13;
                        TLRPC.PeerColor peerColor = L0.profile_color;
                        peerColor.flags |= 1;
                        peerColor.color = i13;
                    } else {
                        L0.profile_color.flags &= -2;
                    }
                    j11 = this.x;
                    if (j11 == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j11;
                        TLRPC.PeerColor peerColor2 = L0.profile_color;
                        peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j11;
                    } else {
                        TLRPC.PeerColor peerColor3 = L0.profile_color;
                        peerColor3.flags &= -3;
                        peerColor3.background_emoji_id = 0L;
                    }
                    iArr[i12] = iArr[i12] + 1;
                    final int i17 = i11;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.ac
                        public final /* synthetic */ zc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i17) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                }
                if (org.telegram.messenger.g4.v(this.E, this.F)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    j12 = j10;
                    tL_messages_setChatWallPaper.peer = getMessagesController().i1(j12);
                    TLRPC.WallPaper wallPaper = this.F;
                    if (wallPaper != null) {
                        if (TextUtils.isEmpty(org.telegram.messenger.g4.j(wallPaper))) {
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
                            tL_wallPaperSettings.emoticon = org.telegram.messenger.g4.j(this.F);
                        }
                    }
                    iArr[i12] = iArr[i12] + 1;
                    final int i18 = i12;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.ac
                        public final /* synthetic */ zc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i18) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull M0 = getMessagesController().M0(j14);
                    org.telegram.messenger.g4.f(this.currentAccount).r(j12, this.F);
                    if (M0 != null) {
                        TLRPC.WallPaper wallPaper4 = this.F;
                        if (wallPaper4 == null) {
                            M0.flags2 &= -129;
                            M0.wallpaper = null;
                        } else {
                            M0.flags2 |= 128;
                            M0.wallpaper = wallPaper4;
                        }
                        getMessagesController().O3(M0);
                        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.k(org.telegram.messenger.zs.T, M0, 0, bool, bool);
                    }
                } else {
                    j12 = j10;
                }
                if (org.telegram.messenger.o5.a(this.y, this.D)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().g1(j14);
                    TLRPC.EmojiStatus emojiStatus = this.D;
                    if (emojiStatus == null || (emojiStatus instanceof TLRPC.TL_emojiStatusEmpty)) {
                        tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        L0.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        L0.flags2 &= -513;
                    } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_inputEmojiStatusCollectible.collectible_id = tL_emojiStatusCollectible.collectible_id;
                        tL_inputEmojiStatusCollectible.flags = tL_emojiStatusCollectible.flags;
                        tL_inputEmojiStatusCollectible.until = tL_emojiStatusCollectible.until;
                        tL_channels_updateEmojiStatus.emoji_status = tL_inputEmojiStatusCollectible;
                        L0.emoji_status = this.D;
                        L0.flags |= 512;
                    } else {
                        tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                        L0.emoji_status = emojiStatus;
                        L0.flags |= 512;
                    }
                    getMessagesController().g5(j12, this.D);
                    r72 = 0;
                    final int i19 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.ac
                        public final /* synthetic */ zc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i19) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    }
                                    m2Var.a(tL_error);
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
                getMessagesController().N3(L0, r72);
                org.telegram.messenger.zs notificationCenter2 = getNotificationCenter();
                int i20 = org.telegram.messenger.vp.D8;
                Object[] objArr = new Object[1];
                objArr[r72] = Integer.valueOf(TLObject.FLAG_19);
                notificationCenter2.k(org.telegram.messenger.zs.r, objArr);
                return;
            }
        } else {
            j10 = j13;
            i10 = 3;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().g1(j14);
        tL_channels_updateColor2.for_profile = false;
        if (L0.color == null) {
            L0.color = new TLRPC.TL_peerColor();
            L0.flags2 |= 128;
        }
        int i21 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i21 | 4;
        int i22 = this.f;
        tL_channels_updateColor2.color = i22;
        TLRPC.PeerColor peerColor4 = L0.color;
        i11 = i10;
        int i23 = peerColor4.flags;
        int i24 = i23 | 1;
        peerColor4.flags = i24;
        peerColor4.color = i22;
        z10 = true;
        i12 = 0;
        long j15 = this.n;
        if (j15 != 0) {
            tL_channels_updateColor2.flags = i21 | 5;
            tL_channels_updateColor2.background_emoji_id = j15;
            peerColor4.flags = i23 | 3;
            peerColor4.background_emoji_id = j15;
        } else {
            peerColor4.flags = i24 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.ac
            public final /* synthetic */ zc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i16) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                        }
                        m2Var.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                        }
                        m2Var.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                        }
                        m2Var.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                        }
                        m2Var.a(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor3.channel = getMessagesController().g1(j14);
        tL_channels_updateColor3.for_profile = z10;
        if (L0.profile_color == null) {
        }
        i13 = this.s;
        if (i13 < 0) {
        }
        j11 = this.x;
        if (j11 == 0) {
        }
        iArr[i12] = iArr[i12] + 1;
        final int i172 = i11;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.ac
            public final /* synthetic */ zc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i172) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                        }
                        m2Var.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                        }
                        m2Var.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                        }
                        m2Var.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                        }
                        m2Var.a(tL_error);
                        break;
                }
            }
        });
        if (org.telegram.messenger.g4.v(this.E, this.F)) {
        }
        if (org.telegram.messenger.o5.a(this.y, this.D)) {
        }
        if (iArr[r72] != 0) {
        }
    }

    public void D0() {
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(getParentActivity(), this.resourceProvider);
        this.M = tk0Var;
        tk0Var.setSections(false);
    }

    public final View E0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int F0() {
        return getMessagesController().v5;
    }

    public int G0() {
        return 0;
    }

    public int H0() {
        return 0;
    }

    public final TLRPC.Document I0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0);
            }
        }
        return null;
    }

    public final long J0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0).id;
            }
        }
        return j10;
    }

    public int K0() {
        return 2131752412;
    }

    public int L0() {
        return getMessagesController().t5;
    }

    public int M0() {
        return 2131752413;
    }

    public int N0() {
        return 0;
    }

    public int O0() {
        return 3;
    }

    public int P0() {
        return getMessagesController().s5;
    }

    public int Q0() {
        return 2131752320;
    }

    public int R0() {
        return 0;
    }

    public int S0() {
        return 0;
    }

    public int T0() {
        return 2131752263;
    }

    public int U0() {
        return getMessagesController().u5;
    }

    public int V0() {
        return 2131752264;
    }

    public final boolean W0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && org.telegram.messenger.o5.a(this.y, this.D) && org.telegram.messenger.g4.v(this.E, this.F)) ? false : true;
    }

    public boolean X0() {
        return false;
    }

    public final int Y0() {
        int i10 = 0;
        if (this.e != this.f) {
            org.telegram.messenger.lp lpVar = getMessagesController().r4;
            org.telegram.messenger.kp d = lpVar == null ? null : lpVar.d(this.f);
            if (d != null) {
                i10 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i10 = Math.max(i10, getMessagesController().r5);
        }
        if (this.r != this.s) {
            org.telegram.messenger.lp lpVar2 = getMessagesController().s4;
            org.telegram.messenger.kp d10 = lpVar2 != null ? lpVar2.d(this.s) : null;
            if (d10 != null) {
                i10 = Math.max(i10, d10.l(this.d));
            }
        }
        if (this.w != this.x) {
            i10 = Math.max(i10, P0());
        }
        if (!org.telegram.messenger.o5.a(this.y, this.D)) {
            i10 = Math.max(i10, L0());
        }
        return !org.telegram.messenger.g4.v(this.E, this.F) ? Math.max(i10, U0()) : i10;
    }

    public final void a1(boolean z10, boolean z11) {
        if (this.p0 == z10) {
            return;
        }
        this.p0 = z10;
        if (z11) {
            org.telegram.ui.Components.bi0 bi0Var = this.K;
            bi0Var.P(z10 ? bi0Var.e[0] : 0);
            org.telegram.ui.Components.bi0 bi0Var2 = this.K;
            if (bi0Var2 != null) {
                bi0Var2.start();
                return;
            }
            return;
        }
        int i10 = z10 ? this.K.e[0] - 1 : 0;
        this.K.N(i10, false, true);
        this.K.P(i10);
        org.telegram.ui.ActionBar.t0 t0Var = this.L;
        if (t0Var != null) {
            t0Var.invalidate();
        }
    }

    public final void b1() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String L0 = org.telegram.messenger.cd.L0(2131752426, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752425, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751370, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.ec
            public final /* synthetic */ zc b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.C0();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.ec
            public final /* synthetic */ zc b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i112) {
                switch (i11) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.C0();
                        break;
                }
            }
        });
        showDialog(x1Var);
        org.telegram.ui.ActionBar.a7.V((TextView) x1Var.d(-2), org.telegram.ui.ActionBar.t6.q7, getResourceProvider());
    }

    public final void c1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.b = i10;
            if (L0 != null) {
                L0.level = i10;
            }
            lc lcVar = this.N;
            if (lcVar != null) {
                lcVar.f();
            }
            d1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public View createView(Context context) {
        org.telegram.ui.ActionBar.t0 d;
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = -this.a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        if (L0 != null) {
            int F = org.telegram.messenger.w3.F(L0);
            this.f = F;
            this.e = F;
            long G = org.telegram.messenger.w3.G(L0);
            this.n = G;
            this.h = G;
            int I = org.telegram.messenger.w3.I(L0);
            this.s = I;
            this.r = I;
            long J = org.telegram.messenger.w3.J(L0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = L0.emoji_status;
            this.D = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull M0 = getMessagesController().M0(j10);
        if (M0 != null) {
            TLRPC.WallPaper wallPaper = M0.wallpaper;
            this.F = wallPaper;
            this.E = wallPaper;
            String j11 = org.telegram.messenger.g4.j(wallPaper);
            if (j11 != null && j11.length() == 0) {
                this.G = this.E;
            }
        }
        ag.e eVar = new ag.e(this, 23);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752427, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(eVar);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131752427, null));
            this.actionBar.setActionBarMenuOnItemClick(eVar);
        }
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.sun_outline, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.K = bi0Var;
        bi0Var.h = true;
        if (this.J) {
            bi0Var.M(35);
            this.K.P(36);
        } else {
            bi0Var.P(0);
            this.K.M(0);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
        if (i5Var2 != null) {
            org.telegram.ui.ActionBar.o5 o10 = i5Var2.o();
            org.telegram.ui.Components.bi0 bi0Var2 = this.K;
            o10.getClass();
            d = o10.c(1, 0, null, bi0Var2, org.telegram.messenger.i0.L(48.0f), null);
        } else {
            d = this.actionBar.p().d(1, this.K);
        }
        this.L = d;
        FrameLayout frameLayout = new FrameLayout(context);
        i1();
        D0();
        if (this.d) {
            this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.a7));
        } else {
            setHasOwnBackground(true);
            this.M.setSectionsDrawBackground(true);
        }
        org.telegram.ui.Components.tk0 tk0Var = this.M;
        lc lcVar = new lc(this);
        this.N = lcVar;
        tk0Var.setAdapter(lcVar);
        int i10 = 3;
        new s4.r(3);
        this.M.setLayoutManager(new s4.a0());
        frameLayout.addView(this.M, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, this.d ? 68.0f : 0.0f));
        this.M.setOnItemClickListener(new mg.q0(i10, this, M0));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        this.M.setItemAnimator(jVar);
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.i(org.telegram.messenger.cd.L0(2131754218, null), false, true);
        this.P.setOnClickListener(new a(this, 11));
        d1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.O));
        }
        this.O.addView(this.P, w7.b6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, w7.b6.e(-1, 68, 80));
        setBulletinDelegate(new z8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public void d1(boolean z10) {
        if (this.P == null || this.c == null) {
            return;
        }
        int Y0 = Y0();
        if (this.b >= Y0) {
            this.P.g(null, z10);
            return;
        }
        if (this.I == null) {
            this.I = new SpannableStringBuilder("l");
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.mini_switch_lock, 0);
            dqVar.n = 1;
            this.I.setSpan(dqVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) org.telegram.messenger.cd.G(Y0, "BoostLevelRequired", new Object[0]));
        this.P.g(spannableStringBuilder, z10);
    }

    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.p3;
        long j10 = this.a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                c1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == org.telegram.messenger.zs.V2) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().G0().a(j10, new cc(this, 2));
        } else if (i10 == org.telegram.messenger.zs.y1 && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var == null || z4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public void f1(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.updateColors();
        } else {
            this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.t6.A8) : -1);
            this.actionBar.D((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.t6.v8) : -1, false);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.t6.t8), false);
        }
        if (z10) {
            return;
        }
        this.N.f();
        org.telegram.messenger.i0.d0(this.M, new ag.z0(this));
        if (this.d) {
            this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.a7));
        }
        this.P.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void g1(boolean z10) {
        org.telegram.messenger.jj messageObject;
        View E0 = E0(this.S);
        View E02 = E0(this.T);
        View E03 = E0(this.U);
        View E04 = E0(this.W);
        if (E0 instanceof org.telegram.ui.Cells.z9) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) E0;
            org.telegram.ui.Cells.q1[] cells = z9Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i10];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.c1 = this.f;
                    messageObject.d1 = this.n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = vh.k4.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            z9Var.setOverrideBackground(f7);
        }
        if (E02 instanceof qn0) {
            ((qn0) E02).a(this.f, z10);
        } else if (E02 instanceof qc) {
            ((qc) E02).a(this.f, z10);
        }
        if (E03 instanceof mc) {
            mc mcVar = (mc) E03;
            mcVar.a(this.currentAccount, this.f, true);
            mcVar.c(this.n, false, z10);
        }
        if (E04 instanceof xc) {
            xc xcVar = (xc) E04;
            String j10 = org.telegram.messenger.g4.j(this.F);
            if (j10 == null && this.F == null && this.G != null) {
                j10 = "❌";
            }
            xcVar.a(j10, z10);
            xcVar.setGalleryWallpaper(this.G);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        if (this.d) {
            return null;
        }
        return this.M;
    }

    public final void h1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View E0 = E0(this.Z);
        View E02 = E0(this.b0);
        View E03 = E0(this.c0);
        View E04 = E0(this.f0);
        View E05 = E0(this.h0);
        View E06 = E0(this.j0);
        if (E0 instanceof sc) {
            TLRPC.EmojiStatus emojiStatus = this.D;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                sc scVar = (sc) E0;
                rc rcVar = scVar.b;
                org.telegram.messenger.kp a2 = org.telegram.messenger.kp.a(emojiStatus);
                rcVar.c(a2, true);
                scVar.a.c(a2, true);
                rcVar.d(((TLRPC.TL_emojiStatusCollectible) this.D).pattern_document_id, true, true);
            } else {
                sc scVar2 = (sc) E0;
                rc rcVar2 = scVar2.b;
                int i10 = this.s;
                rcVar2.b(i10, true);
                scVar2.a.b(scVar2.h.currentAccount, i10, true);
                rcVar2.d(this.x, false, true);
            }
            sc scVar3 = (sc) E0;
            rc rcVar3 = scVar3.b;
            rcVar3.e(org.telegram.messenger.o5.f(this.D), false, true);
            rcVar3.a(this.f);
            scVar3.updateColors();
        }
        if (E02 instanceof qn0) {
            ((qn0) E02).a(this.s, true);
        } else if (E02 instanceof qc) {
            ((qc) E02).a(this.f, true);
        }
        if (E03 instanceof mc) {
            mc mcVar = (mc) E03;
            mcVar.a(this.currentAccount, this.s, false);
            mcVar.c(this.x, false, true);
        }
        if (E04 instanceof mc) {
            TLRPC.EmojiStatus emojiStatus2 = this.D;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((mc) E04).b(org.telegram.messenger.kp.a(emojiStatus2));
            } else {
                ((mc) E04).a(this.currentAccount, this.s, false);
            }
            ((mc) E04).c(org.telegram.messenger.o5.f(this.D), org.telegram.messenger.o5.B(this.D), true);
        }
        boolean z10 = E05 instanceof mc;
        long j10 = this.a;
        if (z10) {
            mc mcVar2 = (mc) E05;
            mcVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
            if (M0 == null || (stickerSet2 = M0.emojiset) == null) {
                mcVar2.c(0L, false, false);
            } else {
                mcVar2.c(J0(stickerSet2), false, false);
            }
        }
        if (E06 instanceof mc) {
            TLRPC.ChatFull M02 = getMessagesController().M0(-j10);
            if (M02 == null || (stickerSet = M02.stickerset) == null) {
                ((mc) E06).c(0L, false, false);
            } else {
                ((mc) E06).d(I0(stickerSet));
            }
        }
        i1();
    }

    public void i1() {
        lc lcVar;
        lc lcVar2;
        this.S = 0;
        int i10 = 1 + 1;
        this.T = 1;
        this.U = i10;
        this.V = i10 + 1;
        this.W = i10 + 2;
        this.X = i10 + 3;
        this.Y = i10 + 4;
        this.Z = i10 + 5;
        this.b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.c0 = i10 + 7;
        if (this.x != 0 || this.s >= 0 || (this.D instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z10 = this.e0 >= 0;
            this.R = i10 + 9;
            this.e0 = i11;
            if (!z10 && (lcVar = this.N) != null) {
                lcVar.i(i11);
                this.N.g(this.c0);
            }
        } else {
            int i12 = this.e0;
            this.e0 = -1;
            if (i12 >= 0 && (lcVar2 = this.N) != null) {
                lcVar2.s(i12);
                this.N.g(this.c0);
            }
        }
        int i13 = this.R;
        this.d0 = i13;
        this.f0 = i13 + 1;
        this.R = i13 + 3;
        this.g0 = i13 + 2;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !W0() || this.b < Y0();
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
    public final void j1() {
        SparseIntArray T0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.r6 k10;
        View E0;
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.t6.Q0(string) == null || org.telegram.ui.ActionBar.t6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.t6.Q0(string2) == null || !org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (s6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.s6 Q0 = !this.J ? org.telegram.ui.ActionBar.t6.Q0(str2) : org.telegram.ui.ActionBar.t6.Q0(str);
            this.r0.clear();
            String[] strArr = new String[1];
            String str3 = Q0.d;
            T0 = str3 == null ? org.telegram.ui.ActionBar.t6.T0(null, str3, strArr) : org.telegram.ui.ActionBar.t6.T0(new File(Q0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.t6.em;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    this.r0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < T0.size(); i10++) {
                this.r0.put(T0.keyAt(i10), T0.valueAt(i10));
            }
            k10 = Q0.k(false);
            if (k10 != null) {
                k10.d(T0, this.r0);
            }
            this.y0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, this.resourceProvider));
            this.H = vh.k4.f(this.H, this.currentAccount, this.F, this.J);
            E0 = E0(this.S);
            if (E0 instanceof org.telegram.ui.Cells.z9) {
                return;
            }
            ((org.telegram.ui.Cells.z9) E0).setOverrideBackground(this.H);
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
        iArr = org.telegram.ui.ActionBar.t6.em;
        if (iArr != null) {
        }
        while (i10 < T0.size()) {
        }
        k10 = Q0.k(false);
        if (k10 != null) {
        }
        this.y0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, this.resourceProvider));
        this.H = vh.k4.f(this.H, this.currentAccount, this.F, this.J);
        E0 = E0(this.S);
        if (E0 instanceof org.telegram.ui.Cells.z9) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (this.b < Y0() || !W0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        b1();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public boolean onFragmentCreate() {
        getMediaDataController().Y0();
        getNotificationCenter().c(this, org.telegram.messenger.zs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.zs.p3);
        getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.zs.p3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.y1);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        if (this.d || this.O == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(68.0f) + i13;
        ViewGroup.LayoutParams layoutParams = this.O.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.O.setLayoutParams(layoutParams);
        }
        if (this.O.getPaddingLeft() != i10 || this.O.getPaddingRight() != i12 || this.O.getPaddingBottom() != i13) {
            this.O.setPadding(i10, 0, i12, i13);
        }
        ei.b.e(this.M, i11, i13, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), org.telegram.messenger.i0.L(68.0f));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            B0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.c cVar = this.mSystemInsets;
        onInsets(cVar.a, cVar.b, cVar.c, cVar.d);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setResourceProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.q0 = p6Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void Z0(int i10) {
    }
}
