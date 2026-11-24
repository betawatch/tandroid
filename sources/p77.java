// default package

import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p77 implements RequestDelegate {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ p77(na7 na7Var, long j, String str, Runnable runnable, d dVar, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.b = na7Var;
        this.d = j;
        this.c = str;
        this.e = runnable;
        this.g = dVar;
        this.h = tL_channels_updateUsername;
        this.f = runnable2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        String str;
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                na7 na7Var = (na7) obj5;
                Runnable runnable = (Runnable) obj4;
                d dVar = (d) obj2;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) obj;
                Runnable runnable2 = (Runnable) obj3;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    gl.d3(new b87((Object) na7Var, tL_error, (Object) dVar, (Object) tL_channels_updateUsername, (Object) runnable2, (byte) 1));
                    break;
                } else {
                    gl.d3(new m77((Object) na7Var, this.d, (Object) this.c, (Object) runnable, (byte) 17));
                    break;
                }
            case 1:
                na7 na7Var2 = (na7) obj5;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) obj4;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj3;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) obj2;
                iu4 iu4Var = (iu4) obj;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (tL_inputChatPhoto == null) {
                        int size = updates.updates.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                TLRPC.Update update = updates.updates.get(i);
                                if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewChannelMessage) update).message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                        photo = messageAction.photo;
                                        if (photo instanceof TLRPC.TL_photo) {
                                        }
                                    } else {
                                        continue;
                                    }
                                    i++;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewMessage) {
                                        TLRPC.MessageAction messageAction2 = ((TL_update.TL_updateNewMessage) update).message.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                            photo = messageAction2.photo;
                                            if (!(photo instanceof TLRPC.TL_photo)) {
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                    i++;
                                }
                            } else {
                                photo = null;
                            }
                        }
                        if (photo != null) {
                            TLRPC.PhotoSize w = ba4.w(photo.sizes, kk7.f2, false, null, false);
                            TLRPC.VideoSize videoSize = photo.video_sizes.isEmpty() ? null : photo.video_sizes.get(0);
                            if (w == null || fileLocation == null) {
                                photo2 = photo;
                            } else {
                                na7Var2.getFileLoader().getClass();
                                File J = ba4.J(w, null, true, true);
                                na7Var2.getFileLoader().getClass();
                                ba4.J(fileLocation, null, true, true).renameTo(J);
                                StringBuilder sb = new StringBuilder();
                                sb.append(fileLocation.volume_id);
                                sb.append("_");
                                String l = de9.l(sb, fileLocation.local_id, "@50_50");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(w.location.volume_id);
                                sb2.append("_");
                                String l2 = de9.l(sb2, w.location.local_id, "@50_50");
                                photo2 = photo;
                                fl5.z().N(l, l2, gl5.i(w, photo2), true);
                            }
                            TLRPC.PhotoSize w2 = ba4.w(photo2.sizes, 800, false, null, false);
                            if (w2 != null && fileLocation2 != null) {
                                na7Var2.getFileLoader().getClass();
                                File J2 = ba4.J(w2, null, true, true);
                                na7Var2.getFileLoader().getClass();
                                ba4.J(fileLocation2, null, true, true).renameTo(J2);
                            }
                            if (videoSize != null && (str = this.c) != null) {
                                na7Var2.getFileLoader().getClass();
                                new File(str).renameTo(ba4.J(videoSize, "mp4", true, true));
                            }
                            na7Var2.S0(-this.d);
                        }
                    }
                    na7Var2.Q3(updates, false);
                    gl.d3(new t67(na7Var2, iu4Var, (byte) 5));
                    break;
                }
                break;
            case 2:
                final vqa vqaVar = (vqa) obj5;
                final hd hdVar = (hd) obj4;
                final TLRPC.Document document = (TLRPC.Document) obj3;
                final String str2 = (String) obj2;
                final String str3 = (String) obj;
                final String str4 = this.c;
                final long j = this.d;
                gl.d3(new Runnable() { // from class: boa
                    /* JADX WARN: Removed duplicated region for block: B:14:0x021e  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0273  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x02d5  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0376  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0367  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0264  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        mfb mfbVar;
                        TLRPC.Document document2;
                        String str5;
                        mfb mfbVar2;
                        p pVar;
                        int i2;
                        String str6;
                        CharSequence charSequence;
                        CharSequence charSequence2;
                        vqa vqaVar2;
                        float f;
                        float f2;
                        boolean z;
                        hdVar.dismiss();
                        TLObject tLObject2 = tLObject;
                        boolean z2 = tLObject2 instanceof TL_stars.UniqueStarGiftValueInfo;
                        vqa vqaVar3 = vqa.this;
                        if (!z2) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 != null) {
                                vqaVar3.j().g0(tL_error2, false);
                                return;
                            }
                            return;
                        }
                        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject2;
                        fx0 h = de9.h(1, vqaVar3.J0, vqaVar3.getContext(), false);
                        LinearLayout linearLayout = new LinearLayout(vqaVar3.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(8.0f));
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        be0 be0Var = new be0(vqaVar3.getContext());
                        ImageReceiver imageReceiver = be0Var.getImageReceiver();
                        TLRPC.Document document3 = document;
                        jva.d1(imageReceiver, document3, kk7.p2);
                        linearLayout.addView(be0Var, nme.t(kk7.p2, kk7.p2, 1, 0, 0, 0, 0));
                        TextView textView = new TextView(vqaVar3.getContext());
                        textView.setTextSize(1, 20.0f);
                        zkb.X(textView, bkb.Ii, vqaVar3.J0);
                        textView.setTypeface(gl.o());
                        textView.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
                        int L = gl.L(21.0f);
                        int i3 = bkb.Ei;
                        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i3, vqaVar3.J0));
                        vkb M = zkb.M(i3);
                        wjb wjbVar = vqaVar3.J0;
                        textView.setBackground(b0);
                        zkb.j(textView, b0, M, null, wjbVar);
                        textView.setGravity(17);
                        linearLayout.addView(textView, nme.t(-2, 42, 1, 0, 12, 0, 15));
                        textView.setText(str4);
                        TextView textView2 = new TextView(vqaVar3.getContext());
                        textView2.setTextSize(1, 14.0f);
                        zkb.X(textView2, bkb.i5, vqaVar3.J0);
                        textView2.setGravity(17);
                        linearLayout.addView(textView2, nme.t(-2, -2, 1, 16, 0, 16, 19));
                        boolean z3 = uniqueStarGiftValueInfo.value_is_average;
                        String str7 = str2;
                        if (z3) {
                            de9.r(null, null, 2131749414, new Object[]{str7}, textView2);
                        } else {
                            boolean z4 = uniqueStarGiftValueInfo.last_sale_on_fragment;
                            String str8 = str3;
                            if (z4) {
                                de9.r(null, null, 2131749409, new Object[]{str8}, textView2);
                            } else {
                                de9.r(null, null, 2131749406, new Object[]{str8}, textView2);
                            }
                        }
                        FrameLayout frameLayout = new FrameLayout(vqaVar3.getContext());
                        frameLayout.setClipChildren(false);
                        frameLayout.setClipToPadding(false);
                        p pVar2 = new p(vqaVar3, new je5[1], frameLayout, (byte) 25);
                        mfb mfbVar3 = new mfb(vqaVar3.getContext(), vqaVar3.J0);
                        frameLayout.addView(mfbVar3, nme.e(-1, -1, kk7.D1));
                        mfbVar3.f(k96.M0(2131749410, null), k96.f0(uniqueStarGiftValueInfo.initial_sale_date), null, null);
                        String M0 = k96.M0(2131749411, null);
                        StringBuilder sb3 = new StringBuilder("⭐️");
                        sb3.append(uniqueStarGiftValueInfo.initial_sale_stars);
                        sb3.append(" (~");
                        mfbVar3.f(M0, jva.a1(false, b00.j(sb3, ci0.h().e(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                            mfbVar3.f(k96.M0(2131749407, null), k96.f0(uniqueStarGiftValueInfo.last_sale_date), null, null);
                            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
                            if (round <= 0) {
                                mfbVar = mfbVar3;
                                mfbVar.f(k96.M0(2131749408, null), ci0.h().e(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                    document2 = document3;
                                    str5 = null;
                                    mfbVar2 = mfbVar;
                                    pVar = pVar2;
                                    i2 = 1;
                                } else {
                                    document2 = document3;
                                    str5 = null;
                                    pVar = pVar2;
                                    loa loaVar = new loa(pVar, new q41[]{(q41) ((jfb) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str7, (byte) 0);
                                    mfb mfbVar4 = mfbVar;
                                    TableRow e = mfbVar4.e(k96.M0(2131749405, null), ci0.h().e(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", loaVar, null);
                                    mfbVar2 = mfbVar4;
                                    i2 = 1;
                                    e.setOnClickListener(new bna(loaVar, (byte) 1));
                                }
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                    q41[] q41VarArr = new q41[i2];
                                    loa loaVar2 = new loa(pVar, q41VarArr, uniqueStarGiftValueInfo, str7, (byte) 1);
                                    TableRow e2 = mfbVar2.e(k96.M0(2131749413, str5), ci0.h().e(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", loaVar2, null);
                                    q41VarArr[0] = (q41) ((jfb) e2.getChildAt(1)).getChildAt(0);
                                    e2.setOnClickListener(new bna(loaVar2, (byte) 2));
                                }
                                linearLayout.addView(frameLayout, nme.t(-1, -2, 7, 0, 0, 0, 12));
                                if (uniqueStarGiftValueInfo.listed_count <= 0) {
                                    f = 1.0f;
                                    f2 = 2.0f;
                                    u41 u41Var = new u41(vqaVar3.J0, vqaVar3.getContext(), false);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    spannableStringBuilder.append((CharSequence) k96.E(uniqueStarGiftValueInfo.listed_count, ' '));
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) "e");
                                    spannableStringBuilder.setSpan(new gm(document2, 1.5f, u41Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) k96.M0(2131749402, null));
                                    u41Var.i(gl.F2(spannableStringBuilder, false, gl.L(2.0f), gl.L(1.0f)), false, true);
                                    z = true;
                                    charSequence2 = " ";
                                    vqaVar2 = vqaVar3;
                                    charSequence = "e";
                                    str6 = null;
                                    u41Var.setOnClickListener(new fg(vqaVar2, str7, j, (byte) 6));
                                    linearLayout.addView(u41Var, nme.t(-1, 42, 7, 0, 0, 0, 2));
                                } else {
                                    str6 = str5;
                                    charSequence = "e";
                                    charSequence2 = " ";
                                    vqaVar2 = vqaVar3;
                                    f = 1.0f;
                                    f2 = 2.0f;
                                    z = true;
                                }
                                if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                    u41 u41Var2 = new u41(vqaVar2.J0, vqaVar2.getContext(), false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) k96.E(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                                    spannableStringBuilder2.append(charSequence);
                                    spannableStringBuilder2.setSpan(new gm(document2, 1.5f, u41Var2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                    spannableStringBuilder2.append(charSequence2);
                                    spannableStringBuilder2.append((CharSequence) k96.M0(2131749403, str6));
                                    u41Var2.i(gl.F2(spannableStringBuilder2, false, gl.L(f2), gl.L(f)), false, z);
                                    u41Var2.setOnClickListener(new b99(vqaVar2, uniqueStarGiftValueInfo, (byte) 14));
                                    linearLayout.addView(u41Var2, nme.t(-1, 42, 7, 0, 0, 0, 0));
                                }
                                h.O = linearLayout;
                                h.show();
                            }
                            mfbVar3.e(k96.M0(2131749408, null), ci0.h().e(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + k96.E(round, ' ') + "%", null, null);
                        }
                        mfbVar = mfbVar3;
                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                        }
                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                        }
                        linearLayout.addView(frameLayout, nme.t(-1, -2, 7, 0, 0, 0, 12));
                        if (uniqueStarGiftValueInfo.listed_count <= 0) {
                        }
                        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                        }
                        h.O = linearLayout;
                        h.show();
                    }
                });
                break;
            default:
                final b1c b1cVar = (b1c) obj5;
                final k27 k27Var = (k27) obj4;
                final m11 m11Var = (m11) obj3;
                final y68 y68Var = (y68) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                b1cVar.getClass();
                boolean z = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str5 = this.c;
                final long j2 = this.d;
                if (!z) {
                    final byte b2 = 1;
                    gl.d3(new Runnable() { // from class: m0c
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            long j3 = j2;
                            y68 y68Var2 = y68Var;
                            m11 m11Var2 = m11Var;
                            String str6 = str5;
                            k27 k27Var2 = k27Var;
                            b1c b1cVar2 = b1cVar;
                            b1cVar2.getClass();
                            switch (b3) {
                                case 0:
                                    TLRPC.Message message = k27Var2.k;
                                    message.translatedToLanguage = str6;
                                    message.translatedText = null;
                                    b1cVar2.getMessagesStorage().U1(m11Var2.a, k27Var2.k);
                                    b1cVar2.M.remove(m11Var2);
                                    gl.e3(y68Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                    break;
                                default:
                                    TLRPC.Message message2 = k27Var2.k;
                                    message2.translatedToLanguage = str6;
                                    message2.translatedText = null;
                                    b1cVar2.getMessagesStorage().U1(m11Var2.a, k27Var2.k);
                                    b1cVar2.M.remove(m11Var2);
                                    gl.e3(y68Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        gl.d3(new kg3(b1cVar, k27Var, str5, tL_textWithEntities, arrayList.get(0), m11Var, y68Var, j2));
                        break;
                    } else {
                        final byte b3 = 0;
                        gl.d3(new Runnable() { // from class: m0c
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b32 = b3;
                                long j3 = j2;
                                y68 y68Var2 = y68Var;
                                m11 m11Var2 = m11Var;
                                String str6 = str5;
                                k27 k27Var2 = k27Var;
                                b1c b1cVar2 = b1cVar;
                                b1cVar2.getClass();
                                switch (b32) {
                                    case 0:
                                        TLRPC.Message message = k27Var2.k;
                                        message.translatedToLanguage = str6;
                                        message.translatedText = null;
                                        b1cVar2.getMessagesStorage().U1(m11Var2.a, k27Var2.k);
                                        b1cVar2.M.remove(m11Var2);
                                        gl.e3(y68Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        break;
                                    default:
                                        TLRPC.Message message2 = k27Var2.k;
                                        message2.translatedToLanguage = str6;
                                        message2.translatedText = null;
                                        b1cVar2.getMessagesStorage().U1(m11Var2.a, k27Var2.k);
                                        b1cVar2.M.remove(m11Var2);
                                        gl.e3(y68Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ p77(na7 na7Var, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j, iu4 iu4Var) {
        this.b = na7Var;
        this.e = tL_inputChatPhoto;
        this.f = fileLocation;
        this.g = fileLocation2;
        this.c = str;
        this.d = j;
        this.h = iu4Var;
    }

    public /* synthetic */ p77(vqa vqaVar, hd hdVar, TLRPC.Document document, String str, String str2, String str3, long j) {
        this.b = vqaVar;
        this.e = hdVar;
        this.f = document;
        this.c = str;
        this.g = str2;
        this.h = str3;
        this.d = j;
    }

    public /* synthetic */ p77(b1c b1cVar, k27 k27Var, String str, m11 m11Var, y68 y68Var, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = b1cVar;
        this.e = k27Var;
        this.c = str;
        this.f = m11Var;
        this.g = y68Var;
        this.d = j;
        this.h = tL_textWithEntities;
    }
}
