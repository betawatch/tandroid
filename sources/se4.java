// default package

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.widget.ImageView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class se4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ se4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TL_stars.StarsTransaction starsTransaction;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 2;
        SurfaceTexture surfaceTexture = null;
        byte b4 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nf4 nf4Var = (nf4) obj2;
                nf4Var.getClass();
                nf4Var.r0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 1:
                rf4 rf4Var = (rf4) obj2;
                b8b b8bVar = (b8b) obj;
                rf4Var.a();
                rf4Var.e(b8bVar);
                uf4 uf4Var = rf4Var.K;
                uf4Var.h1 = b8bVar;
                uf4Var.j();
                break;
            case 2:
                ((rf4) obj2).K.f1 = (tf4) obj;
                break;
            case 3:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.e0(new bh4(filtersSetupActivity, (byte) 3));
                    break;
                }
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity2 = ((ih4) obj2).e;
                filtersSetupActivity2.getMessagesController().M0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(jn7.O2, new Object[0]);
                break;
            case 5:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    taskCompletionSource.setResult(((FirebaseMessaging) obj2).a());
                    break;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 6:
                ((rk4) obj2).e(0.0f, 240L, (Runnable) obj);
                break;
            case 7:
                xl4 xl4Var = (xl4) obj2;
                ne8 ne8Var = (ne8) obj;
                je8 je8Var = xl4Var.b;
                if (xl4Var.l == ne8Var) {
                    ImageView imageView = xl4Var.n;
                    if (imageView != null && imageView.getVisibility() == 0) {
                        ne8Var.setFirstFrameCallback(new nl4(xl4Var, b2));
                    }
                    if (je8Var.Y()) {
                        je8Var.j();
                        break;
                    } else if (!je8Var.i()) {
                        je8Var.g(je8Var.k());
                        break;
                    }
                }
                break;
            case 8:
                xl4 xl4Var2 = (xl4) obj2;
                pcc pccVar = (pcc) obj;
                xl4Var2.m();
                ne8 ne8Var2 = xl4Var2.l;
                xl4Var2.l = null;
                if (ne8Var2 != null) {
                    hl.B2(ne8Var2);
                    SurfaceTexture surfaceTexture2 = ne8Var2.a;
                    ne8Var2.a = null;
                    surfaceTexture = surfaceTexture2;
                }
                pccVar.a(surfaceTexture);
                break;
            case 9:
                ((qn4) obj2).u2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 10:
                ((rx1) obj2).a((e) obj);
                break;
            case 11:
                ((mx4) obj2).j().g0((TLRPC.TL_error) obj, false);
                break;
            case 12:
                sx4 sx4Var = (sx4) obj2;
                sx4Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    sx4Var.G.setVisibility(8);
                    break;
                }
                break;
            case 13:
                y15 y15Var = (y15) obj2;
                TLObject tLObject = (TLObject) obj;
                int i = y15Var.a;
                if (z15.b[i] == y15Var) {
                    if (tLObject instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                        uc7.s1(i).j4(starsStatus.users, false);
                        uc7.s1(i).c4(starsStatus.chats, false);
                        ArrayList<TL_stars.StarsTransaction> arrayList = starsStatus.history;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                TL_stars.StarsTransaction starsTransaction2 = arrayList.get(i2);
                                i2++;
                                starsTransaction = starsTransaction2;
                                String str = y15Var.g;
                                if (str != null) {
                                    if (str.equals(starsTransaction.id)) {
                                    }
                                } else if (starsTransaction != null && starsTransaction.id != null && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment) && (starsAmount = starsTransaction.amount) != null && starsAmount.amount < 0 && starsTransaction.date >= y15Var.d - 120 && !z15.e(i).contains(starsTransaction.id)) {
                                }
                            } else {
                                starsTransaction = null;
                            }
                        }
                        if (starsTransaction != null) {
                            if (y15Var.g == null) {
                                String str2 = starsTransaction.id;
                                y15Var.g = str2;
                                HashSet e2 = z15.e(i);
                                if (e2.add(str2)) {
                                    if (e2.size() > 100) {
                                        Iterator it = e2.iterator();
                                        while (e2.size() > 100 && it.hasNext()) {
                                            if (!((String) it.next()).equals(str2)) {
                                                it.remove();
                                            }
                                        }
                                    }
                                    uc7.s1(i).Y3.edit().putStringSet("gram_earnings_wallet_withdraws", new HashSet(e2)).apply();
                                }
                            }
                            jxa v = jxa.v(i, true);
                            int[] iArr = {0, 2};
                            for (int i3 = 0; i3 < 2; i3++) {
                                ArrayList arrayList2 = v.q[iArr[i3]];
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= arrayList2.size()) {
                                        arrayList2.add(0, starsTransaction);
                                    } else if (starsTransaction.id.equals(((TL_stars.StarsTransaction) arrayList2.get(i4)).id)) {
                                        arrayList2.set(i4, starsTransaction);
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            jn7.f(i).k(jn7.B3, new Object[0]);
                            if (!starsTransaction.pending) {
                                y15Var.h = true;
                                jxa.v(i, true).L();
                                kt0.g(i).j(yac.h(i).e(), true);
                                c.C(i).J();
                                e eVar = (e) y15Var.f.get();
                                if (eVar != null && eVar.getParentActivity() != null && LaunchActivity.Q() == eVar) {
                                    long j = y15Var.c;
                                    d31 b0 = d31.b0(eVar);
                                    String a0 = ob6.a0(null, null, 2131749271, c.w(j, false));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131749270, null));
                                    z15.f(spannableStringBuilder, "⚙", R.drawable.msg_settings, -1);
                                    z15.f(spannableStringBuilder, "💎", R.drawable.mini_gram_16, aob.v6);
                                    v21 L = b0.L(R.raw.contact_check, a0, spannableStringBuilder, ob6.M0(2131747544, null), new yv1(eVar, b3));
                                    L.j = 5000;
                                    L.j();
                                    break;
                                }
                            }
                        }
                    }
                    hl.d3(new u15(y15Var, b4), 4000L);
                    break;
                }
                break;
            case 14:
                c cVar = (c) obj2;
                c.P("enable backup: ready! getting secret phrase...");
                cVar.E(false, true, false, new qe2((Object) cVar, obj, (byte) 17));
                break;
            case 15:
                uc7.s1(((c) obj2).a).Y3((TLRPC.Updates) obj, false);
                break;
            case 16:
                c cVar2 = (c) obj2;
                p pVar = (p) obj;
                c.P("emulate disable backup: ready");
                if (cVar2.z() <= 0) {
                    pVar.a(500000L, null);
                    break;
                } else {
                    WalletEngine2 walletEngine2 = cVar2.b;
                    if (walletEngine2 == null) {
                        c.m("emulate disable backup: no engine!");
                        pVar.a(null, "NULL_ENGINE");
                        break;
                    } else {
                        walletEngine2.emulateRotateKey(new yt4(cVar2, pVar));
                        break;
                    }
                }
            case 17:
                boolean[] zArr = (boolean[]) obj2;
                d25 d25Var = (d25) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d25Var.run();
                    break;
                }
                break;
            case 18:
                uc7.s1(((a55) obj2).a).Y3((TLRPC.Updates) obj, false);
                break;
            case 19:
                n55 n55Var = (n55) obj2;
                tk7 tk7Var = (tk7) obj;
                if (!n55Var.e) {
                    tk7Var.d0 = true;
                    Runnable runnable = n55Var.g;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 20:
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = ((j95) obj2).R3;
                for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                    if (((ka5) arrayList4.get(i5)).x != null) {
                        arrayList3.remove(((ka5) arrayList4.get(i5)).x);
                    }
                }
                for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                    wc2 wc2Var = (wc2) arrayList3.get(i6);
                    if (wc2Var.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, wc2Var.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(wc2Var.a, wc2Var.b);
                    }
                }
                break;
            case 21:
                j95 j95Var = (j95) obj2;
                jn7.f(j95Var.n1.a).k(76, 6, ((TLRPC.TL_error) obj).text);
                j95Var.dismiss();
                break;
            case 22:
                ((GroupCallMessagesController) obj2).lambda$sendCallMessage$5((String) obj);
                break;
            case 23:
                ka5 ka5Var = (ka5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap hashMap = ka5Var.G.h;
                wc2 wc2Var2 = ka5Var.x;
                boolean z = wc2Var2.b;
                TLRPC.GroupCallParticipant groupCallParticipant = wc2Var2.a;
                hashMap.put(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap);
                break;
            case 24:
                ka5 ka5Var2 = (ka5) obj;
                ((mb5) obj2).getClass();
                ka5Var2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new ia5(ka5Var2, b2)).setDuration(150L).start();
                break;
            case 25:
                ((nd5) obj2).f0((TLRPC.TL_error) obj);
                break;
            case 26:
                TLObject tLObject2 = (TLObject) obj;
                nd5 nd5Var = ((jd5) obj2).a.h;
                if (tLObject2 != null) {
                    nd5Var.h0((TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    nd5Var.h0(null);
                    break;
                }
            case 27:
                jd5 jd5Var = (jd5) obj2;
                String str3 = (String) obj;
                kd5 kd5Var = jd5Var.a;
                kd5Var.e = str3;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str3;
                kd5Var.c = kd5Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new mw3(jd5Var, str3, (byte) 10), 66);
                break;
            case 28:
                md5 md5Var = (md5) obj2;
                String str4 = (String) obj;
                md5Var.h = str4;
                nd5 nd5Var2 = md5Var.r;
                if (nd5Var2.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str4;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str4;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                md5Var.n = nd5Var2.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new m65(md5Var, str4, str4, b4), 66);
                break;
            default:
                ng5 ng5Var = (ng5) ((cm0) obj2).c;
                ArrayList arrayList5 = ng5Var.h;
                arrayList5.clear();
                arrayList5.addAll((ArrayList) obj);
                ng5Var.n = false;
                wa waVar = ng5Var.a;
                if (waVar != null) {
                    waVar.g3.O(true);
                    break;
                }
                break;
        }
    }
}
