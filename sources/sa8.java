// default package

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.widget.ImageView;
import androidx.car.app.IOnDoneCallback;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sa8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sa8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        JSONObject optJSONObject;
        String optString;
        TLRPC.Message message;
        boolean z;
        g09 g09Var;
        String str;
        int i2;
        String str2;
        vz8 vz8Var;
        int i3;
        int i4;
        boolean z2;
        byte b = 4;
        ou1 ou1Var = null;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ra8 ra8Var = (ra8) this.d;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (zArr[0]) {
                    return;
                }
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                SurfaceView surfaceView = photoViewer.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                zArr[0] = true;
                ra8Var.run();
                return;
            case 1:
                pc8 pc8Var = (pc8) this.b;
                pc8 pc8Var2 = (pc8) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer2 = pc8Var.d;
                if (photoViewer2.E == null || pc8Var2 != photoViewer2.C8) {
                    return;
                }
                photoViewer2.C8 = null;
                photoViewer2.v8 = iArr[5];
                photoViewer2.n8 = iArr[4];
                photoViewer2.o8 = iArr[7];
                float f = photoViewer2.l8 / 8;
                PhotoViewer photoViewer3 = pc8Var.d;
                photoViewer2.w8 = (long) ((f * photoViewer3.n8) / 1000.0f);
                boolean z3 = photoViewer3.p8;
                PhotoViewer photoViewer4 = pc8Var.d;
                if (z3) {
                    photoViewer4.g8 = iArr[8];
                    photoViewer4.S2();
                    if (pc8Var.d.d8 > pc8Var.d.e8 - 1) {
                        PhotoViewer photoViewer5 = pc8Var.d;
                        photoViewer5.d8 = photoViewer5.e8 - 1;
                    }
                    PhotoViewer photoViewer6 = pc8Var.d;
                    if (!photoViewer6.I4) {
                        iec iecVar = photoViewer6.k1;
                        boolean z4 = photoViewer6.e8 > 1;
                        PhotoViewer photoViewer7 = pc8Var.d;
                        iecVar.a(Math.min(photoViewer7.j8, pc8Var.d.k8), z4, photoViewer7.r);
                    }
                    if (f11.a) {
                        StringBuilder sb = new StringBuilder("compressionsCount = ");
                        sb.append(pc8Var.d.e8);
                        sb.append(" w = ");
                        sb.append(pc8Var.d.h8);
                        sb.append(" h = ");
                        sb.append(pc8Var.d.i8);
                        sb.append(" r = ");
                        c00.q(pc8Var.d.g8, sb);
                    }
                    pc8Var.d.T7.invalidate();
                } else {
                    if (photoViewer4.I4) {
                        i = 0;
                    } else {
                        iec iecVar2 = photoViewer4.k1;
                        boolean z5 = photoViewer4.r;
                        int min = Math.min(photoViewer4.j8, pc8Var.d.k8);
                        i = 0;
                        iecVar2.a(min, false, z5);
                    }
                    pc8Var.d.e8 = i;
                }
                pc8Var.d.P2();
                pc8Var.d.J2();
                return;
            case 2:
                tu tuVar = (tu) this.b;
                String str3 = (String) this.c;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
                nc8 nc8Var = (nc8) tuVar.b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + nc8Var.x).put("platform", "DESKTOP"))).put("videoId", nc8Var.x).toString().getBytes("UTF-8"));
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    byte[] bArr = new byte[10240];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            byteArrayOutputStream.close();
                            inputStream.close();
                            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (optString = optJSONObject.optString("spec")) == null) {
                                return;
                            }
                            if (nc8Var.I == 0) {
                                nc8Var.s = optString;
                                return;
                            } else {
                                nc8Var.g(optString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            case 3:
                ji8 ji8Var = (ji8) this.b;
                zu1 zu1Var = (zu1) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                r47 r47Var = ji8Var.I;
                byte[] bArr2 = pollAnswer.option;
                if (r47Var != null && (message = r47Var.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    r47.B0(message);
                    ou1Var = new ou1();
                    ou1Var.a = r47Var;
                    ou1Var.b = -1;
                    ou1Var.c = -1;
                    ou1Var.h = true;
                    ou1Var.e = bArr2;
                    ou1Var.f();
                }
                zu1Var.ec(r47Var, ou1Var);
                ji8Var.b(false);
                return;
            case 4:
                ui8 ui8Var = (ui8) this.b;
                ti8 ti8Var = (ti8) this.c;
                TLObject tLObject = (TLObject) this.d;
                if (ui8Var.isShowing()) {
                    ui8Var.u1.remove(ti8Var);
                    if (tLObject != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                        uc7.s1(ui8Var.a).j4(tL_messages_votesList.users, false);
                        ti8Var.b.addAll(tL_messages_votesList.votes);
                        ti8Var.c = tL_messages_votesList.next_offset;
                        ui8Var.E0(null);
                        ui8Var.m1.X(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                premiumPreviewFragment.getClass();
                if (tL_error != null) {
                    d31.e0(tL_error);
                    return;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        return;
                    }
                    xnb.x(null, 2131743534, d31.b0(premiumPreviewFragment), null);
                    return;
                }
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                RectF rectF = ProfileActivity.Z6;
                if (hl.g(str4)) {
                    d31.b0(profileActivity).i(str5).j();
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                qq1 qq1Var = (qq1) this.c;
                zu1 zu1Var2 = (zu1) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                b82 b82Var = qq1Var.e;
                ViewGroup viewGroup = (ViewGroup) zu1Var2.fragmentView;
                RectF rectF3 = yic.h;
                yic.c(b82Var, viewGroup, rectF3);
                profileActivity2.k6 = rectF3.left;
                profileActivity2.W1();
                return;
            case 8:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                HashSet hashSet = (HashSet) this.d;
                RectF rectF4 = ProfileActivity.Z6;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(i5);
                    if (!hashSet.contains(Long.valueOf(user.id))) {
                        TLRPC.ChatFull chatFull = profileActivity3.v2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (xc2.T(profileActivity3.F2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity3.getUserConfig().e();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user.id;
                            channelParticipant.date = profileActivity3.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user.id;
                            profileActivity3.v2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user.id;
                            tL_chatParticipant.inviter_id = yac.h(profileActivity3.getAccountInstance().a).n;
                            profileActivity3.v2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity3.v2.participants_count++;
                        profileActivity3.getMessagesController().i4(user, false, false);
                    }
                }
                profileActivity3.Z3(true, false);
                return;
            case 9:
                d31.D((wf1) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                return;
            case 10:
                cga cgaVar = (cga) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                e eVar = (e) this.d;
                cgaVar.I = -1;
                if (tL_error2 != null) {
                    d31.b0(eVar).g0(tL_error2, false);
                    return;
                }
                return;
            case 11:
                au8 au8Var = (au8) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                fu5 fu5Var = (fu5) this.d;
                cga cgaVar2 = au8Var.a;
                cgaVar2.e.k(au8Var.e.d, savedStarGift);
                fu5Var.u();
                cgaVar2.o();
                TL_stars.TL_starGiftCollection c = cgaVar2.e.c(au8Var.e.d);
                if (c != null) {
                    d31.b0(cgaVar2.a).R(savedStarGift.gift.getDocument(), hl.S2(ob6.a0(null, null, 2131749995, wua.u1(savedStarGift.gift), c.title))).j();
                    return;
                }
                return;
            case 12:
                au8 au8Var2 = (au8) this.b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                sx4 sx4Var = (sx4) this.d;
                if (au8Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z = true;
                } else {
                    z = true;
                    sx4Var.d(false, true);
                    au8Var2.e.q(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z;
                sx4Var.i(savedStarGift2, z, au8Var2.d);
                au8Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = au8Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(au8Var2.b).sendRequest(savestargift, null);
                return;
            case 13:
                sv8 sv8Var = (sv8) this.b;
                sv8Var.V = new mv8((e) this.c, (TL_wallet.card) this.d, (byte) 0);
                sv8Var.dismiss();
                return;
            case 14:
                rz8 rz8Var = (rz8) this.b;
                qy8 qy8Var = (qy8) this.c;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList2 = (ArrayList) this.d;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = qy8Var.b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList3 = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList3 == null || arrayList3 == arrayList2 || (g09Var = rz8Var.d) == null || rz8Var.isFinished) {
                    return;
                }
                e09 e09Var = g09Var.n;
                if (e09Var != null && e09Var.a == 0 && (i4 = e09Var.f) >= 0) {
                    String[] strArr = nd0.a;
                    if (i4 < strArr.length) {
                        str = strArr[i4];
                        i2 = g09Var.M7;
                        if (i2 >= 0) {
                            String[] strArr2 = nd0.a;
                            if (i2 < strArr2.length) {
                                str2 = strArr2[i2];
                                if (nd0.a(arrayList3)) {
                                    if (str2 != null) {
                                        i3 = 0;
                                        while (true) {
                                            String[] strArr3 = nd0.a;
                                            if (i3 < strArr3.length) {
                                                if (!str2.equals(strArr3[i3])) {
                                                    i3++;
                                                }
                                            }
                                        }
                                        g09Var.M7 = i3;
                                        if (str != null) {
                                            if (g09Var.r != null) {
                                                g09Var.r = null;
                                                g09Var.s = 1.0f;
                                            }
                                            int i6 = 0;
                                            while (true) {
                                                String[] strArr4 = nd0.a;
                                                if (i6 >= strArr4.length) {
                                                    i6 = g09.F9;
                                                } else if (!str.equals(strArr4[i6])) {
                                                    i6++;
                                                }
                                            }
                                            g09Var.n = g09.t(i6);
                                            v34 v34Var = g09Var.c;
                                            if (v34Var != null) {
                                                ((rz8) v34Var.b).Y();
                                            }
                                        }
                                        g09Var.invalidate();
                                    }
                                    i3 = g09.F9;
                                    g09Var.M7 = i3;
                                    if (str != null) {
                                    }
                                    g09Var.invalidate();
                                }
                                vz8Var = rz8Var.e;
                                if (vz8Var == null || vz8Var.F) {
                                    return;
                                }
                                if (vz8Var.E) {
                                    vz8Var.j();
                                    return;
                                }
                                if (vz8Var.y) {
                                    return;
                                }
                                TLRPC.ShareTheme shareTheme = vz8Var.I;
                                if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) || (((TLRPC.TL_shareThemeEmojiBackdrop) shareTheme).flags & 1) == 0) {
                                    return;
                                }
                                vz8Var.a(shareTheme);
                                return;
                            }
                        }
                        str2 = null;
                        if (nd0.a(arrayList3)) {
                        }
                        vz8Var = rz8Var.e;
                        if (vz8Var == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                str = null;
                i2 = g09Var.M7;
                if (i2 >= 0) {
                }
                str2 = null;
                if (nd0.a(arrayList3)) {
                }
                vz8Var = rz8Var.e;
                if (vz8Var == null) {
                }
                break;
            case 15:
                g09 g09Var2 = (g09) this.b;
                d09 d09Var = (d09) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (d09Var.G || bitmap == null) {
                    return;
                }
                d09Var.D = bitmap;
                g09Var2.invalidate();
                return;
            case 16:
                a36 a36Var = (a36) this.b;
                da9 da9Var = (da9) this.c;
                String str6 = (String) this.d;
                if (a36Var != null) {
                    try {
                        if (((k36) a36Var).b.compareTo(z26.c) >= 0) {
                            da9Var.a();
                            return;
                        }
                    } catch (u31 e2) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str6), e2);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + da9Var);
                return;
            case 17:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str7 = (String) this.c;
                try {
                    androidx.car.app.utils.e.d(str7.concat(" onSuccess"), new o48(iOnDoneCallback, ((da9) this.d).a(), str7, b));
                    return;
                } catch (RuntimeException e3) {
                    androidx.car.app.utils.e.f(iOnDoneCallback, str7, e3);
                    grb.m(e3);
                    return;
                } catch (u31 e4) {
                    androidx.car.app.utils.e.f(iOnDoneCallback, str7, e4);
                    return;
                }
            case 18:
                nd9 nd9Var = (nd9) this.b;
                qc9 qc9Var = (qc9) this.c;
                nd9Var.q0(qc9Var, qc9Var.getContent(), false, (fu5) this.d);
                return;
            case 19:
                ed9 ed9Var = (ed9) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                String str8 = (String) this.d;
                HashMap hashMap = ed9Var.n;
                HashMap hashMap2 = ed9Var.p;
                HashMap hashMap3 = ed9Var.o;
                ArrayList arrayList4 = ed9Var.i;
                ArrayList arrayList5 = ed9Var.h;
                ArrayList arrayList6 = ed9Var.g;
                int i7 = ed9Var.a;
                ArrayList arrayList7 = ed9Var.e;
                ed9Var.B = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    uc7.s1(i7).j4(resalestargifts.users, false);
                    uc7.s1(i7).c4(resalestargifts.chats, false);
                    if (TextUtils.isEmpty(str8)) {
                        arrayList7.clear();
                        ed9Var.v = 0;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList8 = resalestargifts.gifts;
                    int size2 = arrayList8.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        TL_stars.StarGift starGift = arrayList8.get(i8);
                        i8++;
                        TL_stars.StarGift starGift2 = starGift;
                        String str9 = str8;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            if (wua.E1(i7, tL_starGiftUnique) || ((ed9Var.x || ed9Var.y) && it7.n(tL_starGiftUnique))) {
                                ed9Var.v++;
                            } else {
                                arrayList7.add(tL_starGiftUnique);
                            }
                        }
                        str8 = str9;
                    }
                    String str10 = str8;
                    ed9Var.f = Math.max(arrayList7.size(), resalestargifts.count - ed9Var.v);
                    ed9Var.A = arrayList7.size() >= ed9Var.f || TextUtils.isEmpty(resalestargifts.next_offset);
                    ed9Var.r = resalestargifts.next_offset;
                    ed9Var.z = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList9 = resalestargifts.attributes;
                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                        arrayList6.clear();
                        arrayList5.clear();
                        arrayList4.clear();
                        arrayList6.addAll(jxa.j(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList5.addAll(jxa.j(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList4.addAll(jxa.j(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        ed9Var.j = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty() || TextUtils.isEmpty(str10)) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList10 = resalestargifts.counters;
                        int size3 = arrayList10.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList10.get(i9);
                            i9++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                hashMap3.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                hashMap2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                hashMap.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    pcc pccVar = ed9Var.d;
                    if (pccVar != null) {
                        pccVar.a(Boolean.valueOf(z2));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                pi9 pi9Var = (pi9) this.b;
                fu5 fu5Var2 = (fu5) this.c;
                xl9 xl9Var = (xl9) this.d;
                if (pi9Var.r4 == fu5Var2) {
                    pi9Var.r4 = null;
                    if (pi9Var.K3 && pi9Var.q4 == xl9Var && !xl9Var.I.isEmpty()) {
                        pi9Var.J2();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                pi9 pi9Var2 = (pi9) this.b;
                mk0 mk0Var = (mk0) this.c;
                mk0 mk0Var2 = (mk0) this.d;
                ArrayList arrayList11 = pi9Var2.x4;
                di9 di9Var = pi9Var2.v3;
                if (di9Var == null || mk0Var == null || mk0Var2 == null) {
                    return;
                }
                int indexOf = arrayList11.indexOf(mk0Var);
                int indexOf2 = arrayList11.indexOf(mk0Var2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                for (int i10 = 0; i10 < arrayList11.size(); i10++) {
                    mk0 mk0Var3 = (mk0) arrayList11.get(i10);
                    long j = mk0Var3.t;
                    if (j != 0) {
                        di9Var.W(i10, mm9.l((TL_iv.RichText) pi9Var2.u3.get(Long.valueOf(j))));
                    } else {
                        di9Var.W(i10, km9.y(mk0Var3.b));
                    }
                }
                di9Var.h0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 22:
                ((pi9) this.b).e5((mk0) this.c, (String) this.d);
                return;
            case 23:
                fm9 fm9Var = (fm9) this.b;
                mk0 mk0Var4 = (mk0) this.c;
                jm9 jm9Var = (jm9) this.d;
                hm9 hm9Var = fm9Var.a.E;
                if (hm9Var != null) {
                    ((zh9) hm9Var).d(mk0Var4, jm9Var.a, jm9Var.b, jm9Var.c, jm9Var.d, jm9Var.e);
                    return;
                }
                return;
            case 24:
                xm9 xm9Var = (xm9) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                String str11 = xm9Var.b;
                int i11 = xm9Var.a;
                if (tLObject4 != null) {
                    ls6.d0(i11).j1(str11, (TLRPC.Document) tLObject4, false);
                } else {
                    xm9Var.a();
                    ls6.d0(i11).j1(str11, null, true);
                    if (tL_error3 != null) {
                        jn7.f(i11).d(new yz8(xm9Var, tL_error3, (byte) 29));
                    }
                }
                xm9Var.a();
                return;
            case 25:
                xn9 xn9Var = (xn9) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                try {
                    xn9Var.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 26:
                jp9 jp9Var = (jp9) this.b;
                fp9 fp9Var = (fp9) this.c;
                File file = (File) this.d;
                gp9 gp9Var = jp9Var.e;
                long j2 = fp9Var.a;
                hkb hkbVar = (hkb) gp9Var;
                synchronized (hkbVar) {
                    if (hkbVar.d) {
                        return;
                    }
                    hkbVar.c.put(Long.valueOf(j2), new fkb(file));
                    return;
                }
            case 27:
                jp9 jp9Var2 = (jp9) this.b;
                bo9 bo9Var = (bo9) this.c;
                File file2 = (File) this.d;
                Handler handler = jp9Var2.i;
                try {
                    bo9Var.c(file2);
                    jp9Var2.g();
                    long h = bo9Var.h();
                    jp9Var2.m.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + jp9.f(jp9Var2.N));
                    handler.post(new xo9(jp9Var2, h, b2));
                    return;
                } catch (Exception e5) {
                    handler.post(new wo9(jp9Var2, e5, (byte) 3));
                    return;
                }
            case 28:
                er9 er9Var = (er9) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                String str12 = (String) this.d;
                if (tLObject5 instanceof TL_phone.exportedGroupCallInvite) {
                    TL_phone.exportedGroupCallInvite exportedgroupcallinvite = (TL_phone.exportedGroupCallInvite) tLObject5;
                    if (!TextUtils.isEmpty(exportedgroupcallinvite.link)) {
                        er9Var.i(exportedgroupcallinvite.link, false);
                        return;
                    }
                }
                er9Var.i(str12, true);
                return;
            default:
                er9 er9Var2 = (er9) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                if (tLObject6 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported;
                    }
                    er9Var2.i(tL_chatInviteExported.link, true);
                    return;
                }
                return;
        }
    }
}
