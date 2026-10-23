package yh;

import ai.y9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        int i11 = 0;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                f4.U((f4) obj3, (ArrayList) obj);
                break;
            case 1:
                k4 k4Var = (k4) obj3;
                ArrayList arrayList = (ArrayList) obj;
                y9 y9Var = k4Var.Y;
                if (y9Var != null) {
                    ArrayList arrayList2 = y9Var.l;
                    arrayList.add(h61.C(AndroidUtilities.dp(16.0f)));
                    if (y9Var.i && arrayList2.isEmpty()) {
                        h61 o10 = h61.o(1, 34);
                        o10.u = 1;
                        arrayList.add(o10);
                        h61 o11 = h61.o(2, 34);
                        o11.u = 1;
                        arrayList.add(o11);
                        h61 o12 = h61.o(3, 34);
                        o12.u = 1;
                        arrayList.add(o12);
                        h61 o13 = h61.o(4, 34);
                        o13.u = 1;
                        arrayList.add(o13);
                        h61 o14 = h61.o(5, 34);
                        o14.u = 1;
                        arrayList.add(o14);
                        h61 o15 = h61.o(6, 34);
                        o15.u = 1;
                        arrayList.add(o15);
                        h61 o16 = h61.o(7, 34);
                        o16.u = 1;
                        arrayList.add(o16);
                        h61 o17 = h61.o(8, 34);
                        o17.u = 1;
                        arrayList.add(o17);
                        h61 o18 = h61.o(9, 34);
                        o18.u = 1;
                        arrayList.add(o18);
                    } else {
                        int size = arrayList2.size();
                        int i12 = 0;
                        int i13 = 3;
                        while (i12 < size) {
                            Object obj4 = arrayList2.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            if (!savedStarGift.collection_id.contains(Integer.valueOf(k4Var.X))) {
                                int i14 = f1.a;
                                h61 J = h61.J(f1.class);
                                J.u = 1;
                                J.z = 0;
                                J.G = savedStarGift;
                                J.q = true;
                                J.f = true;
                                J.r = false;
                                HashSet hashSet = k4Var.Z;
                                int i15 = savedStarGift.msg_id;
                                J.K(hashSet.contains(Long.valueOf(i15 == 0 ? savedStarGift.saved_id : i15)));
                                J.u = 1;
                                arrayList.add(J);
                                i13--;
                                if (i13 == 0) {
                                    i13 = 3;
                                }
                            }
                        }
                        if (y9Var.i || !y9Var.j) {
                            while (true) {
                                if (i11 < (i13 <= 0 ? 3 : i13)) {
                                    i11++;
                                    h61 o19 = h61.o(i11, 34);
                                    o19.u = 1;
                                    arrayList.add(o19);
                                }
                            }
                        }
                    }
                    arrayList.add(h61.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            default:
                zh.d dVar = (zh.d) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList3 = dVar.e;
                dVar.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar.b.serializeToStream(serializedData);
                        MessagesController.getMainSettings(dVar.a).edit().putString("qrBackdrops", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                dVar.d = shareThemeBackdrops != null;
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList3.clear();
                int size2 = arrayList4.size();
                while (i11 < size2) {
                    Object obj5 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj5).run();
                }
                break;
        }
    }
}
