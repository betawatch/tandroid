package xg;

import ah.g1;
import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import i2.g;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.web.b1;
import ug.t;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class a {
    public static final HashMap Y;
    public StaticLayout A;
    public TextPaint B;
    public TextPaint C;
    public TextPaint D;
    public TextPaint E;
    public TextPaint F;
    public Paint G;
    public TextPaint H;
    public Paint I;
    public Paint J;
    public Paint K;
    public Paint L;
    public RectF M;
    public RectF N;
    public Rect O;
    public Rect P;
    public int[] Q;
    public int R;
    public z S;
    public MessageObject T;
    public boolean U;
    public ImageReceiver[] a;
    public i9[] b;
    public final t1 c;
    public ImageReceiver d;
    public CharSequence[] e;
    public TLRPC.Chat[] f;
    public float[] g;
    public boolean[] h;
    public Rect[] i;
    public boolean[] j;
    public int m;
    public float n;
    public String o;
    public int p;
    public int q;
    public int r;
    public int s;
    public Drawable t;
    public String u;
    public int v;
    public StaticLayout w;
    public StaticLayout x;
    public StaticLayout y;
    public StaticLayout z;
    public int k = 0;
    public int l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        g.q(1, hashMap, "1⃣", 3, "2⃣");
        g.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public a(t1 t1Var) {
        this.c = t1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway()) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.i;
                    if (i10 < rectArr.length) {
                        if (rectArr[i10].contains(x10, y3)) {
                            this.V = i10;
                            this.S.setHotspot(x10, y3);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i10++;
                    } else if (this.P.contains(x10, y3)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    t1 t1Var = this.c;
                    if (t1Var.getDelegate() != null) {
                        t1Var.getDelegate().M(this.V, t1Var);
                    }
                    t1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    MessageObject messageObject2 = this.T;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        t.d(messageObject2, new b1(messageObject2, 10), new j3(6));
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 2 && motionEvent.getAction() == 3) {
                if (this.W) {
                    c(false);
                }
                this.W = false;
                this.X = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i10, int i11, f6 f6Var) {
        float f7;
        boolean[] zArr;
        int color;
        int i12;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.T;
        if (messageObject == null || !messageObject.isGiveaway()) {
            return;
        }
        z zVar = this.S;
        t1 t1Var = this.c;
        int i13 = 0;
        if (zVar == null) {
            int w02 = j6.w0(null, j6.i6, false);
            this.R = w02;
            z Y2 = j6.Y(w02, 12, 12);
            this.S = Y2;
            Y2.setCallback(t1Var);
        }
        this.E.setColor(j6.o2.getColor());
        this.F.setColor(j6.l1(0.45f, j6.o2.getColor()));
        this.G.setColor(j6.l1(0.15f, j6.o2.getColor()));
        this.H.setColor(j6.o2.getColor());
        if (this.T.isOutOwner()) {
            TextPaint textPaint = this.D;
            int i14 = j6.Xa;
            textPaint.setColor(j6.v0(i14, f6Var));
            this.I.setColor(j6.v0(i14, f6Var));
            this.J.setColor(j6.v0(j6.ab, f6Var));
        } else {
            TextPaint textPaint2 = this.D;
            int i15 = j6.Kc;
            textPaint2.setColor(j6.v0(i15, f6Var));
            this.I.setColor(j6.v0(i15, f6Var));
            this.J.setColor(j6.v0(j6.Uc, f6Var));
        }
        if (this.U) {
            this.I.setColor(j6.v0(j6.fk, f6Var));
        }
        canvas2.save();
        int dp = i11 - AndroidUtilities.dp(4.0f);
        canvas2.translate(dp, i10);
        this.P.set(dp, i10, this.l + dp, this.k + i10);
        canvas2.saveLayer(0.0f, 0.0f, this.l, this.k, this.K, 31);
        this.d.draw(canvas2);
        float f10 = this.l / 2.0f;
        float dp2 = AndroidUtilities.dp(106.0f);
        int dp3 = AndroidUtilities.dp(12.0f) + this.O.width();
        int dp4 = AndroidUtilities.dp(10.0f) + this.O.height();
        this.M.set(f10 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f10, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
        canvas2.drawRoundRect(this.M, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.L);
        float f11 = dp3 / 2.0f;
        float f12 = dp4 / 2.0f;
        this.M.set(f10 - f11, dp2 - f12, f10 + f11, dp2 + f12);
        canvas2.drawRoundRect(this.M, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.I);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.M.left), AndroidUtilities.dp(6.96f) + ((int) this.M.centerY()));
            this.t.draw(canvas2);
        }
        canvas2.drawText(this.u, this.M.centerX() + AndroidUtilities.dp(this.U ? 8.0f : 0.0f), this.M.centerY() + AndroidUtilities.dp(4.0f), this.U ? this.C : this.B);
        canvas2.restore();
        canvas2.translate(0.0f, AndroidUtilities.dp(128.0f));
        int dp5 = AndroidUtilities.dp(128.0f) + i10;
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.w.draw(canvas2);
        canvas2.translate(0.0f, this.p);
        if (this.x != null) {
            canvas2.restore();
            canvas2.save();
            float dp6 = (this.p + this.m) - AndroidUtilities.dp(6.0f);
            float f13 = this.l / 2.0f;
            canvas2.drawText(this.o, f13, dp6, this.F);
            f7 = 16.0f;
            canvas2.drawLine(AndroidUtilities.dp(17.0f), dp6 - AndroidUtilities.dp(4.0f), (f13 - (this.n / 2.0f)) - AndroidUtilities.dp(6.0f), dp6 - AndroidUtilities.dp(4.0f), this.G);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(6.0f) + (this.n / 2.0f) + f13, dp6 - AndroidUtilities.dp(4.0f), this.l - AndroidUtilities.dp(16.0f), dp6 - AndroidUtilities.dp(4.0f), this.G);
            canvas2.translate((this.l - this.x.getWidth()) / 2.0f, this.p);
            this.x.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(this.v / 2.0f, this.m + this.p);
        } else {
            f7 = 16.0f;
        }
        this.y.draw(canvas2);
        canvas2.restore();
        canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) + this.q);
        int C = w1.C(6.0f, this.q, dp5);
        int i16 = 0;
        int i17 = 0;
        while (true) {
            boolean[] zArr2 = this.j;
            if (i16 >= zArr2.length) {
                break;
            }
            if (zArr2[i16]) {
                canvas2.save();
                int i18 = i16;
                float f14 = 0.0f;
                do {
                    f14 += this.g[i18] + AndroidUtilities.dp(40.0f);
                    i18++;
                    zArr = this.j;
                    if (i18 >= zArr.length || this.h[i18]) {
                        break;
                    }
                } while (zArr[i18]);
                float f15 = f10 - (f14 / 2.0f);
                canvas2.translate(f15, 0.0f);
                int i19 = ((int) f15) + dp;
                int i20 = i16;
                while (true) {
                    TLRPC.Chat chat = this.f[i20];
                    if (this.T.isOutOwner()) {
                        color = j6.v0(j6.Xa, f6Var);
                    } else {
                        int colorId = ChatObject.getColorId(chat);
                        if (colorId < 7) {
                            color = j6.v0(j6.r8[colorId], f6Var);
                        } else {
                            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                            MessagesController.PeerColor color2 = peerColors == null ? null : peerColors.getColor(colorId);
                            color = color2 != null ? color2.getColor(i13, f6Var) : j6.v0(j6.r8[i13], f6Var);
                        }
                    }
                    int i21 = this.V;
                    i12 = (i21 < 0 || i21 != i20) ? i17 : color;
                    this.D.setColor(color);
                    this.J.setColor(color);
                    this.J.setAlpha(25);
                    this.a[i20].draw(canvas2);
                    CharSequence charSequence = this.e[i20];
                    int i22 = i19;
                    canvas2.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(f7), this.D);
                    this.N.set(0.0f, 0.0f, this.g[i20] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                    canvas2.drawRoundRect(this.N, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.J);
                    float f16 = i22;
                    this.i[i20].set(i22, C, (int) (this.N.width() + f16), AndroidUtilities.dp(24.0f) + C);
                    canvas2.translate(this.N.width() + AndroidUtilities.dp(6.0f), 0.0f);
                    i19 = (int) (this.N.width() + AndroidUtilities.dp(6.0f) + f16);
                    i20++;
                    boolean[] zArr3 = this.j;
                    if (i20 >= zArr3.length || this.h[i20] || !zArr3[i20]) {
                        break;
                    }
                    i17 = i12;
                    i13 = 0;
                }
                canvas2.restore();
                canvas2.translate(0.0f, AndroidUtilities.dp(30.0f));
                C += AndroidUtilities.dp(30.0f);
                i16 = i20;
                i17 = i12;
            } else {
                i16++;
            }
            i13 = 0;
        }
        if (this.A != null) {
            canvas2.save();
            canvas2.translate((this.l - this.A.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f));
            this.A.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, this.s);
        }
        canvas2.translate(0.0f, AndroidUtilities.dp(6.0f));
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.z.draw(canvas2);
        canvas2.restore();
        canvas2.restore();
        if (this.V >= 0) {
            int l1 = j6.l1(j6.I.q() ? 0.12f : 0.1f, i17);
            if (this.R != l1) {
                z zVar2 = this.S;
                this.R = l1;
                j6.B1(zVar2, l1, true);
            }
            this.S.setBounds(this.i[this.V]);
            this.S.setCallback(t1Var);
        }
    }

    public final void c(boolean z10) {
        z zVar;
        MessageObject messageObject = this.T;
        if (messageObject == null || !messageObject.isGiveaway() || (zVar = this.S) == null) {
            return;
        }
        t1 t1Var = this.c;
        if (!z10) {
            zVar.setState(StateSet.NOTHING);
            t1Var.invalidate();
        } else {
            zVar.setCallback(new g1(this, 8));
            this.S.setState(this.Q);
            t1Var.invalidate();
        }
    }

    public final void d(int i10, int i11, MessageObject messageObject) {
        float f7;
        float f10;
        TLRPC.Document document;
        String str;
        this.T = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0.0f;
        if (messageObject.isGiveaway()) {
            this.T = messageObject;
            if (this.B == null) {
                this.B = new TextPaint(1);
                this.C = new TextPaint(1);
                this.D = new TextPaint(1);
                this.E = new TextPaint(1);
                this.F = new TextPaint(1);
                this.G = new Paint(1);
                this.H = new TextPaint(1);
                this.I = new Paint(1);
                this.J = new Paint(1);
                this.K = new Paint();
                this.L = new Paint();
                this.M = new RectF();
                this.N = new RectF();
                this.O = new Rect();
                this.P = new Rect();
                this.Q = new int[]{R.attr.state_enabled, R.attr.state_pressed};
                this.e = new CharSequence[10];
                this.f = new TLRPC.Chat[10];
                this.g = new float[10];
                this.h = new boolean[10];
                this.i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.c);
                this.d = imageReceiver;
                imageReceiver.setAllowLoadingOnAttachedOnly(true);
                Paint paint = this.L;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTypeface(AndroidUtilities.bold());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(AndroidUtilities.dp(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(AndroidUtilities.bold());
                this.C.setTextSize(AndroidUtilities.dp(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(AndroidUtilities.bold());
                this.D.setTextSize(AndroidUtilities.dp(13.0f));
                this.H.setTextSize(AndroidUtilities.dp(13.0f));
                this.E.setTextSize(AndroidUtilities.dp(14.0f));
                this.F.setTextSize(AndroidUtilities.dp(14.0f));
                this.F.setTextAlign(align);
            }
            if (this.a == null) {
                this.a = new ImageReceiver[10];
                this.b = new i9[10];
                this.j = new boolean[10];
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.a;
                    if (i12 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i12] = new ImageReceiver(this.c);
                    this.a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.b[i12] = new i9((f6) null);
                    this.b[i12].u(AndroidUtilities.dp(18.0f));
                    this.i[i12] = new Rect();
                    i12++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            String str2 = UserConfig.getInstance(UserConfig.selectedAccount).premiumGiftsStickerPack;
            if (str2 == null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).checkPremiumGiftStickers();
                f7 = 12.0f;
                f10 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByName(str2);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByEmojiOrName(str2);
                }
                if (stickerSetByName != null) {
                    String str3 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = stickerSetByName.packs;
                    int size = arrayList.size();
                    document = null;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            f7 = 12.0f;
                            f10 = 18.0f;
                            break;
                        }
                        TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i13);
                        i13++;
                        TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                        f7 = 12.0f;
                        if (Objects.equals(tL_stickerPack2.emoticon, str3)) {
                            ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            f10 = 18.0f;
                            while (i14 < size2) {
                                Long l4 = arrayList2.get(i14);
                                i14++;
                                long longValue = l4.longValue();
                                ArrayList<TLRPC.Document> arrayList3 = stickerSetByName.documents;
                                int size3 = arrayList3.size();
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= size3) {
                                        str = str3;
                                        break;
                                    }
                                    TLRPC.Document document2 = arrayList3.get(i15);
                                    i15++;
                                    TLRPC.Document document3 = document2;
                                    ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                    str = str3;
                                    if (document3.id == longValue) {
                                        document = document3;
                                        break;
                                    } else {
                                        str3 = str;
                                        arrayList3 = arrayList4;
                                    }
                                }
                                if (document != null) {
                                    break;
                                } else {
                                    str3 = str;
                                }
                            }
                            str = str3;
                        } else {
                            str = str3;
                            f10 = 18.0f;
                        }
                        if (document != null) {
                            break;
                        } else {
                            str3 = str;
                        }
                    }
                    if (document == null && !stickerSetByName.documents.isEmpty()) {
                        document = stickerSetByName.documents.get(0);
                    }
                } else {
                    f7 = 12.0f;
                    f10 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, j6.c7, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    this.d.setImage(ImageLocation.getForDocument(document), "160_160_firstframe", svgThumb, "tgs", stickerSetByName, 1);
                } else {
                    MediaDataController.getInstance(UserConfig.selectedAccount).loadStickersByEmojiOrName(str2, false, stickerSetByName == null);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            this.U = (tL_messageMediaGiveaway2.flags & 32) != 0;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.b = (i9[]) Arrays.copyOf(this.b, size4);
                this.j = Arrays.copyOf(this.j, size4);
                this.e = (CharSequence[]) Arrays.copyOf(this.e, size4);
                this.g = Arrays.copyOf(this.g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.i = (Rect[]) Arrays.copyOf(this.i, size4);
                this.f = (TLRPC.Chat[]) Arrays.copyOf(this.f, size4);
                for (int i16 = length - 1; i16 < size4; i16++) {
                    this.a[i16] = new ImageReceiver(this.c);
                    this.a[i16].setAllowLoadingOnAttachedOnly(true);
                    this.a[i16].setRoundRadius(AndroidUtilities.dp(f7));
                    this.b[i16] = new i9((f6) null);
                    this.b[i16].u(AndroidUtilities.dp(f10));
                    this.i[i16] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(148.0f);
            int minTabletSide = AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(80.0f) : i10 - AndroidUtilities.dp(80.0f);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            boolean isForwarded = messageObject.isForwarded();
            TLRPC.Message message = messageObject.messageOwner;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-MessageObject.getPeerId(isForwarded ? message.fwd_from.from_id : message.peer_id))));
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveawayPrizes));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayMsgInfoPlural2", tL_messageMediaGiveaway2.quantity, new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgInfoPlural2", tL_messageMediaGiveaway2.quantity, LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway2.months, new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayMsgParticipants", org.telegram.messenger.R.string.BoostingGiveawayMsgParticipants));
            spannableStringBuilder3.append((CharSequence) replaceTags2);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, replaceTags2.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingGiveawayMsgNewSubsPlural" : "BoostingGiveawayMsgNewSubsGroupPlural", tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            } else {
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingGiveawayMsgAllSubsPlural" : "BoostingGiveawayMsgAllSubsGroupPlural", tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            }
            SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingWinnersDate", org.telegram.messenger.R.string.BoostingWinnersDate));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceTags3);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags3.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = LocaleController.getInstance().getFormatterGiveawayCard().format(date);
            String format2 = LocaleController.getInstance().getFormatterDay().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) LocaleController.formatString("formatDateAtTime", org.telegram.messenger.R.string.formatDateAtTime, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float dp2 = AndroidUtilities.dp(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.w = iw0.c(spannableStringBuilder, textPaint2, minTabletSide, alignment, dp2, false, truncateAt, minTabletSide, 10, true);
            this.y = iw0.c(spannableStringBuilder3, this.E, minTabletSide, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, minTabletSide, 10, true);
            this.z = iw0.c(spannableStringBuilder4, this.E, minTabletSide, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, minTabletSide, 10, true);
            int i17 = 0;
            for (int i18 = 0; i18 < this.w.getLineCount(); i18++) {
                i17 = (int) Math.max(i17, Math.ceil(this.w.getLineWidth(i18)));
            }
            for (int i19 = 0; i19 < this.y.getLineCount(); i19++) {
                i17 = (int) Math.max(i17, Math.ceil(this.y.getLineWidth(i19)));
            }
            for (int i20 = 0; i20 < this.z.getLineCount(); i20++) {
                i17 = (int) Math.max(i17, Math.ceil(this.z.getLineWidth(i20)));
            }
            if (i17 < AndroidUtilities.dp(180.0f)) {
                i17 = AndroidUtilities.dp(180.0f);
            }
            int i21 = i17;
            String str4 = tL_messageMediaGiveaway2.prize_description;
            if (str4 != null && !str4.isEmpty()) {
                StaticLayout c10 = iw0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.quantity, tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false), this.E, i21, Layout.Alignment.ALIGN_CENTER, AndroidUtilities.dp(2.0f), false, TextUtils.TruncateAt.END, i21, 20, true);
                this.x = c10;
                this.m = AndroidUtilities.dp(22.0f) + c10.getLineBottom(c10.getLineCount() - 1);
                String string = LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveawayMsgWithDivider);
                this.o = string;
                this.n = this.F.measureText(string, 0, string.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i22 = 0;
                while (i22 < size5) {
                    String str5 = arrayList6.get(i22);
                    i22++;
                    String str6 = str5;
                    String displayCountry = new Locale("", str6).getDisplayCountry(Locale.getDefault());
                    String languageFlag = LocaleController.getLanguageFlag(str6);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (languageFlag != null) {
                        spannableStringBuilder5.append((CharSequence) languageFlag).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = iw0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveAwayFromCountries", org.telegram.messenger.R.string.BoostingGiveAwayFromCountries, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false), this.H, i21, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i21, 10, true);
                }
            }
            int max = Math.max(i11, Math.min(AndroidUtilities.dp(38.0f) + i21, minTabletSide));
            this.v = max - minTabletSide;
            float f11 = max;
            float f12 = dp;
            float f13 = f12 / 2.0f;
            this.d.setImageCoords((f11 / 2.0f) - f13, AndroidUtilities.dp(42.0f) - f13, f12, f12);
            int dp3 = AndroidUtilities.dp(5.0f) + this.w.getLineBottom(r1.getLineCount() - 1);
            this.p = dp3;
            this.q = this.y.getLineBottom(r1.getLineCount() - 1) + dp3 + this.m;
            this.r = this.z.getLineBottom(r1.getLineCount() - 1);
            StaticLayout staticLayout = this.A;
            int lineBottom = staticLayout != null ? staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + AndroidUtilities.dp(f7) : 0;
            this.s = lineBottom;
            int i23 = this.k + this.q + lineBottom + this.r;
            this.k = i23;
            this.k = AndroidUtilities.dp(128.0f) + i23;
            this.l = max;
            if (this.U) {
                if (this.t == null) {
                    this.t = ApplicationLoader.applicationContext.getResources().getDrawable(org.telegram.messenger.R.drawable.filled_giveaway_stars).mutate();
                }
                this.u = LocaleController.formatNumber((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.t = null;
                this.u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str7 = this.u;
            textPaint3.getTextBounds(str7, 0, str7.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.j, false);
            this.k = AndroidUtilities.dp(30.0f) + this.k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i24 = 0;
            while (i24 < size6) {
                Long l10 = arrayList8.get(i24);
                i24++;
                Long l11 = l10;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getChat(l11) != null) {
                    arrayList7.add(l11);
                }
            }
            float f14 = 0.0f;
            for (int i25 = 0; i25 < arrayList7.size(); i25++) {
                Long l12 = (Long) arrayList7.get(i25);
                long longValue2 = l12.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(l12);
                if (chat != null) {
                    this.j[i25] = true;
                    this.f[i25] = chat;
                    this.e[i25] = TextUtils.ellipsize(Emoji.replaceEmoji(chat.title, this.D.getFontMetricsInt(), false), this.D, 0.8f * f11, TextUtils.TruncateAt.END);
                    float[] fArr = this.g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.e[i25];
                    fArr[i25] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.g[i25] + AndroidUtilities.dp(40.0f);
                    f14 += dp4;
                    if (i25 > 0) {
                        boolean[] zArr = this.h;
                        boolean z10 = f14 > 0.9f * f11;
                        zArr[i25] = z10;
                        if (z10) {
                            this.k = AndroidUtilities.dp(30.0f) + this.k;
                            f14 = dp4;
                        }
                    } else {
                        this.h[i25] = false;
                    }
                    this.b[i25].q(chat);
                    this.a[i25].setForUserOrChat(chat, this.b[i25]);
                    this.a[i25].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    this.f[i25] = null;
                    this.j[i25] = false;
                    this.e[i25] = "";
                    this.h[i25] = false;
                    this.g[i25] = AndroidUtilities.dp(20.0f);
                    this.b[i25].n(longValue2, "", "");
                }
            }
        }
    }
}
