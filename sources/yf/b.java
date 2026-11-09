package yf;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import bi.eb;
import bi.i5;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.s;
import yh.l;
import yh.m;
import zh.y0;
import zh.z1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        f2 f2Var;
        boolean z9;
        int i7 = 2;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = dVar.e;
                        if (!dVar.f) {
                            dVar.f(false);
                            dVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            c cVar = (c) obj;
                            if (cVar.b != null && (document = cVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), cVar.b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = dVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList.size());
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TLRPC.Document document3 = arrayList.get(i11);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i11, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i11, str);
                            }
                            c cVar2 = new c();
                            cVar2.a = document3;
                            cVar2.b = str;
                            int i12 = dVar.d;
                            dVar.d = i12 + 1;
                            cVar2.c = i12;
                            arrayList2.add(cVar2);
                        }
                        edit.apply();
                        qs.f(dVar.c).k(qs.e5, new Object[0]);
                        SharedPreferences.Editor edit2 = dVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        d.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        d.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    dVar.b();
                    break;
                }
                break;
            case 1:
                d dVar2 = (d) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    c cVar3 = (c) arrayList3.get(i13);
                    if (cVar3 != null && ((TextUtils.isEmpty(cVar3.b) || !new File(cVar3.b).exists()) && (document2 = cVar3.a) != null)) {
                        w7.G(dVar2.c);
                        File I = w7.I(document2);
                        if (I == null || !I.exists()) {
                            g0.h3(new b(i7, dVar2, document2));
                        }
                    }
                }
                break;
            case 2:
                d dVar3 = (d) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                w7.G(dVar3.c).W(document4, document4, 0, 0);
                break;
            case 3:
                e eVar = (e) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i14 = eVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    qs.e().k(qs.P4, 4, id.a0("TooLongError", null, 2131744041, new Object[0]), id.a0("ErrorRingtoneDurationTooLong", null, 2131751104, Integer.valueOf(qp.s1(i14).k4)));
                    break;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    qs.e().k(qs.P4, 4, id.a0("TooLargeError", null, 2131744042, new Object[0]), id.a0("ErrorRingtoneSizeTooBig", null, 2131751102, Integer.valueOf(qp.s1(i14).l4 / 1024)));
                    break;
                } else {
                    qs.e().k(qs.P4, 4, id.a0("InvalidFormatError", null, 2131749181, new Object[0]), id.M0(2131751103, null));
                    break;
                }
            case 4:
                ((xg.a) this.b).a((TLRPC.Chat) this.c);
                break;
            case 5:
                m mVar = (m) this.b;
                e5 e5Var = (e5) this.c;
                int i15 = mVar.k;
                f2 f2Var2 = mVar.g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                mVar.r = importer;
                LongSparseArray longSparseArray = mVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    f2Var2.getMessagesController().X3(user, false, false);
                    Point point = g0.q;
                    boolean z10 = point.x > point.y;
                    if (user.photo == null) {
                        f2Var = f2Var2;
                        z9 = true;
                    } else if (z10) {
                        z9 = true;
                        f2Var = f2Var2;
                    } else if (mVar.s == null) {
                        l lVar = new l(mVar, f2Var2.getParentActivity(), (qj0) e5Var.getParent(), f2Var2.getResourceProvider(), mVar.a);
                        mVar.s = lVar;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.r;
                        l9 avatarImageView = e5Var.getAvatarImageView();
                        TextView textView = lVar.e;
                        tf0 tf0Var = lVar.h;
                        lVar.r = tL_chatInviteImporter;
                        lVar.w = avatarImageView;
                        TLRPC.User a22 = qp.s1(i15).a2(Long.valueOf(tL_chatInviteImporter.user_id));
                        hc m10 = hc.m(i15, 0, a22);
                        hc m11 = hc.m(i15, 1, a22);
                        if (qp.s1(i15).b2(tL_chatInviteImporter.user_id) == null) {
                            qp.s1(i15).g3(a22, false, 0);
                        }
                        tf0Var.setParentAvatarImage(avatarImageView);
                        tf0Var.M(tL_chatInviteImporter.user_id, true);
                        tf0Var.H(null, m10, m11, true);
                        lVar.d.setText(t10.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                        textView.setText(tL_chatInviteImporter.about);
                        textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                        lVar.D.requestLayout();
                        mVar.s.setOnDismissListener(new eb(mVar, 15));
                        mVar.s.show();
                        break;
                    }
                    mVar.b = z9;
                    f2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    f2Var.presentFragment(profileActivity);
                    break;
                }
                break;
            case 6:
                zh.c cVar4 = (zh.c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                cVar4.getClass();
                onClickListener.onClick(cVar4);
                break;
            case 7:
                ((i5) this.b).k().f0((TLRPC.TL_error) this.c, false);
                break;
            case 8:
                y0 y0Var = (y0) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                y0Var.getClass();
                if (!savedStarGift.unsaved) {
                    y0Var.F.setVisibility(8);
                    break;
                }
                break;
            case 9:
                vp0 vp0Var = (vp0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                vp0Var.h(tL_starGiftCollection.title, new s(17, vp0Var, tL_starGiftCollection));
                break;
            default:
                z1 z1Var = (z1) this.b;
                g0.g((String) this.c);
                org.telegram.ui.Components.hc.a0(z1Var.a.a).k(false).j();
                break;
        }
    }
}
