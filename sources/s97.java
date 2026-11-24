// default package

import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s97 implements RequestDelegate {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ s97(oc7 oc7Var, long j, String str, Runnable runnable, d dVar, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.b = oc7Var;
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
                oc7 oc7Var = (oc7) obj5;
                Runnable runnable = (Runnable) obj4;
                d dVar = (d) obj2;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) obj;
                Runnable runnable2 = (Runnable) obj3;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    gm.c3(new da7((Object) oc7Var, tL_error, (Object) dVar, (Object) tL_channels_updateUsername, (Object) runnable2, (byte) 1));
                    break;
                } else {
                    gm.c3(new p97((Object) oc7Var, this.d, (Object) this.c, (Object) runnable, (byte) 17));
                    break;
                }
            case 1:
                oc7 oc7Var2 = (oc7) obj5;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) obj4;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj3;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) obj2;
                qn4 qn4Var = (qn4) obj;
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
                            TLRPC.PhotoSize w = bc4.w(photo.sizes, nm7.f2, false, null, false);
                            TLRPC.VideoSize videoSize = photo.video_sizes.isEmpty() ? null : photo.video_sizes.get(0);
                            if (w == null || fileLocation == null) {
                                photo2 = photo;
                            } else {
                                oc7Var2.getFileLoader().getClass();
                                File J = bc4.J(w, null, true, true);
                                oc7Var2.getFileLoader().getClass();
                                bc4.J(fileLocation, null, true, true).renameTo(J);
                                StringBuilder sb = new StringBuilder();
                                sb.append(fileLocation.volume_id);
                                sb.append("_");
                                String k = hg9.k(sb, fileLocation.local_id, "@50_50");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(w.location.volume_id);
                                sb2.append("_");
                                String k2 = hg9.k(sb2, w.location.local_id, "@50_50");
                                photo2 = photo;
                                fn5.z().N(k, k2, gn5.i(w, photo2), true);
                            }
                            TLRPC.PhotoSize w2 = bc4.w(photo2.sizes, 800, false, null, false);
                            if (w2 != null && fileLocation2 != null) {
                                oc7Var2.getFileLoader().getClass();
                                File J2 = bc4.J(w2, null, true, true);
                                oc7Var2.getFileLoader().getClass();
                                bc4.J(fileLocation2, null, true, true).renameTo(J2);
                            }
                            if (videoSize != null && (str = this.c) != null) {
                                oc7Var2.getFileLoader().getClass();
                                new File(str).renameTo(bc4.J(videoSize, "mp4", true, true));
                            }
                            oc7Var2.T0(-this.d);
                        }
                    }
                    oc7Var2.T3(updates, false);
                    gm.c3(new q87(oc7Var2, qn4Var, (byte) 4));
                    break;
                }
                break;
            case 2:
                final wsa wsaVar = (wsa) obj5;
                final he heVar = (he) obj4;
                final TLRPC.Document document = (TLRPC.Document) obj3;
                final String str2 = (String) obj2;
                final String str3 = (String) obj;
                final String str4 = this.c;
                final long j = this.d;
                gm.c3(new Runnable() { // from class: bqa
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x021e  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0273  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x02d3  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0379  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x036b  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0265  */
                    /* JADX WARN: Type inference failed for: r12v1 */
                    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r12v6 */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        mhb mhbVar;
                        mhb mhbVar2;
                        TLRPC.Document document2;
                        p pVar;
                        View view;
                        CharSequence charSequence;
                        CharSequence charSequence2;
                        wsa wsaVar2;
                        ?? r12;
                        String str5;
                        float f;
                        float f2;
                        heVar.dismiss();
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TL_stars.UniqueStarGiftValueInfo;
                        wsa wsaVar3 = wsa.this;
                        if (!z) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 != null) {
                                wsaVar3.j().g0(tL_error2, false);
                                return;
                            }
                            return;
                        }
                        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject2;
                        my0 h = hg9.h(1, wsaVar3.J0, wsaVar3.getContext(), false);
                        LinearLayout linearLayout = new LinearLayout(wsaVar3.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(8.0f));
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        bf0 bf0Var = new bf0(wsaVar3.getContext());
                        ImageReceiver imageReceiver = bf0Var.getImageReceiver();
                        TLRPC.Document document3 = document;
                        nxa.e1(imageReceiver, document3, nm7.p2);
                        linearLayout.addView(bf0Var, qoe.t(nm7.p2, nm7.p2, 1, 0, 0, 0, 0));
                        TextView textView = new TextView(wsaVar3.getContext());
                        textView.setTextSize(1, 20.0f);
                        anb.X(textView, cmb.Ii, wsaVar3.J0);
                        textView.setTypeface(gm.o());
                        textView.setPadding(gm.L(20.0f), 0, gm.L(20.0f), 0);
                        int L = gm.L(21.0f);
                        int i2 = cmb.Ei;
                        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i2, wsaVar3.J0));
                        wmb M = anb.M(i2);
                        ylb ylbVar = wsaVar3.J0;
                        textView.setBackground(b0);
                        anb.j(textView, b0, M, null, ylbVar);
                        textView.setGravity(17);
                        linearLayout.addView(textView, qoe.t(-2, 42, 1, 0, 12, 0, 15));
                        textView.setText(str4);
                        TextView textView2 = new TextView(wsaVar3.getContext());
                        textView2.setTextSize(1, 14.0f);
                        anb.X(textView2, cmb.i5, wsaVar3.J0);
                        textView2.setGravity(17);
                        linearLayout.addView(textView2, qoe.t(-2, -2, 1, 16, 0, 16, 19));
                        boolean z2 = uniqueStarGiftValueInfo.value_is_average;
                        String str6 = str2;
                        if (z2) {
                            hg9.q(null, null, 2131749363, new Object[]{str6}, textView2);
                        } else {
                            boolean z3 = uniqueStarGiftValueInfo.last_sale_on_fragment;
                            String str7 = str3;
                            if (z3) {
                                hg9.q(null, null, 2131749358, new Object[]{str7}, textView2);
                            } else {
                                hg9.q(null, null, 2131749355, new Object[]{str7}, textView2);
                            }
                        }
                        FrameLayout frameLayout = new FrameLayout(wsaVar3.getContext());
                        frameLayout.setClipChildren(false);
                        frameLayout.setClipToPadding(false);
                        p pVar2 = new p(wsaVar3, new hg5[1], frameLayout, (byte) 25);
                        mhb mhbVar3 = new mhb(wsaVar3.getContext(), wsaVar3.J0);
                        frameLayout.addView(mhbVar3, qoe.e(-1, -1, nm7.D1));
                        mhbVar3.f(jb6.M0(2131749359, null), jb6.f0(uniqueStarGiftValueInfo.initial_sale_date), null, null);
                        String M0 = jb6.M0(2131749360, null);
                        StringBuilder sb3 = new StringBuilder("⭐️");
                        sb3.append(uniqueStarGiftValueInfo.initial_sale_stars);
                        sb3.append(" (~");
                        mhbVar3.f(M0, nxa.b1(false, b10.j(sb3, cj0.h().e(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                            mhbVar3.f(jb6.M0(2131749356, null), jb6.f0(uniqueStarGiftValueInfo.last_sale_date), null, null);
                            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
                            if (round <= 0) {
                                mhbVar = mhbVar3;
                                mhbVar.f(jb6.M0(2131749357, null), cj0.h().e(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                    mhbVar2 = mhbVar;
                                    document2 = document3;
                                    pVar = pVar2;
                                    view = frameLayout;
                                } else {
                                    document2 = document3;
                                    pVar = pVar2;
                                    lqa lqaVar = new lqa(pVar, new x51[]{(x51) ((jhb) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str6, (byte) 0);
                                    view = frameLayout;
                                    mhb mhbVar4 = mhbVar;
                                    TableRow e = mhbVar4.e(jb6.M0(2131749354, null), cj0.h().e(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", lqaVar, null);
                                    mhbVar2 = mhbVar4;
                                    e.setOnClickListener(new oha(lqaVar, (byte) 4));
                                }
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                    lqa lqaVar2 = new lqa(pVar, new x51[]{(x51) ((jhb) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str6, (byte) 1);
                                    TableRow e2 = mhbVar2.e(jb6.M0(2131749362, null), cj0.h().e(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", lqaVar2, null);
                                    e2.setOnClickListener(new oha(lqaVar2, (byte) 5));
                                }
                                linearLayout.addView(view, qoe.t(-1, -2, 7, 0, 0, 0, 12));
                                if (uniqueStarGiftValueInfo.listed_count <= 0) {
                                    f = 1.0f;
                                    b61 b61Var = new b61(wsaVar3.J0, wsaVar3.getContext(), false);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    spannableStringBuilder.append((CharSequence) jb6.E(uniqueStarGiftValueInfo.listed_count, ' '));
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) "e");
                                    f2 = 2.0f;
                                    spannableStringBuilder.setSpan(new gn(document2, 1.5f, b61Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) jb6.M0(2131749351, null));
                                    b61Var.i(gm.E2(spannableStringBuilder, false, gm.L(2.0f), gm.L(1.0f)), false, true);
                                    charSequence2 = " ";
                                    str5 = null;
                                    charSequence = "e";
                                    wsaVar2 = wsaVar3;
                                    r12 = 1;
                                    b61Var.setOnClickListener(new fh(wsaVar2, str6, j, (byte) 6));
                                    linearLayout.addView(b61Var, qoe.t(-1, 42, 7, 0, 0, 0, 2));
                                } else {
                                    charSequence = "e";
                                    charSequence2 = " ";
                                    wsaVar2 = wsaVar3;
                                    r12 = 1;
                                    str5 = null;
                                    f = 1.0f;
                                    f2 = 2.0f;
                                }
                                if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                    b61 b61Var2 = new b61(wsaVar2.J0, wsaVar2.getContext(), false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) jb6.E(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                                    spannableStringBuilder2.append(charSequence);
                                    spannableStringBuilder2.setSpan(new gn(document2, 1.5f, b61Var2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - r12, spannableStringBuilder2.length(), 33);
                                    spannableStringBuilder2.append(charSequence2);
                                    spannableStringBuilder2.append((CharSequence) jb6.M0(2131749352, str5));
                                    b61Var2.i(gm.E2(spannableStringBuilder2, false, gm.L(f2), gm.L(f)), false, r12);
                                    b61Var2.setOnClickListener(new r39(wsaVar2, uniqueStarGiftValueInfo, (byte) 15));
                                    linearLayout.addView(b61Var2, qoe.t(-1, 42, 7, 0, 0, 0, 0));
                                }
                                h.O = linearLayout;
                                h.show();
                            }
                            mhbVar3.e(jb6.M0(2131749357, null), cj0.h().e(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + jb6.E(round, ' ') + "%", null, null);
                        }
                        mhbVar = mhbVar3;
                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                        }
                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                        }
                        linearLayout.addView(view, qoe.t(-1, -2, 7, 0, 0, 0, 12));
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
                final b3c b3cVar = (b3c) obj5;
                final k47 k47Var = (k47) obj4;
                final u21 u21Var = (u21) obj3;
                final b98 b98Var = (b98) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                b3cVar.getClass();
                boolean z = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str5 = this.c;
                final long j2 = this.d;
                if (!z) {
                    final byte b2 = 1;
                    gm.c3(new Runnable() { // from class: m2c
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            long j3 = j2;
                            b98 b98Var2 = b98Var;
                            u21 u21Var2 = u21Var;
                            String str6 = str5;
                            k47 k47Var2 = k47Var;
                            b3c b3cVar2 = b3cVar;
                            b3cVar2.getClass();
                            switch (b3) {
                                case 0:
                                    TLRPC.Message message = k47Var2.k;
                                    message.translatedToLanguage = str6;
                                    message.translatedText = null;
                                    b3cVar2.getMessagesStorage().U1(u21Var2.a, k47Var2.k);
                                    b3cVar2.M.remove(u21Var2);
                                    gm.d3(b98Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                    break;
                                default:
                                    TLRPC.Message message2 = k47Var2.k;
                                    message2.translatedToLanguage = str6;
                                    message2.translatedText = null;
                                    b3cVar2.getMessagesStorage().U1(u21Var2.a, k47Var2.k);
                                    b3cVar2.M.remove(u21Var2);
                                    gm.d3(b98Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        gm.c3(new xh3(b3cVar, k47Var, str5, tL_textWithEntities, arrayList.get(0), u21Var, b98Var, j2));
                        break;
                    } else {
                        final byte b3 = 0;
                        gm.c3(new Runnable() { // from class: m2c
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b32 = b3;
                                long j3 = j2;
                                b98 b98Var2 = b98Var;
                                u21 u21Var2 = u21Var;
                                String str6 = str5;
                                k47 k47Var2 = k47Var;
                                b3c b3cVar2 = b3cVar;
                                b3cVar2.getClass();
                                switch (b32) {
                                    case 0:
                                        TLRPC.Message message = k47Var2.k;
                                        message.translatedToLanguage = str6;
                                        message.translatedText = null;
                                        b3cVar2.getMessagesStorage().U1(u21Var2.a, k47Var2.k);
                                        b3cVar2.M.remove(u21Var2);
                                        gm.d3(b98Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        break;
                                    default:
                                        TLRPC.Message message2 = k47Var2.k;
                                        message2.translatedToLanguage = str6;
                                        message2.translatedText = null;
                                        b3cVar2.getMessagesStorage().U1(u21Var2.a, k47Var2.k);
                                        b3cVar2.M.remove(u21Var2);
                                        gm.d3(b98Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ s97(oc7 oc7Var, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j, qn4 qn4Var) {
        this.b = oc7Var;
        this.e = tL_inputChatPhoto;
        this.f = fileLocation;
        this.g = fileLocation2;
        this.c = str;
        this.d = j;
        this.h = qn4Var;
    }

    public /* synthetic */ s97(wsa wsaVar, he heVar, TLRPC.Document document, String str, String str2, String str3, long j) {
        this.b = wsaVar;
        this.e = heVar;
        this.f = document;
        this.c = str;
        this.g = str2;
        this.h = str3;
        this.d = j;
    }

    public /* synthetic */ s97(b3c b3cVar, k47 k47Var, String str, u21 u21Var, b98 b98Var, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = b3cVar;
        this.e = k47Var;
        this.c = str;
        this.f = u21Var;
        this.g = b98Var;
        this.d = j;
        this.h = tL_textWithEntities;
    }
}
