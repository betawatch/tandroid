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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class wh1 extends e implements fn7 {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public b29 L;
    public s7 M;
    public d79 N;
    public jh1 O;
    public FrameLayout P;
    public c51 Q;
    public fh1 R;
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
    public e m0;
    public long n;
    public gh1 n0;
    public float o0;
    public ValueAnimator p0;
    public boolean q0;
    public int r;
    public vnb r0;
    public int s;
    public final SparseIntArray s0;
    public final t37 t0;
    public final t37 u0;
    public final t37 v0;
    public long w;
    public final t37 w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Drawable y0;
    public final Paint z0;

    public wh1(long j) {
        super(null);
        boolean o = aob.I.o();
        this.K = o;
        this.S = 0;
        this.q0 = o;
        this.s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(aob.v0(aob.d7, this.resourceProvider));
        this.x0 = a.b.getDrawable(R.drawable.msg_check_s).mutate();
        this.y0 = a.b.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
        if (M0 != null) {
            this.b = M0.level;
        }
        uc7.s1(this.currentAccount).G0().a(j, new y0(this, M0, (byte) 14));
        this.resourceProvider = new vh1(this);
        this.t0 = new t37(0, false, false, this.resourceProvider);
        this.u0 = new t37(0, false, true, this.resourceProvider);
        this.v0 = new t37(0, true, false, this.resourceProvider);
        this.w0 = new t37(0, true, true, this.resourceProvider);
    }

    public static void f1(View view) {
        if (view instanceof kh1) {
            ((kh1) view).updateColors();
            return;
        }
        if (view instanceof skb) {
            ((skb) view).updateColors();
        } else if (view instanceof nh1) {
            ((nh1) view).updateColors();
        } else if (view instanceof uh1) {
            ((uh1) view).updateColors();
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
            getMessagesController().G0().b(j2, this.c, new ah1(this, b4));
            return;
        }
        int[] iArr = {0};
        final ku0 ku0Var = new ku0((Object) this, (Object) new boolean[]{false}, (Object) new int[]{0}, (Object) iArr, (byte) 2);
        long j3 = -j2;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (M0 == null) {
            cc4.d("channel is null in ChannelColorAcitivity");
            bs2.v(null, 2131743534, d31.b0(this), R.raw.error, 36);
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
                    tL_channels_updateColor.channel = getMessagesController().h1(j3);
                    tL_channels_updateColor.for_profile = z;
                    peerColor = M0.profile_color;
                    if (peerColor == null) {
                        peerColor = new TLRPC.TL_peerColor();
                        M0.profile_color = peerColor;
                        M0.flags2 |= 256;
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
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: yg1
                        public final /* synthetic */ wh1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b6 = b5;
                            ku0 ku0Var2 = ku0Var;
                            wh1 wh1Var = this.b;
                            switch (b6) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                            }
                        }
                    });
                }
                if (!af2.t(this.F, this.G)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    tL_messages_setChatWallPaper.peer = getMessagesController().j1(j2);
                    TLRPC.WallPaper wallPaper = this.G;
                    if (wallPaper != null) {
                        boolean isEmpty = TextUtils.isEmpty(af2.h(wallPaper));
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
                            tL_wallPaperSettings.emoticon = af2.h(this.G);
                        }
                    }
                    iArr[b3] = iArr[b3] + 1;
                    final byte b6 = b3;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: yg1
                        public final /* synthetic */ wh1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b62 = b6;
                            ku0 ku0Var2 = ku0Var;
                            wh1 wh1Var = this.b;
                            switch (b62) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull N0 = getMessagesController().N0(j3);
                    af2.e(this.currentAccount).p(j2, this.G);
                    if (N0 != null) {
                        TLRPC.WallPaper wallPaper4 = this.G;
                        int i5 = N0.flags2;
                        if (wallPaper4 == null) {
                            N0.flags2 = i5 & (-129);
                            N0.wallpaper = null;
                        } else {
                            N0.flags2 = i5 | 128;
                            N0.wallpaper = wallPaper4;
                        }
                        getMessagesController().b4(N0);
                        jn7 notificationCenter = getNotificationCenter();
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.k(jn7.T, N0, 0, bool, bool);
                    }
                }
                if (wf3.a(this.y, this.E)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().h1(j3);
                    TLRPC.EmojiStatus emojiStatus = this.E;
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
                        M0.emoji_status = this.E;
                        M0.flags |= 512;
                    } else {
                        tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                        M0.emoji_status = emojiStatus;
                        M0.flags |= 512;
                    }
                    getMessagesController().x5(j2, this.E);
                    r13 = 0;
                    final byte b7 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: yg1
                        public final /* synthetic */ wh1 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b62 = b7;
                            ku0 ku0Var2 = ku0Var;
                            wh1 wh1Var = this.b;
                            switch (b62) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                                    } else {
                                        wh1Var.getClass();
                                    }
                                    ku0Var2.a(tL_error);
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
                getMessagesController().a4(M0, r13);
                jn7 notificationCenter2 = getNotificationCenter();
                int i6 = uc7.s5;
                Object[] objArr = new Object[1];
                objArr[r13] = Integer.valueOf(TLObject.FLAG_19);
                notificationCenter2.k(2, objArr);
                return;
            }
        } else {
            b = 3;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().h1(j3);
        tL_channels_updateColor2.for_profile = false;
        TLRPC.PeerColor peerColor2 = M0.color;
        if (peerColor2 == null) {
            peerColor2 = new TLRPC.TL_peerColor();
            M0.color = peerColor2;
            M0.flags2 |= 128;
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
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: yg1
            public final /* synthetic */ wh1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                byte b62 = b8;
                ku0 ku0Var2 = ku0Var;
                wh1 wh1Var = this.b;
                switch (b62) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                        } else {
                            wh1Var.getClass();
                        }
                        ku0Var2.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                        } else {
                            wh1Var.getClass();
                        }
                        ku0Var2.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                        } else {
                            wh1Var.getClass();
                        }
                        ku0Var2.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                        } else {
                            wh1Var.getClass();
                        }
                        ku0Var2.a(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor3.channel = getMessagesController().h1(j3);
        tL_channels_updateColor3.for_profile = z;
        peerColor = M0.profile_color;
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
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: yg1
            public final /* synthetic */ wh1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                byte b62 = b52;
                ku0 ku0Var2 = ku0Var;
                wh1 wh1Var = this.b;
                switch (b62) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                        } else {
                            wh1Var.getClass();
                        }
                        ku0Var2.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                        } else {
                            wh1Var.getClass();
                        }
                        ku0Var2.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                        } else {
                            wh1Var.getClass();
                        }
                        ku0Var2.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            wh1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                        } else {
                            wh1Var.getClass();
                        }
                        ku0Var2.a(tL_error);
                        break;
                }
            }
        });
        if (!af2.t(this.F, this.G)) {
        }
        if (wf3.a(this.y, this.E)) {
        }
        if (iArr[r13] != 0) {
        }
    }

    public void B0() {
        d79 d79Var = new d79(getParentActivity(), this.resourceProvider);
        this.N = d79Var;
        d79Var.setSections(false);
    }

    public final View C0(int i) {
        for (int i2 = 0; i2 < this.N.getChildCount(); i2++) {
            View childAt = this.N.getChildAt(i2);
            this.N.getClass();
            if (RecyclerView.S(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    public int D0() {
        return getMessagesController().l4.o2.f();
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
        return 2131752384;
    }

    public int J0() {
        return getMessagesController().l4.f2.f();
    }

    public int K0() {
        return 2131752385;
    }

    public int L0() {
        return 0;
    }

    public int M0() {
        return 3;
    }

    public int N0() {
        return getMessagesController().l4.e2.f();
    }

    public int O0() {
        return 2131752290;
    }

    public int P0() {
        return 0;
    }

    public int Q0() {
        return 0;
    }

    public int R0() {
        return 2131752228;
    }

    public int S0() {
        return getMessagesController().l4.n2.f();
    }

    public int T0() {
        return 2131752229;
    }

    public final boolean U0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && wf3.a(this.y, this.E) && af2.t(this.F, this.G)) ? false : true;
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
        if (!(view instanceof kh1)) {
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
                vnb vnbVar = this.resourceProvider;
                ah1 ah1Var = new ah1(this, b);
                wz4 wz4Var = new wz4(this);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
                int i2 = oe2.f2;
                n12 n12Var = new n12(parentActivity, this, false, false, false, vnbVar);
                n12Var.n = true;
                n12Var.w1(ob6.M0(2131752104, null));
                n12Var.W3 = new fe2(n12Var, tL_premium_boostsStatus, vnbVar, wz4Var, this.a, ah1Var, this);
                n12Var.u1(1, false);
                n12Var.a1();
                n12Var.d2.g0();
                n12Var.show();
                return;
            }
            return;
        }
        int i3 = this.k0;
        long j2 = this.a;
        if (i == i3) {
            if (chatFull != null) {
                nd5 nd5Var = new nd5(-j2);
                nd5Var.i0(chatFull);
                presentFragment(nd5Var);
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
                    nd5 nd5Var2 = new nd5(-j2, 0);
                    nd5Var2.i0(chatFull);
                    presentFragment(nd5Var2);
                    return;
                }
                kh1 kh1Var = (kh1) view;
                boolean z = i == this.g0;
                zg1 zg1Var = new zg1(this, i, view);
                int v0 = this.E instanceof TLRPC.TL_emojiStatusCollectible ? aob.v0(aob.v6, this.resourceProvider) : kh1Var.f;
                if (this.R == null) {
                    ul ulVar = kh1Var.c;
                    d1a[] d1aVarArr = new d1a[1];
                    boolean z2 = ((float) (kh1Var.getHeight() + kh1Var.getTop())) > ((float) this.N.getMeasuredHeight()) / 2.0f;
                    float L = hl.L(330.0f);
                    Point point = hl.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(hl.L(324.0f), point.x * 0.95f);
                    Drawable[] drawableArr = ulVar.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        if (drawable instanceof wl) {
                            ((wl) drawable).n(ulVar);
                        }
                        drawableArr[1] = null;
                    }
                    ulVar.f();
                    kh1Var.f();
                    Rect rect = hl.Q;
                    rect.set(ulVar.getBounds());
                    int L2 = z2 ? (hl.L(12.0f) + (-rect.centerY())) - min : (-(kh1Var.getHeight() - rect.centerY())) - hl.L(16.0f);
                    eh1 eh1Var = new eh1(this, this, getParentActivity(), Integer.valueOf(rect.centerX() - (point.x - min2)), z ? z2 ? 10 : 9 : z2 ? 5 : 7, getResourceProvider(), z2 ? 24 : 16, v0, zg1Var, d1aVarArr);
                    eh1Var.h1 = true;
                    eh1Var.setSelected(j == 0 ? null : Long.valueOf(j));
                    eh1Var.setSaveState(3);
                    eh1Var.y(ulVar, kh1Var);
                    fh1 fh1Var = new fh1(this, eh1Var);
                    this.R = fh1Var;
                    d1aVarArr[0] = fh1Var;
                    fh1Var.showAsDropDown(kh1Var, 0, L2, 53);
                    d1aVarArr[0].a();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = this.E;
            f = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : wf3.f(emojiStatus);
        }
        j = f;
        if (i != this.i0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(wg1 wg1Var) {
        int i;
        int i2;
        int i3;
        if (this.e != this.f) {
            lc7 lc7Var = getMessagesController().F3;
            kc7 d = lc7Var == null ? null : lc7Var.d(this.f);
            if (d != null && d.l(this.d) > this.b) {
                i = d.l(this.d);
                if (this.r != this.s) {
                    lc7 lc7Var2 = getMessagesController().G3;
                    kc7 d2 = lc7Var2 != null ? lc7Var2.d(this.s) : null;
                    if (d2 != null && d2.l(this.d) > this.b) {
                        i = d2.l(this.d);
                        i2 = 24;
                        int i4 = i;
                        if (this.h != this.n && getMessagesController().l4.d2.f() > this.b) {
                            i2 = 27;
                        }
                        if (this.w != this.x && N0() > this.b) {
                            i2 = 28;
                        }
                        if (!wf3.a(this.y, this.E) && J0() > this.b) {
                            i2 = !(this.E instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        byte b = 23;
                        if (!af2.t(this.F, this.G)) {
                            if (TextUtils.isEmpty(af2.h(this.G))) {
                                i3 = 23;
                                if (getParentActivity() != null || getParentActivity() == null) {
                                    return;
                                }
                                dh1 dh1Var = new dh1(this, getParentActivity(), i3, this.currentAccount, getResourceProvider(), i4);
                                dh1Var.s1(wg1Var);
                                dh1Var.r1(this.c, true);
                                long j = this.a;
                                dh1Var.t1(j);
                                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
                                if (M0 != null) {
                                    dh1Var.L2 = new z21(this, M0, b);
                                }
                                showDialog(dh1Var);
                                this.Q.setLoading(false);
                                return;
                            }
                            i2 = 22;
                        }
                        i3 = i2;
                        if (getParentActivity() != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                i2 = 20;
                int i42 = i;
                if (this.h != this.n) {
                    i2 = 27;
                }
                if (this.w != this.x) {
                    i2 = 28;
                }
                if (!wf3.a(this.y, this.E)) {
                    if (!(this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                byte b2 = 23;
                if (!af2.t(this.F, this.G)) {
                }
                i3 = i2;
                if (getParentActivity() != null) {
                }
            }
        }
        i = 0;
        if (this.r != this.s) {
        }
        i2 = 20;
        int i422 = i;
        if (this.h != this.n) {
        }
        if (this.w != this.x) {
        }
        if (!wf3.a(this.y, this.E)) {
        }
        byte b22 = 23;
        if (!af2.t(this.F, this.G)) {
        }
        i3 = i2;
        if (getParentActivity() != null) {
        }
    }

    public final void Y0() {
        vnb vnbVar = this.resourceProvider;
        if (vnbVar instanceof vh1) {
            wh1 wh1Var = ((vh1) vnbVar).a;
            wh1Var.K = !wh1Var.K;
            wh1Var.k1();
            wh1Var.g1(false);
        } else {
            this.K = !this.K;
            k1();
        }
        b1(this.K, true);
        g1(false);
        aob.Em++;
    }

    public final int Z0() {
        int i = 0;
        if (this.e != this.f) {
            lc7 lc7Var = getMessagesController().F3;
            kc7 d = lc7Var == null ? null : lc7Var.d(this.f);
            if (d != null) {
                i = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i = Math.max(i, getMessagesController().l4.d2.f());
        }
        if (this.r != this.s) {
            lc7 lc7Var2 = getMessagesController().G3;
            kc7 d2 = lc7Var2 != null ? lc7Var2.d(this.s) : null;
            if (d2 != null) {
                i = Math.max(i, d2.l(this.d));
            }
        }
        if (this.w != this.x) {
            i = Math.max(i, N0());
        }
        if (!wf3.a(this.y, this.E)) {
            i = Math.max(i, J0());
        }
        return !af2.t(this.F, this.G) ? Math.max(i, S0()) : i;
    }

    public final void b1(boolean z, boolean z2) {
        if (this.q0 != z) {
            this.q0 = z;
            if (z2) {
                b29 b29Var = this.L;
                b29Var.K(z ? b29Var.e[0] : 0);
                b29 b29Var2 = this.L;
                if (b29Var2 != null) {
                    b29Var2.start();
                    return;
                }
                return;
            }
            int i = z ? this.L.e[0] - 1 : 0;
            this.L.I(i, false, true);
            this.L.K(i);
            s7 s7Var = this.M;
            if (s7Var != null) {
                s7Var.invalidate();
            }
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        final byte b = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = ob6.M0(2131752400, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752399, null);
        alertDialog$Builder.g(ob6.M0(2131751334, null), new fd(this) { // from class: ch1
            public final /* synthetic */ wh1 b;

            {
                this.b = this;
            }

            @Override // fd
            public final void w(id idVar2, int i) {
                byte b2 = b;
                wh1 wh1Var = this.b;
                switch (b2) {
                    case 0:
                        wh1Var.finishFragment();
                        break;
                    default:
                        wh1Var.A0();
                        break;
                }
            }
        });
        final byte b2 = 1;
        alertDialog$Builder.j(ob6.M0(2131754209, null), new fd(this) { // from class: ch1
            public final /* synthetic */ wh1 b;

            {
                this.b = this;
            }

            @Override // fd
            public final void w(id idVar2, int i) {
                byte b22 = b2;
                wh1 wh1Var = this.b;
                switch (b22) {
                    case 0:
                        wh1Var.finishFragment();
                        break;
                    default:
                        wh1Var.A0();
                        break;
                }
            }
        });
        showDialog(idVar);
        yob.X((TextView) idVar.c(-2), aob.q7, getResourceProvider());
    }

    @Override // org.telegram.ui.ActionBar.e
    public View createView(Context context) {
        s7 d;
        uc7 messagesController = getMessagesController();
        long j = -this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        if (M0 != null) {
            int F = xc2.F(M0);
            this.f = F;
            this.e = F;
            long G = xc2.G(M0);
            this.n = G;
            this.h = G;
            int I = xc2.I(M0);
            this.s = I;
            this.r = I;
            long J = xc2.J(M0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
            this.E = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(j);
        if (N0 != null) {
            TLRPC.WallPaper wallPaper = N0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String h = af2.h(wallPaper);
            if (h != null && h.length() == 0) {
                this.H = this.F;
            }
        }
        s8 s8Var = new s8(this, (byte) 21);
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setTitle(ob6.M0(2131752401, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(s8Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(ob6.M0(2131752401, null));
            this.actionBar.setActionBarMenuOnItemClick(s8Var);
        }
        b29 b29Var = new b29(R.raw.sun_outline, hl.L(28.0f), hl.L(28.0f), true, null);
        this.L = b29Var;
        b29Var.h = true;
        if (this.K) {
            b29Var.H(35);
            this.L.K(36);
        } else {
            b29Var.K(0);
            this.L.H(0);
        }
        this.L.a0 = true;
        int v0 = aob.v0(aob.J9, this.resourceProvider);
        this.L.L(v0, "Sunny");
        this.L.L(v0, "Path 6");
        this.L.L(v0, "Path");
        this.L.L(v0, "Path 5");
        jla jlaVar2 = this.simpleActionBar;
        if (jlaVar2 != null) {
            rla v = jlaVar2.v();
            b29 b29Var2 = this.L;
            v.getClass();
            d = v.b(1, 0, null, b29Var2, hl.L(48.0f), null);
        } else {
            d = this.actionBar.u().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        B0();
        if (this.d) {
            this.N.setBackgroundColor(getThemedColor(aob.a7));
        } else {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        }
        d79 d79Var = this.N;
        jh1 jh1Var = new jh1(this);
        this.O = jh1Var;
        d79Var.setAdapter(jh1Var);
        new u55(3);
        this.N.setLayoutManager(new x46());
        frameLayout.addView(this.N, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 0.0f, this.d ? 68.0f : 0.0f));
        this.N.setOnItemClickListener(new l0(this, N0, (byte) 5));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.N.setItemAnimator(zb3Var);
        c51 c51Var = new c51(this.resourceProvider, context, true);
        c51Var.setRoundRadius(24);
        this.Q = c51Var;
        c51Var.i(ob6.M0(2131754211, null), false, true);
        this.Q.setOnClickListener(new r81(this, (byte) 7));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            yob.h(aob.a7, getResourceProvider(), frameLayout2);
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, tre.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, tre.e(-1, 68, 80));
        setBulletinDelegate(new t10(this, (byte) 4));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i = tL_premium_boostsStatus.level;
            this.b = i;
            if (M0 != null) {
                M0.level = i;
            }
            jh1 jh1Var = this.O;
            if (jh1Var != null) {
                jh1Var.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.r3;
        byte b = 2;
        long j = this.a;
        if (i == i3) {
            if (j == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i == jn7.X2) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().G0().a(j, new ah1(this, b));
        } else if (i == jn7.y1 && j == ((Long) objArr[0]).longValue()) {
            wk5 wk5Var = this.parentLayout;
            if (wk5Var == null || wk5Var.getLastFragment() != this) {
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
            wm2 wm2Var = new wm2(R.drawable.mini_switch_lock, 0);
            wm2Var.n = 1;
            this.J.setSpan(wm2Var, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) ob6.G(Z0, "BoostLevelRequired", new Object[0]));
        this.Q.g(spannableStringBuilder, z);
    }

    public void g1(boolean z) {
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.updateColors();
        } else {
            this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(aob.A8) : -1);
            this.actionBar.H((!this.d || this.s == -1) ? getThemedColor(aob.v8) : -1, false);
            this.actionBar.G(getThemedColor(aob.t8), false);
        }
        if (z) {
            return;
        }
        this.O.f();
        hl.d0(this.N, new bm0(this));
        if (this.d) {
            this.P.setBackgroundColor(getThemedColor(aob.a7));
        }
        this.Q.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        if (this.d) {
            return null;
        }
        return this.N;
    }

    public final void h1(boolean z) {
        r47 messageObject;
        View C0 = C0(this.T);
        View C02 = C0(this.U ? 1 : 0);
        View C03 = C0(this.V);
        View C04 = C0(this.X);
        if (C0 instanceof sqb) {
            sqb sqbVar = (sqb) C0;
            wb2[] cells = sqbVar.getCells();
            for (int i = 0; i < cells.length; i++) {
                wb2 wb2Var = cells[i];
                if (wb2Var != null && (messageObject = wb2Var.getMessageObject()) != null) {
                    messageObject.e1 = this.f;
                    messageObject.f1 = this.n;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
            Drawable e = mm8.e(this.I, this.currentAccount, this.G, this.K);
            this.I = e;
            sqbVar.setOverrideBackground(e);
        }
        if (C02 instanceof d48) {
            ((d48) C02).a(this.f, z);
        } else if (C02 instanceof nh1) {
            ((nh1) C02).a(this.f, z);
        }
        if (C03 instanceof kh1) {
            kh1 kh1Var = (kh1) C03;
            kh1Var.a(this.currentAccount, this.f, true);
            kh1Var.c(this.n, false, z);
        }
        if (C04 instanceof uh1) {
            uh1 uh1Var = (uh1) C04;
            String h = af2.h(this.G);
            if (h == null && this.G == null && this.H != null) {
                h = "❌";
            }
            uh1Var.a(h, z);
            uh1Var.setGalleryWallpaper(this.H);
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
        if (C0 instanceof ph1) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ph1 ph1Var = (ph1) C0;
                oh1 oh1Var = ph1Var.b;
                kc7 a = kc7.a(emojiStatus);
                oh1Var.c(a, true);
                ph1Var.a.c(a, true);
                oh1Var.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                ph1 ph1Var2 = (ph1) C0;
                oh1 oh1Var2 = ph1Var2.b;
                int i = this.s;
                oh1Var2.b(i, true);
                ph1Var2.a.b(ph1Var2.h.currentAccount, i, true);
                oh1Var2.d(this.x, false, true);
            }
            ph1 ph1Var3 = (ph1) C0;
            oh1 oh1Var3 = ph1Var3.b;
            oh1Var3.e(wf3.f(this.E), false, true);
            oh1Var3.a(this.f);
            ph1Var3.updateColors();
        }
        if (C02 instanceof d48) {
            ((d48) C02).a(this.s, true);
        } else if (C02 instanceof nh1) {
            ((nh1) C02).a(this.f, true);
        }
        if (C03 instanceof kh1) {
            kh1 kh1Var = (kh1) C03;
            kh1Var.a(this.currentAccount, this.s, false);
            kh1Var.c(this.x, false, true);
        }
        if (C04 instanceof kh1) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((kh1) C04).b(kc7.a(emojiStatus2));
            } else {
                ((kh1) C04).a(this.currentAccount, this.s, false);
            }
            ((kh1) C04).c(wf3.f(this.E), wf3.A(this.E), true);
        }
        boolean z = C05 instanceof kh1;
        long j = this.a;
        if (z) {
            kh1 kh1Var2 = (kh1) C05;
            kh1Var2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull N0 = getMessagesController().N0(-j);
            if (N0 == null || (stickerSet2 = N0.emojiset) == null) {
                kh1Var2.c(0L, false, false);
            } else {
                kh1Var2.c(H0(stickerSet2), false, false);
            }
        }
        if (C06 instanceof kh1) {
            TLRPC.ChatFull N02 = getMessagesController().N0(-j);
            if (N02 == null || (stickerSet = N02.stickerset) == null) {
                ((kh1) C06).c(0L, false, false);
            } else {
                ((kh1) C06).d(G0(stickerSet));
            }
        }
        j1();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !U0() || this.b < Z0();
    }

    public void j1() {
        jh1 jh1Var;
        jh1 jh1Var2;
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
            if (!z && (jh1Var = this.O) != null) {
                jh1Var.i(10);
                this.O.g(this.d0);
            }
        } else {
            int i = this.f0;
            this.f0 = -1;
            if (i >= 0 && (jh1Var2 = this.O) != null) {
                jh1Var2.s(i);
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
        ynb i2;
        View C0;
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (aob.O0(string) == null || aob.O0(string).o()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (aob.O0(string2) == null || !aob.O0(string2).o()) {
            string2 = "Dark Blue";
        }
        znb znbVar = aob.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (znbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            znb O0 = !this.K ? aob.O0(str2) : aob.O0(str);
            this.s0.clear();
            String[] strArr = new String[1];
            String str3 = O0.d;
            R0 = str3 == null ? aob.R0(null, str3, strArr) : aob.R0(new File(O0.b), null, strArr);
            iArr = aob.hm;
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
            this.z0.setColor(aob.v0(aob.d7, this.resourceProvider));
            this.I = mm8.e(this.I, this.currentAccount, this.G, this.K);
            C0 = C0(this.T);
            if (C0 instanceof sqb) {
                return;
            }
            ((sqb) C0).setOverrideBackground(this.I);
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
        iArr = aob.hm;
        if (iArr != null) {
        }
        while (i < R0.size()) {
        }
        i2 = O0.i(false);
        if (i2 != null) {
        }
        this.z0.setColor(aob.v0(aob.d7, this.resourceProvider));
        this.I = mm8.e(this.I, this.currentAccount, this.G, this.K);
        C0 = C0(this.T);
        if (C0 instanceof sqb) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e
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

    @Override // org.telegram.ui.ActionBar.e
    public boolean onFragmentCreate() {
        getMediaDataController().Z0();
        getNotificationCenter().b(this, jn7.X2);
        getNotificationCenter().b(this, jn7.r3);
        getNotificationCenter().b(this, jn7.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.X2);
        getNotificationCenter().n(this, jn7.r3);
        getNotificationCenter().n(this, jn7.y1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        if (this.d || this.P == null) {
            return;
        }
        int L = hl.L(68.0f) + i4;
        ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.P.setLayoutParams(layoutParams);
        }
        if (this.P.getPaddingLeft() != i || this.P.getPaddingRight() != i3 || this.P.getPaddingBottom() != i4) {
            this.P.setPadding(i, 0, i3, i4);
        }
        eg0.g(this.N, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), hl.L(68.0f));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            z0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        mq5 mq5Var = this.mSystemInsets;
        onInsets(mq5Var.a, mq5Var.b, mq5Var.c, mq5Var.d);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void setResourceProvider(vnb vnbVar) {
        this.r0 = vnbVar;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public final void y0() {
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar == null) {
            return;
        }
        aVar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(aob.A8) : -1);
        this.actionBar.H((!this.d || this.s == -1) ? getThemedColor(aob.v8) : -1, false);
    }

    public void z0() {
        y0();
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setBackgroundColor(getThemedColor(aob.s8));
        }
        d79 d79Var = this.N;
        if (d79Var != null && this.d) {
            d79Var.setBackgroundColor(getThemedColor(aob.a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(aob.a7));
        }
    }

    public void a1(int i) {
    }
}
