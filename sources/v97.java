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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class v97 implements RequestDelegate {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ v97(uc7 uc7Var, long j, String str, Runnable runnable, e eVar, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.b = uc7Var;
        this.d = j;
        this.c = str;
        this.e = runnable;
        this.g = eVar;
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
                uc7 uc7Var = (uc7) obj5;
                Runnable runnable = (Runnable) obj4;
                e eVar = (e) obj2;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) obj;
                Runnable runnable2 = (Runnable) obj3;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    hl.c3(new la7((Object) uc7Var, tL_error, (Object) eVar, (Object) tL_channels_updateUsername, (Object) runnable2, (byte) 1));
                    break;
                } else {
                    hl.c3(new ba7((Object) uc7Var, this.d, (Object) this.c, (Object) runnable, (byte) 17));
                    break;
                }
            case 1:
                uc7 uc7Var2 = (uc7) obj5;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) obj4;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj3;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) obj2;
                rj4 rj4Var = (rj4) obj;
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
                            TLRPC.PhotoSize w = xb4.w(photo.sizes, jn7.f2, false, null, false);
                            TLRPC.VideoSize videoSize = photo.video_sizes.isEmpty() ? null : photo.video_sizes.get(0);
                            if (w == null || fileLocation == null) {
                                photo2 = photo;
                            } else {
                                uc7Var2.getFileLoader().getClass();
                                File J = xb4.J(w, null, true, true);
                                uc7Var2.getFileLoader().getClass();
                                xb4.J(fileLocation, null, true, true).renameTo(J);
                                StringBuilder sb = new StringBuilder();
                                sb.append(fileLocation.volume_id);
                                sb.append("_");
                                String l = uh9.l(sb, fileLocation.local_id, "@50_50");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(w.location.volume_id);
                                sb2.append("_");
                                String l2 = uh9.l(sb2, w.location.local_id, "@50_50");
                                photo2 = photo;
                                in5.z().N(l, l2, jn5.i(w, photo2), true);
                            }
                            TLRPC.PhotoSize w2 = xb4.w(photo2.sizes, 800, false, null, false);
                            if (w2 != null && fileLocation2 != null) {
                                uc7Var2.getFileLoader().getClass();
                                File J2 = xb4.J(w2, null, true, true);
                                uc7Var2.getFileLoader().getClass();
                                xb4.J(fileLocation2, null, true, true).renameTo(J2);
                            }
                            if (videoSize != null && (str = this.c) != null) {
                                uc7Var2.getFileLoader().getClass();
                                new File(str).renameTo(xb4.J(videoSize, "mp4", true, true));
                            }
                            uc7Var2.U0(-this.d);
                        }
                    }
                    uc7Var2.Y3(updates, false);
                    hl.c3(new mn6((Object) uc7Var2, (Object) rj4Var, (byte) 28));
                    break;
                }
                break;
            case 2:
                final wua wuaVar = (wua) obj5;
                final id idVar = (id) obj4;
                final TLRPC.Document document = (TLRPC.Document) obj3;
                final String str2 = (String) obj2;
                final String str3 = (String) obj;
                final String str4 = this.c;
                final long j = this.d;
                hl.c3(new Runnable() { // from class: fsa
                    /* JADX WARN: Removed duplicated region for block: B:14:0x021e  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0273  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x02d6  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0378  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0369  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0265  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        hjb hjbVar;
                        hjb hjbVar2;
                        TLRPC.Document document2;
                        String str5;
                        p pVar;
                        String str6;
                        CharSequence charSequence;
                        CharSequence charSequence2;
                        wua wuaVar2;
                        float f;
                        float f2;
                        boolean z;
                        idVar.dismiss();
                        TLObject tLObject2 = tLObject;
                        boolean z2 = tLObject2 instanceof TL_stars.UniqueStarGiftValueInfo;
                        wua wuaVar3 = wua.this;
                        if (!z2) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 != null) {
                                wuaVar3.j().g0(tL_error2, false);
                                return;
                            }
                            return;
                        }
                        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject2;
                        nx0 h = uh9.h(1, wuaVar3.J0, wuaVar3.getContext(), false);
                        LinearLayout linearLayout = new LinearLayout(wuaVar3.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(8.0f));
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        de0 de0Var = new de0(wuaVar3.getContext());
                        ImageReceiver imageReceiver = de0Var.getImageReceiver();
                        TLRPC.Document document3 = document;
                        nza.e1(imageReceiver, document3, jn7.p2);
                        linearLayout.addView(de0Var, tre.t(jn7.p2, jn7.p2, 1, 0, 0, 0, 0));
                        TextView textView = new TextView(wuaVar3.getContext());
                        textView.setTextSize(1, 20.0f);
                        yob.X(textView, aob.Ji, wuaVar3.J0);
                        textView.setTypeface(hl.o());
                        textView.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
                        int L = hl.L(21.0f);
                        int i2 = aob.Fi;
                        ShapeDrawable b0 = aob.b0(L, aob.v0(i2, wuaVar3.J0));
                        uob M = yob.M(i2);
                        vnb vnbVar = wuaVar3.J0;
                        textView.setBackground(b0);
                        yob.j(textView, b0, M, null, vnbVar);
                        textView.setGravity(17);
                        linearLayout.addView(textView, tre.t(-2, 42, 1, 0, 12, 0, 15));
                        textView.setText(str4);
                        TextView textView2 = new TextView(wuaVar3.getContext());
                        textView2.setTextSize(1, 14.0f);
                        yob.X(textView2, aob.j5, wuaVar3.J0);
                        textView2.setGravity(17);
                        linearLayout.addView(textView2, tre.t(-2, -2, 1, 16, 0, 16, 19));
                        boolean z3 = uniqueStarGiftValueInfo.value_is_average;
                        String str7 = str2;
                        if (z3) {
                            uh9.r(null, null, 2131749360, new Object[]{str7}, textView2);
                        } else {
                            boolean z4 = uniqueStarGiftValueInfo.last_sale_on_fragment;
                            String str8 = str3;
                            if (z4) {
                                uh9.r(null, null, 2131749355, new Object[]{str8}, textView2);
                            } else {
                                uh9.r(null, null, 2131749352, new Object[]{str8}, textView2);
                            }
                        }
                        FrameLayout frameLayout = new FrameLayout(wuaVar3.getContext());
                        frameLayout.setClipChildren(false);
                        frameLayout.setClipToPadding(false);
                        p pVar2 = new p(wuaVar3, new kg5[1], frameLayout, (byte) 26);
                        hjb hjbVar3 = new hjb(wuaVar3.getContext(), wuaVar3.J0);
                        frameLayout.addView(hjbVar3, tre.e(-1, -1, jn7.D1));
                        hjbVar3.f(ob6.M0(2131749356, null), ob6.f0(uniqueStarGiftValueInfo.initial_sale_date), null, null);
                        String M0 = ob6.M0(2131749357, null);
                        StringBuilder sb3 = new StringBuilder("⭐️");
                        sb3.append(uniqueStarGiftValueInfo.initial_sale_stars);
                        sb3.append(" (~");
                        hjbVar3.f(M0, nza.b1(false, c00.k(sb3, di0.h().e(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                            hjbVar3.f(ob6.M0(2131749353, null), ob6.f0(uniqueStarGiftValueInfo.last_sale_date), null, null);
                            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
                            if (round <= 0) {
                                hjbVar = hjbVar3;
                                hjbVar.f(ob6.M0(2131749354, null), di0.h().e(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                    hjbVar2 = hjbVar;
                                    document2 = document3;
                                    str5 = null;
                                    pVar = pVar2;
                                } else {
                                    document2 = document3;
                                    str5 = null;
                                    pVar = pVar2;
                                    nsa nsaVar = new nsa(pVar, new y41[]{(y41) ((ejb) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str7, (byte) 0);
                                    hjb hjbVar4 = hjbVar;
                                    TableRow e = hjbVar4.e(ob6.M0(2131749351, null), di0.h().e(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", nsaVar, null);
                                    hjbVar2 = hjbVar4;
                                    e.setOnClickListener(new kla(nsaVar, (byte) 2));
                                }
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                    nsa nsaVar2 = new nsa(pVar, new y41[]{(y41) ((ejb) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str7, (byte) 1);
                                    TableRow e2 = hjbVar2.e(ob6.M0(2131749359, str5), di0.h().e(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", nsaVar2, null);
                                    e2.setOnClickListener(new kla(nsaVar2, (byte) 3));
                                }
                                linearLayout.addView(frameLayout, tre.t(-1, -2, 7, 0, 0, 0, 12));
                                if (uniqueStarGiftValueInfo.listed_count <= 0) {
                                    f = 1.0f;
                                    f2 = 2.0f;
                                    c51 c51Var = new c51(wuaVar3.J0, wuaVar3.getContext(), false);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    spannableStringBuilder.append((CharSequence) ob6.E(uniqueStarGiftValueInfo.listed_count, ' '));
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) "e");
                                    spannableStringBuilder.setSpan(new hm(document2, 1.5f, c51Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) ob6.M0(2131749348, null));
                                    c51Var.i(hl.E2(spannableStringBuilder, false, hl.L(2.0f), hl.L(1.0f)), false, true);
                                    z = true;
                                    charSequence = "e";
                                    charSequence2 = " ";
                                    wuaVar2 = wuaVar3;
                                    str6 = null;
                                    c51Var.setOnClickListener(new dg(wuaVar2, str7, j, (byte) 6));
                                    linearLayout.addView(c51Var, tre.t(-1, 42, 7, 0, 0, 0, 2));
                                } else {
                                    str6 = str5;
                                    charSequence = "e";
                                    charSequence2 = " ";
                                    wuaVar2 = wuaVar3;
                                    f = 1.0f;
                                    f2 = 2.0f;
                                    z = true;
                                }
                                if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                    c51 c51Var2 = new c51(wuaVar2.J0, wuaVar2.getContext(), false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) ob6.E(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                                    spannableStringBuilder2.append(charSequence);
                                    spannableStringBuilder2.setSpan(new hm(document2, 1.5f, c51Var2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                    spannableStringBuilder2.append(charSequence2);
                                    spannableStringBuilder2.append((CharSequence) ob6.M0(2131749349, str6));
                                    c51Var2.i(hl.E2(spannableStringBuilder2, false, hl.L(f2), hl.L(f)), false, z);
                                    c51Var2.setOnClickListener(new jy8(wuaVar2, uniqueStarGiftValueInfo, (byte) 17));
                                    linearLayout.addView(c51Var2, tre.t(-1, 42, 7, 0, 0, 0, 0));
                                }
                                h.O = linearLayout;
                                h.show();
                            }
                            hjbVar3.e(ob6.M0(2131749354, null), di0.h().e(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + ob6.E(round, ' ') + "%", null, null);
                        }
                        hjbVar = hjbVar3;
                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                        }
                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                        }
                        linearLayout.addView(frameLayout, tre.t(-1, -2, 7, 0, 0, 0, 12));
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
                final a5c a5cVar = (a5c) obj5;
                final r47 r47Var = (r47) obj4;
                final v11 v11Var = (v11) obj3;
                final na8 na8Var = (na8) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                a5cVar.getClass();
                boolean z = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str5 = this.c;
                final long j2 = this.d;
                if (!z) {
                    final byte b2 = 1;
                    hl.c3(new Runnable() { // from class: m4c
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            long j3 = j2;
                            na8 na8Var2 = na8Var;
                            v11 v11Var2 = v11Var;
                            String str6 = str5;
                            r47 r47Var2 = r47Var;
                            a5c a5cVar2 = a5cVar;
                            a5cVar2.getClass();
                            switch (b3) {
                                case 0:
                                    TLRPC.Message message = r47Var2.k;
                                    message.translatedToLanguage = str6;
                                    message.translatedText = null;
                                    a5cVar2.getMessagesStorage().Z1(v11Var2.a, r47Var2.k);
                                    a5cVar2.M.remove(v11Var2);
                                    hl.d3(na8Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                    break;
                                default:
                                    TLRPC.Message message2 = r47Var2.k;
                                    message2.translatedToLanguage = str6;
                                    message2.translatedText = null;
                                    a5cVar2.getMessagesStorage().Z1(v11Var2.a, r47Var2.k);
                                    a5cVar2.M.remove(v11Var2);
                                    hl.d3(na8Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        hl.c3(new eh3(a5cVar, r47Var, str5, tL_textWithEntities, arrayList.get(0), v11Var, na8Var, j2));
                        break;
                    } else {
                        final byte b3 = 0;
                        hl.c3(new Runnable() { // from class: m4c
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b32 = b3;
                                long j3 = j2;
                                na8 na8Var2 = na8Var;
                                v11 v11Var2 = v11Var;
                                String str6 = str5;
                                r47 r47Var2 = r47Var;
                                a5c a5cVar2 = a5cVar;
                                a5cVar2.getClass();
                                switch (b32) {
                                    case 0:
                                        TLRPC.Message message = r47Var2.k;
                                        message.translatedToLanguage = str6;
                                        message.translatedText = null;
                                        a5cVar2.getMessagesStorage().Z1(v11Var2.a, r47Var2.k);
                                        a5cVar2.M.remove(v11Var2);
                                        hl.d3(na8Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        break;
                                    default:
                                        TLRPC.Message message2 = r47Var2.k;
                                        message2.translatedToLanguage = str6;
                                        message2.translatedText = null;
                                        a5cVar2.getMessagesStorage().Z1(v11Var2.a, r47Var2.k);
                                        a5cVar2.M.remove(v11Var2);
                                        hl.d3(na8Var2, Math.max(0L, 400 - (System.currentTimeMillis() - j3)));
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ v97(uc7 uc7Var, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j, rj4 rj4Var) {
        this.b = uc7Var;
        this.e = tL_inputChatPhoto;
        this.f = fileLocation;
        this.g = fileLocation2;
        this.c = str;
        this.d = j;
        this.h = rj4Var;
    }

    public /* synthetic */ v97(wua wuaVar, id idVar, TLRPC.Document document, String str, String str2, String str3, long j) {
        this.b = wuaVar;
        this.e = idVar;
        this.f = document;
        this.c = str;
        this.g = str2;
        this.h = str3;
        this.d = j;
    }

    public /* synthetic */ v97(a5c a5cVar, r47 r47Var, String str, v11 v11Var, na8 na8Var, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = a5cVar;
        this.e = r47Var;
        this.c = str;
        this.f = v11Var;
        this.g = na8Var;
        this.d = j;
        this.h = tL_textWithEntities;
    }
}
