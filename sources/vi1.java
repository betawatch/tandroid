// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class vi1 extends d implements jm7 {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public p09 L;
    public r7 M;
    public r59 N;
    public ii1 O;
    public FrameLayout P;
    public b61 Q;
    public ei1 R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long a;
    public int a0;
    public int b;
    public boolean b0;
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
    public int l0;
    public d m0;
    public long n;
    public fi1 n0;
    public float o0;
    public ValueAnimator p0;
    public boolean q0;
    public int r;
    public ylb r0;
    public int s;
    public final SparseIntArray s0;
    public final m37 t0;
    public final m37 u0;
    public final m37 v0;
    public long w;
    public final m37 w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Drawable y0;
    public final Paint z0;

    public vi1(long j) {
        super(null);
        boolean o = cmb.I.o();
        this.K = o;
        this.S = 0;
        this.q0 = o;
        this.s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(cmb.v0(cmb.c7, this.resourceProvider));
        this.x0 = a.b.getDrawable(R.drawable.msg_check_s).mutate();
        this.y0 = a.b.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
        if (L0 != null) {
            this.b = L0.level;
        }
        oc7.r1(this.currentAccount).F0().a(j, new x0(this, L0, (byte) 15));
        this.resourceProvider = new ui1(this);
        this.t0 = new m37(0, false, false, this.resourceProvider);
        this.u0 = new m37(0, false, true, this.resourceProvider);
        this.v0 = new m37(0, true, false, this.resourceProvider);
        this.w0 = new m37(0, true, true, this.resourceProvider);
    }

    public static void f1(View view) {
        if (view instanceof ji1) {
            ((ji1) view).updateColors();
            return;
        }
        if (view instanceof xib) {
            ((xib) view).updateColors();
        } else if (view instanceof mi1) {
            ((mi1) view).updateColors();
        } else if (view instanceof ti1) {
            ((ti1) view).updateColors();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0() {
        byte b;
        byte b2;
        byte b3;
        boolean z;
        TLRPC.PeerColor peerColor;
        int i;
        int i2;
        long j;
        ?? r13;
        if (this.c == null || this.Q.R) {
            return;
        }
        int i3 = this.b;
        int Z0 = Z0();
        long j2 = this.a;
        byte b4 = 1;
        if (i3 < Z0) {
            this.Q.setLoading(true);
            getMessagesController().F0().b(j2, this.c, new zh1(this, b4));
            return;
        }
        int[] iArr = {0};
        final jv0 jv0Var = new jv0((Object) this, (Object) new boolean[]{false}, (Object) new int[]{0}, (Object) iArr, (byte) 2);
        long j3 = -j2;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j3));
        if (L0 == null) {
            fc4.d("channel is null in ChannelColorAcitivity");
            ts2.u(null, 2131743566, c41.b0(this), R.raw.error, 36);
            return;
        }
        this.Q.setLoading(true);
        if (this.e == this.f) {
            b = 3;
            if (this.h == this.n) {
                b2 = 3;
                z = true;
                b3 = 0;
                if (this.r == this.s || this.w != this.x) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    tL_channels_updateColor.channel = getMessagesController().g1(j3);
                    tL_channels_updateColor.for_profile = z;
                    peerColor = L0.profile_color;
                    if (peerColor == null) {
                        peerColor = new TLRPC.TL_peerColor();
                        L0.profile_color = peerColor;
                        L0.flags2 |= 256;
                    }
                    i = this.s;
                    if (i < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i;
                        i2 = peerColor.flags | 1;
                        peerColor.flags = i2;
                        peerColor.color = i;
                    } else {
                        i2 = peerColor.flags & (-2);
                        peerColor.flags = i2;
                    }
                    j = this.x;
                    if (j == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j;
                        peerColor.flags = i2 | 2;
                        peerColor.background_emoji_id = j;
                    } else {
                        peerColor.flags = i2 & (-3);
                        peerColor.background_emoji_id = 0L;
                    }
                    iArr[b3] = iArr[b3] + 1;
                    final byte b5 = b2;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: xh1
                        public final /* synthetic */ vi1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b6 = b5;
                            jv0 jv0Var2 = jv0Var;
                            vi1 vi1Var = this.b;
                            switch (b6) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                            }
                        }
                    });
                }
                if (!uf2.t(this.F, this.G)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    tL_messages_setChatWallPaper.peer = getMessagesController().i1(j2);
                    TLRPC.WallPaper wallPaper = this.G;
                    if (wallPaper != null) {
                        boolean isEmpty = TextUtils.isEmpty(uf2.h(wallPaper));
                        int i4 = tL_messages_setChatWallPaper.flags | 1;
                        if (isEmpty) {
                            tL_messages_setChatWallPaper.flags = i4;
                            TLRPC.WallPaper wallPaper2 = this.G;
                            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                                TLRPC.WallPaper wallPaper3 = this.G;
                                tL_inputWallPaper.id = wallPaper3.id;
                                tL_inputWallPaper.access_hash = wallPaper3.access_hash;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                            } else if (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = this.G.id;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                            }
                        } else {
                            tL_messages_setChatWallPaper.flags = i4;
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                            tL_inputWallPaperNoFile2.id = 0L;
                            tL_messages_setChatWallPaper.flags |= 4;
                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                            tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                            tL_wallPaperSettings.flags |= 128;
                            tL_wallPaperSettings.emoticon = uf2.h(this.G);
                        }
                    }
                    iArr[b3] = iArr[b3] + 1;
                    final byte b6 = b3;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: xh1
                        public final /* synthetic */ vi1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b62 = b6;
                            jv0 jv0Var2 = jv0Var;
                            vi1 vi1Var = this.b;
                            switch (b62) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull M0 = getMessagesController().M0(j3);
                    uf2.e(this.currentAccount).p(j2, this.G);
                    if (M0 != null) {
                        TLRPC.WallPaper wallPaper4 = this.G;
                        int i5 = M0.flags2;
                        if (wallPaper4 == null) {
                            M0.flags2 = i5 & (-129);
                            M0.wallpaper = null;
                        } else {
                            M0.flags2 = i5 | 128;
                            M0.wallpaper = wallPaper4;
                        }
                        getMessagesController().W3(M0);
                        nm7 notificationCenter = getNotificationCenter();
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.k(nm7.T, M0, 0, bool, bool);
                    }
                }
                if (pg3.a(this.y, this.E)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().g1(j3);
                    TLRPC.EmojiStatus emojiStatus = this.E;
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
                        L0.emoji_status = this.E;
                        L0.flags |= 512;
                    } else {
                        tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                        L0.emoji_status = emojiStatus;
                        L0.flags |= 512;
                    }
                    getMessagesController().r5(j2, this.E);
                    r13 = 0;
                    final byte b7 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: xh1
                        public final /* synthetic */ vi1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b62 = b7;
                            jv0 jv0Var2 = jv0Var;
                            vi1 vi1Var = this.b;
                            switch (b62) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        vi1Var.getClass();
                                    }
                                    jv0Var2.a(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    r13 = 0;
                }
                if (iArr[r13] != 0) {
                    finishFragment();
                    this.Q.setLoading(r13);
                    return;
                }
                getMessagesController().V3(L0, r13);
                nm7 notificationCenter2 = getNotificationCenter();
                int i6 = oc7.s5;
                Object[] objArr = new Object[1];
                objArr[r13] = Integer.valueOf(TLObject.FLAG_19);
                notificationCenter2.k(2, objArr);
                return;
            }
        } else {
            b = 3;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().g1(j3);
        tL_channels_updateColor2.for_profile = false;
        TLRPC.PeerColor peerColor2 = L0.color;
        if (peerColor2 == null) {
            peerColor2 = new TLRPC.TL_peerColor();
            L0.color = peerColor2;
            L0.flags2 |= 128;
        }
        int i7 = tL_channels_updateColor2.flags;
        b2 = b;
        tL_channels_updateColor2.flags = i7 | 4;
        int i8 = this.f;
        tL_channels_updateColor2.color = i8;
        int i9 = peerColor2.flags;
        b3 = 0;
        int i10 = i9 | 1;
        peerColor2.flags = i10;
        peerColor2.color = i8;
        z = true;
        long j4 = this.n;
        if (j4 != 0) {
            tL_channels_updateColor2.flags = i7 | 5;
            tL_channels_updateColor2.background_emoji_id = j4;
            peerColor2.flags = i9 | 3;
            peerColor2.background_emoji_id = j4;
        } else {
            peerColor2.flags = i10 & (-3);
            peerColor2.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        final byte b8 = 2;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: xh1
            public final /* synthetic */ vi1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                byte b62 = b8;
                jv0 jv0Var2 = jv0Var;
                vi1 vi1Var = this.b;
                switch (b62) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                        } else {
                            vi1Var.getClass();
                        }
                        jv0Var2.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                        } else {
                            vi1Var.getClass();
                        }
                        jv0Var2.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                        } else {
                            vi1Var.getClass();
                        }
                        jv0Var2.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                        } else {
                            vi1Var.getClass();
                        }
                        jv0Var2.a(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor3.channel = getMessagesController().g1(j3);
        tL_channels_updateColor3.for_profile = z;
        peerColor = L0.profile_color;
        if (peerColor == null) {
        }
        i = this.s;
        if (i < 0) {
        }
        j = this.x;
        if (j == 0) {
        }
        iArr[b3] = iArr[b3] + 1;
        final byte b52 = b2;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: xh1
            public final /* synthetic */ vi1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                byte b62 = b52;
                jv0 jv0Var2 = jv0Var;
                vi1 vi1Var = this.b;
                switch (b62) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                        } else {
                            vi1Var.getClass();
                        }
                        jv0Var2.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                        } else {
                            vi1Var.getClass();
                        }
                        jv0Var2.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                        } else {
                            vi1Var.getClass();
                        }
                        jv0Var2.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            vi1Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                        } else {
                            vi1Var.getClass();
                        }
                        jv0Var2.a(tL_error);
                        break;
                }
            }
        });
        if (!uf2.t(this.F, this.G)) {
        }
        if (pg3.a(this.y, this.E)) {
        }
        if (iArr[r13] != 0) {
        }
    }

    public void B0() {
        r59 r59Var = new r59(getParentActivity(), this.resourceProvider);
        this.N = r59Var;
        r59Var.setSections(false);
    }

    public final View C0(int i) {
        for (int i2 = 0; i2 < this.N.getChildCount(); i2++) {
            View childAt = this.N.getChildAt(i2);
            this.N.getClass();
            if (RecyclerView.R(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    public int D0() {
        return getMessagesController().l4.g2.f();
    }

    public int E0() {
        return 0;
    }

    public int F0() {
        return 0;
    }

    public final TLRPC.Document G0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet a0 = getMediaDataController().a0(stickerSet);
            if (!a0.documents.isEmpty()) {
                return a0.documents.get(0);
            }
        }
        return null;
    }

    public final long H0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j = stickerSet.thumb_document_id;
        if (j == 0) {
            TLRPC.TL_messages_stickerSet a0 = getMediaDataController().a0(stickerSet);
            if (!a0.documents.isEmpty()) {
                return a0.documents.get(0).id;
            }
        }
        return j;
    }

    public int I0() {
        return 2131752356;
    }

    public int J0() {
        return getMessagesController().l4.X1.f();
    }

    public int K0() {
        return 2131752357;
    }

    public int L0() {
        return 0;
    }

    public int M0() {
        return 3;
    }

    public int N0() {
        return getMessagesController().l4.W1.f();
    }

    public int O0() {
        return 2131752262;
    }

    public int P0() {
        return 0;
    }

    public int Q0() {
        return 0;
    }

    public int R0() {
        return 2131752200;
    }

    public int S0() {
        return getMessagesController().l4.f2.f();
    }

    public int T0() {
        return 2131752201;
    }

    public final boolean U0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && pg3.a(this.y, this.E) && uf2.t(this.F, this.G)) ? false : true;
    }

    public boolean V0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(TLRPC.ChatFull chatFull, View view, int i) {
        long j;
        long f;
        byte b = 0;
        if (!(view instanceof ji1)) {
            if (i == this.f0) {
                this.s = -1;
                this.x = 0L;
                if (this.E instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.E = null;
                }
                i1();
                e1(true);
                j1();
                g1(true);
                return;
            }
            if (i == this.Y) {
                Activity parentActivity = getParentActivity();
                ylb ylbVar = this.resourceProvider;
                zh1 zh1Var = new zh1(this, b);
                sz4 sz4Var = new sz4(this);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
                int i2 = if2.f2;
                i22 i22Var = new i22(parentActivity, this, false, false, false, ylbVar);
                i22Var.n = true;
                i22Var.v1(jb6.M0(2131752076, null));
                i22Var.W3 = new ze2(i22Var, tL_premium_boostsStatus, ylbVar, sz4Var, this.a, zh1Var, this);
                i22Var.t1(1, false);
                i22Var.Z0();
                i22Var.d2.h0();
                i22Var.show();
                return;
            }
            return;
        }
        int i3 = this.k0;
        long j2 = this.a;
        if (i == i3) {
            if (chatFull != null) {
                kd5 kd5Var = new kd5(-j2);
                kd5Var.j0(chatFull);
                presentFragment(kd5Var);
                return;
            }
            return;
        }
        if (i == this.V) {
            f = this.n;
        } else if (i == this.d0) {
            f = this.x;
        } else {
            if (i != this.g0) {
                j = 0;
                if (i != this.i0) {
                    int L0 = L0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < L0) {
                        a1(29);
                        return;
                    }
                    kd5 kd5Var2 = new kd5(-j2, 0);
                    kd5Var2.j0(chatFull);
                    presentFragment(kd5Var2);
                    return;
                }
                ji1 ji1Var = (ji1) view;
                boolean z = i == this.g0;
                yh1 yh1Var = new yh1(this, i, view);
                int v0 = this.E instanceof TLRPC.TL_emojiStatusCollectible ? cmb.v0(cmb.u6, this.resourceProvider) : ji1Var.f;
                if (this.R == null) {
                    tm tmVar = ji1Var.c;
                    mz9[] mz9VarArr = new mz9[1];
                    boolean z2 = ((float) (ji1Var.getHeight() + ji1Var.getTop())) > ((float) this.N.getMeasuredHeight()) / 2.0f;
                    float L = gm.L(330.0f);
                    Point point = gm.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(gm.L(324.0f), point.x * 0.95f);
                    Drawable[] drawableArr = tmVar.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        if (drawable instanceof vm) {
                            ((vm) drawable).n(tmVar);
                        }
                        drawableArr[1] = null;
                    }
                    tmVar.f();
                    ji1Var.f();
                    Rect rect = gm.Q;
                    rect.set(tmVar.getBounds());
                    int L2 = z2 ? (gm.L(12.0f) + (-rect.centerY())) - min : (-(ji1Var.getHeight() - rect.centerY())) - gm.L(16.0f);
                    di1 di1Var = new di1(this, this, getParentActivity(), Integer.valueOf(rect.centerX() - (point.x - min2)), z ? z2 ? 10 : 9 : z2 ? 5 : 7, getResourceProvider(), z2 ? 24 : 16, v0, yh1Var, mz9VarArr);
                    di1Var.h1 = true;
                    di1Var.setSelected(j == 0 ? null : Long.valueOf(j));
                    di1Var.setSaveState(3);
                    di1Var.y(tmVar, ji1Var);
                    ei1 ei1Var = new ei1(this, di1Var);
                    this.R = ei1Var;
                    mz9VarArr[0] = ei1Var;
                    ei1Var.showAsDropDown(ji1Var, 0, L2, 53);
                    mz9VarArr[0].a();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = this.E;
            f = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : pg3.f(emojiStatus);
        }
        j = f;
        if (i != this.i0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(vh1 vh1Var) {
        int i;
        int i2;
        if (this.e != this.f) {
            fc7 fc7Var = getMessagesController().E3;
            ec7 d = fc7Var == null ? null : fc7Var.d(this.f);
            if (d != null && d.l(this.d) > this.b) {
                i = d.l(this.d);
                byte b = 24;
                if (this.r != this.s) {
                    fc7 fc7Var2 = getMessagesController().F3;
                    ec7 d2 = fc7Var2 != null ? fc7Var2.d(this.s) : null;
                    if (d2 != null && d2.l(this.d) > this.b) {
                        i = d2.l(this.d);
                        i2 = 24;
                        int i3 = i;
                        if (this.h != this.n && getMessagesController().l4.V1.f() > this.b) {
                            i2 = 27;
                        }
                        if (this.w != this.x && N0() > this.b) {
                            i2 = 28;
                        }
                        if (!pg3.a(this.y, this.E) && J0() > this.b) {
                            i2 = !(this.E instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        if (!uf2.t(this.F, this.G)) {
                            i2 = !TextUtils.isEmpty(uf2.h(this.G)) ? 22 : 23;
                        }
                        int i4 = i2;
                        if (getParentActivity() == null || getParentActivity() == null) {
                            return;
                        }
                        ci1 ci1Var = new ci1(this, getParentActivity(), i4, this.currentAccount, getResourceProvider(), i3);
                        ci1Var.r1(vh1Var);
                        ci1Var.q1(this.c, true);
                        long j = this.a;
                        ci1Var.s1(j);
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
                        if (L0 != null) {
                            ci1Var.L2 = new y31(this, L0, b);
                        }
                        showDialog(ci1Var);
                        this.Q.setLoading(false);
                        return;
                    }
                }
                i2 = 20;
                int i32 = i;
                if (this.h != this.n) {
                    i2 = 27;
                }
                if (this.w != this.x) {
                    i2 = 28;
                }
                if (!pg3.a(this.y, this.E)) {
                    if (!(this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!uf2.t(this.F, this.G)) {
                }
                int i42 = i2;
                if (getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i = 0;
        byte b2 = 24;
        if (this.r != this.s) {
        }
        i2 = 20;
        int i322 = i;
        if (this.h != this.n) {
        }
        if (this.w != this.x) {
        }
        if (!pg3.a(this.y, this.E)) {
        }
        if (!uf2.t(this.F, this.G)) {
        }
        int i422 = i2;
        if (getParentActivity() == null) {
        }
    }

    public final void Y0() {
        ylb ylbVar = this.resourceProvider;
        if (ylbVar instanceof ui1) {
            vi1 vi1Var = ((ui1) ylbVar).a;
            vi1Var.K = !vi1Var.K;
            vi1Var.k1();
            vi1Var.g1(false);
        } else {
            this.K = !this.K;
            k1();
        }
        b1(this.K, true);
        g1(false);
        cmb.Dm++;
    }

    public final int Z0() {
        int i = 0;
        if (this.e != this.f) {
            fc7 fc7Var = getMessagesController().E3;
            ec7 d = fc7Var == null ? null : fc7Var.d(this.f);
            if (d != null) {
                i = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i = Math.max(i, getMessagesController().l4.V1.f());
        }
        if (this.r != this.s) {
            fc7 fc7Var2 = getMessagesController().F3;
            ec7 d2 = fc7Var2 != null ? fc7Var2.d(this.s) : null;
            if (d2 != null) {
                i = Math.max(i, d2.l(this.d));
            }
        }
        if (this.w != this.x) {
            i = Math.max(i, N0());
        }
        if (!pg3.a(this.y, this.E)) {
            i = Math.max(i, J0());
        }
        return !uf2.t(this.F, this.G) ? Math.max(i, S0()) : i;
    }

    public final void b1(boolean z, boolean z2) {
        if (this.q0 != z) {
            this.q0 = z;
            if (z2) {
                p09 p09Var = this.L;
                p09Var.K(z ? p09Var.e[0] : 0);
                p09 p09Var2 = this.L;
                if (p09Var2 != null) {
                    p09Var2.start();
                    return;
                }
                return;
            }
            int i = z ? this.L.e[0] - 1 : 0;
            this.L.I(i, false, true);
            this.L.K(i);
            r7 r7Var = this.M;
            if (r7Var != null) {
                r7Var.invalidate();
            }
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        final byte b = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = jb6.M0(2131752372, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752371, null);
        alertDialog$Builder.g(jb6.M0(2131751306, null), new ee(this) { // from class: bi1
            public final /* synthetic */ vi1 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar2, int i) {
                byte b2 = b;
                vi1 vi1Var = this.b;
                switch (b2) {
                    case 0:
                        vi1Var.finishFragment();
                        break;
                    default:
                        vi1Var.A0();
                        break;
                }
            }
        });
        final byte b2 = 1;
        alertDialog$Builder.j(jb6.M0(2131754181, null), new ee(this) { // from class: bi1
            public final /* synthetic */ vi1 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar2, int i) {
                byte b22 = b2;
                vi1 vi1Var = this.b;
                switch (b22) {
                    case 0:
                        vi1Var.finishFragment();
                        break;
                    default:
                        vi1Var.A0();
                        break;
                }
            }
        });
        showDialog(heVar);
        anb.X((TextView) heVar.c(-2), cmb.p7, getResourceProvider());
    }

    @Override // org.telegram.ui.ActionBar.d
    public View createView(Context context) {
        r7 d;
        oc7 messagesController = getMessagesController();
        long j = -this.a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        if (L0 != null) {
            int F = sd2.F(L0);
            this.f = F;
            this.e = F;
            long G = sd2.G(L0);
            this.n = G;
            this.h = G;
            int I = sd2.I(L0);
            this.s = I;
            this.r = I;
            long J = sd2.J(L0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = L0.emoji_status;
            this.E = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull M0 = getMessagesController().M0(j);
        if (M0 != null) {
            TLRPC.WallPaper wallPaper = M0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String h = uf2.h(wallPaper);
            if (h != null && h.length() == 0) {
                this.H = this.F;
            }
        }
        r8 r8Var = new r8(this, (byte) 21);
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setTitle(jb6.M0(2131752373, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(r8Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(jb6.M0(2131752373, null));
            this.actionBar.setActionBarMenuOnItemClick(r8Var);
        }
        p09 p09Var = new p09(R.raw.sun_outline, gm.L(28.0f), gm.L(28.0f), true, null);
        this.L = p09Var;
        p09Var.h = true;
        if (this.K) {
            p09Var.H(35);
            this.L.K(36);
        } else {
            p09Var.K(0);
            this.L.H(0);
        }
        this.L.a0 = true;
        int v0 = cmb.v0(cmb.I9, this.resourceProvider);
        this.L.L(v0, "Sunny");
        this.L.L(v0, "Path 6");
        this.L.L(v0, "Path");
        this.L.L(v0, "Path 5");
        rja rjaVar2 = this.simpleActionBar;
        if (rjaVar2 != null) {
            yja t = rjaVar2.t();
            p09 p09Var2 = this.L;
            t.getClass();
            d = t.b(1, 0, null, p09Var2, gm.L(48.0f), null);
        } else {
            d = this.actionBar.t().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        B0();
        if (this.d) {
            this.N.setBackgroundColor(getThemedColor(cmb.Z6));
        } else {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        }
        r59 r59Var = this.N;
        ii1 ii1Var = new ii1(this);
        this.O = ii1Var;
        r59Var.setAdapter(ii1Var);
        new q55(3);
        this.N.setLayoutManager(new u46());
        frameLayout.addView(this.N, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, this.d ? 68.0f : 0.0f));
        this.N.setOnItemClickListener(new k0(this, M0, (byte) 5));
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.N.setItemAnimator(sc3Var);
        b61 b61Var = new b61(this.resourceProvider, context, true);
        b61Var.setRoundRadius(24);
        this.Q = b61Var;
        b61Var.i(jb6.M0(2131754183, null), false, true);
        this.Q.setOnClickListener(new k81(this, (byte) 8));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            anb.h(cmb.Z6, getResourceProvider(), frameLayout2);
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, qoe.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, qoe.e(-1, 68, 80));
        setBulletinDelegate(new s20(this, (byte) 4));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i = tL_premium_boostsStatus.level;
            this.b = i;
            if (L0 != null) {
                L0.level = i;
            }
            ii1 ii1Var = this.O;
            if (ii1Var != null) {
                ii1Var.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.r3;
        byte b = 2;
        long j = this.a;
        if (i == i3) {
            if (j == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i == nm7.X2) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().F0().a(j, new zh1(this, b));
        } else if (i == nm7.y1 && j == ((Long) objArr[0]).longValue()) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var == null || tk5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public void e1(boolean z) {
        if (this.Q == null || this.c == null) {
            return;
        }
        int Z0 = Z0();
        if (this.b >= Z0) {
            this.Q.g(null, z);
            return;
        }
        if (this.J == null) {
            this.J = new SpannableStringBuilder("l");
            pn2 pn2Var = new pn2(R.drawable.mini_switch_lock, 0);
            pn2Var.n = 1;
            this.J.setSpan(pn2Var, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) jb6.G(Z0, "BoostLevelRequired", new Object[0]));
        this.Q.g(spannableStringBuilder, z);
    }

    public void g1(boolean z) {
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.updateColors();
        } else {
            this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(cmb.z8) : -1);
            this.actionBar.H((!this.d || this.s == -1) ? getThemedColor(cmb.u8) : -1, false);
            this.actionBar.G(getThemedColor(cmb.s8), false);
        }
        if (z) {
            return;
        }
        this.O.f();
        gm.d0(this.N, new bn0(this));
        if (this.d) {
            this.P.setBackgroundColor(getThemedColor(cmb.Z6));
        }
        this.Q.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        if (this.d) {
            return null;
        }
        return this.N;
    }

    public final void h1(boolean z) {
        k47 messageObject;
        View C0 = C0(this.T);
        View C02 = C0(this.U ? 1 : 0);
        View C03 = C0(this.V);
        View C04 = C0(this.X);
        if (C0 instanceof uob) {
            uob uobVar = (uob) C0;
            rc2[] cells = uobVar.getCells();
            for (int i = 0; i < cells.length; i++) {
                rc2 rc2Var = cells[i];
                if (rc2Var != null && (messageObject = rc2Var.getMessageObject()) != null) {
                    messageObject.e1 = this.f;
                    messageObject.f1 = this.n;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
            Drawable e = cl8.e(this.I, this.currentAccount, this.G, this.K);
            this.I = e;
            uobVar.setOverrideBackground(e);
        }
        if (C02 instanceof z28) {
            ((z28) C02).a(this.f, z);
        } else if (C02 instanceof mi1) {
            ((mi1) C02).a(this.f, z);
        }
        if (C03 instanceof ji1) {
            ji1 ji1Var = (ji1) C03;
            ji1Var.a(this.currentAccount, this.f, true);
            ji1Var.c(this.n, false, z);
        }
        if (C04 instanceof ti1) {
            ti1 ti1Var = (ti1) C04;
            String h = uf2.h(this.G);
            if (h == null && this.G == null && this.H != null) {
                h = "❌";
            }
            ti1Var.a(h, z);
            ti1Var.setGalleryWallpaper(this.H);
        }
    }

    public final void i1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View C0 = C0(this.a0);
        View C02 = C0(this.c0);
        View C03 = C0(this.d0);
        View C04 = C0(this.g0);
        View C05 = C0(this.i0);
        View C06 = C0(this.k0);
        if (C0 instanceof oi1) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                oi1 oi1Var = (oi1) C0;
                ni1 ni1Var = oi1Var.b;
                ec7 a = ec7.a(emojiStatus);
                ni1Var.c(a, true);
                oi1Var.a.c(a, true);
                ni1Var.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                oi1 oi1Var2 = (oi1) C0;
                ni1 ni1Var2 = oi1Var2.b;
                int i = this.s;
                ni1Var2.b(i, true);
                oi1Var2.a.b(oi1Var2.h.currentAccount, i, true);
                ni1Var2.d(this.x, false, true);
            }
            oi1 oi1Var3 = (oi1) C0;
            ni1 ni1Var3 = oi1Var3.b;
            ni1Var3.e(pg3.f(this.E), false, true);
            ni1Var3.a(this.f);
            oi1Var3.updateColors();
        }
        if (C02 instanceof z28) {
            ((z28) C02).a(this.s, true);
        } else if (C02 instanceof mi1) {
            ((mi1) C02).a(this.f, true);
        }
        if (C03 instanceof ji1) {
            ji1 ji1Var = (ji1) C03;
            ji1Var.a(this.currentAccount, this.s, false);
            ji1Var.c(this.x, false, true);
        }
        if (C04 instanceof ji1) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((ji1) C04).b(ec7.a(emojiStatus2));
            } else {
                ((ji1) C04).a(this.currentAccount, this.s, false);
            }
            ((ji1) C04).c(pg3.f(this.E), pg3.A(this.E), true);
        }
        boolean z = C05 instanceof ji1;
        long j = this.a;
        if (z) {
            ji1 ji1Var2 = (ji1) C05;
            ji1Var2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull M0 = getMessagesController().M0(-j);
            if (M0 == null || (stickerSet2 = M0.emojiset) == null) {
                ji1Var2.c(0L, false, false);
            } else {
                ji1Var2.c(H0(stickerSet2), false, false);
            }
        }
        if (C06 instanceof ji1) {
            TLRPC.ChatFull M02 = getMessagesController().M0(-j);
            if (M02 == null || (stickerSet = M02.stickerset) == null) {
                ((ji1) C06).c(0L, false, false);
            } else {
                ((ji1) C06).d(G0(stickerSet));
            }
        }
        j1();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !U0() || this.b < Z0();
    }

    public void j1() {
        ii1 ii1Var;
        ii1 ii1Var2;
        this.T = 0;
        this.U = true;
        this.V = 2;
        this.W = 3;
        this.X = 4;
        this.Y = 5;
        this.Z = 6;
        this.a0 = 7;
        this.c0 = 8;
        this.S = 10;
        this.d0 = 9;
        if (this.x != 0 || this.s >= 0 || (this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z = this.f0 >= 0;
            this.S = 11;
            this.f0 = 10;
            if (!z && (ii1Var = this.O) != null) {
                ii1Var.i(10);
                this.O.g(this.d0);
            }
        } else {
            int i = this.f0;
            this.f0 = -1;
            if (i >= 0 && (ii1Var2 = this.O) != null) {
                ii1Var2.s(i);
                this.O.g(this.d0);
            }
        }
        int i2 = this.S;
        this.e0 = i2;
        this.g0 = i2 + 1;
        this.S = i2 + 3;
        this.h0 = i2 + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[LOOP:1: B:32:0x009a->B:34:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1() {
        SparseIntArray R0;
        int[] iArr;
        int i;
        amb i2;
        View C0;
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (cmb.O0(string) == null || cmb.O0(string).o()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (cmb.O0(string2) == null || !cmb.O0(string2).o()) {
            string2 = "Dark Blue";
        }
        bmb bmbVar = cmb.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (bmbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            bmb O0 = !this.K ? cmb.O0(str2) : cmb.O0(str);
            this.s0.clear();
            String[] strArr = new String[1];
            String str3 = O0.d;
            R0 = str3 == null ? cmb.R0(null, str3, strArr) : cmb.R0(new File(O0.b), null, strArr);
            iArr = cmb.gm;
            if (iArr != null) {
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    this.s0.put(i3, iArr[i3]);
                }
            }
            for (i = 0; i < R0.size(); i++) {
                this.s0.put(R0.keyAt(i), R0.valueAt(i));
            }
            i2 = O0.i(false);
            if (i2 != null) {
                i2.d(R0, this.s0);
            }
            this.z0.setColor(cmb.v0(cmb.c7, this.resourceProvider));
            this.I = cl8.e(this.I, this.currentAccount, this.G, this.K);
            C0 = C0(this.T);
            if (C0 instanceof uob) {
                return;
            }
            ((uob) C0).setOverrideBackground(this.I);
            return;
        }
        str = string;
        if (!this.K) {
        }
        this.s0.clear();
        String[] strArr2 = new String[1];
        String str32 = O0.d;
        if (str32 == null) {
        }
        iArr = cmb.gm;
        if (iArr != null) {
        }
        while (i < R0.size()) {
        }
        i2 = O0.i(false);
        if (i2 != null) {
        }
        this.z0.setColor(cmb.v0(cmb.c7, this.resourceProvider));
        this.I = cl8.e(this.I, this.currentAccount, this.G, this.K);
        C0 = C0(this.T);
        if (C0 instanceof uob) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.b < Z0() || !U0()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        c1();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public boolean onFragmentCreate() {
        getMediaDataController().Z0();
        getNotificationCenter().b(this, nm7.X2);
        getNotificationCenter().b(this, nm7.r3);
        getNotificationCenter().b(this, nm7.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.X2);
        getNotificationCenter().n(this, nm7.r3);
        getNotificationCenter().n(this, nm7.y1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        if (this.d || this.P == null) {
            return;
        }
        int L = gm.L(68.0f) + i4;
        ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.P.setLayoutParams(layoutParams);
        }
        if (this.P.getPaddingLeft() != i || this.P.getPaddingRight() != i3 || this.P.getPaddingBottom() != i4) {
            this.P.setPadding(i, 0, i3, i4);
        }
        eh0.e(this.N, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), gm.L(68.0f));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            z0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        iq5 iq5Var = this.mSystemInsets;
        onInsets(iq5Var.a, iq5Var.b, iq5Var.c, iq5Var.d);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setResourceProvider(ylb ylbVar) {
        this.r0 = ylbVar;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public final void y0() {
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar == null) {
            return;
        }
        aVar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(cmb.z8) : -1);
        this.actionBar.H((!this.d || this.s == -1) ? getThemedColor(cmb.u8) : -1, false);
    }

    public void z0() {
        y0();
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setBackgroundColor(getThemedColor(cmb.r8));
        }
        r59 r59Var = this.N;
        if (r59Var != null && this.d) {
            r59Var.setBackgroundColor(getThemedColor(cmb.Z6));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(cmb.Z6));
        }
    }

    public void a1(int i) {
    }
}
