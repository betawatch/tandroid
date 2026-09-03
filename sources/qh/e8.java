package qh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class e8 extends View {
    public static final /* synthetic */ int a = 0;

    public static void a(int i10, r6 r6Var) {
        a8 a8Var;
        if (r6Var == null) {
            return;
        }
        try {
            String string = MessagesController.getInstance(i10).getMainSettings().getString("story_privacy2", null);
            if (string == null) {
                a8Var = new a8();
            } else {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                a8Var = b(serializedData);
                serializedData.cleanup();
                if (a8Var.f.isEmpty() && a8Var.b.isEmpty()) {
                    a8Var = new a8();
                } else {
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(a8Var.c);
                    Iterator it = a8Var.d.values().iterator();
                    while (it.hasNext()) {
                        hashSet.addAll((ArrayList) it.next());
                    }
                    if (!hashSet.isEmpty()) {
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                        messagesStorage.getStorageQueue().postRunnable(new gu0(messagesStorage, hashSet, i10, 13));
                    }
                }
            }
        } catch (Exception e6) {
            FileLog.e(e6);
            a8Var = new a8();
        }
        r6Var.E0 = a8Var;
        r6Var.F0.clear();
        r6Var.F0.addAll(r6Var.E0.b);
        if (UserConfig.getInstance(i10).isPremium()) {
            r6Var.I0 = MessagesController.getInstance(i10).getMainSettings().getInt("story_period", 86400);
        } else {
            r6Var.I0 = 86400;
        }
    }

    public static a8 b(SerializedData serializedData) {
        int readInt32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
        }
        int readInt322 = serializedData.readInt32(true);
        ArrayList arrayList = new ArrayList(readInt322);
        for (int i10 = 0; i10 < readInt322; i10++) {
            arrayList.add(TLRPC.InputUser.TLdeserialize(serializedData, serializedData.readInt32(true), true));
        }
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        int readInt323 = serializedData.readInt32(true);
        ArrayList arrayList2 = new ArrayList(readInt323);
        for (int i11 = 0; i11 < readInt323; i11++) {
            arrayList2.add(Long.valueOf(serializedData.readInt64(true)));
        }
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
        }
        int readInt324 = serializedData.readInt32(true);
        HashMap hashMap = new HashMap();
        for (int i12 = 0; i12 < readInt324; i12++) {
            long readInt64 = serializedData.readInt64(true);
            if (serializedData.readInt32(true) != 481674261) {
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (4)");
            }
            int readInt325 = serializedData.readInt32(true);
            ArrayList arrayList3 = new ArrayList(readInt325);
            for (int i13 = 0; i13 < readInt325; i13++) {
                arrayList3.add(Long.valueOf(serializedData.readInt64(true)));
            }
            hashMap.put(Long.valueOf(readInt64), arrayList3);
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList2);
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll((ArrayList) it.next());
        }
        a8 a8Var = new a8(readInt32, arrayList, 0);
        ArrayList arrayList4 = a8Var.c;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        HashMap hashMap2 = a8Var.d;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        return a8Var;
    }

    public static void c(SerializedData serializedData, a8 a8Var) {
        int i10 = a8Var.a;
        HashMap hashMap = a8Var.d;
        ArrayList arrayList = a8Var.c;
        serializedData.writeInt32(i10);
        serializedData.writeInt32(Vector.constructor);
        ArrayList arrayList2 = a8Var.e;
        serializedData.writeInt32(arrayList2.size());
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((TLRPC.InputUser) obj).serializeToStream(serializedData);
        }
        serializedData.writeInt32(Vector.constructor);
        serializedData.writeInt32(arrayList.size());
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            serializedData.writeInt64(((Long) obj2).longValue());
        }
        serializedData.writeInt32(Vector.constructor);
        serializedData.writeInt32(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            serializedData.writeInt64(((Long) entry.getKey()).longValue());
            serializedData.writeInt32(Vector.constructor);
            serializedData.writeInt32(((ArrayList) entry.getValue()).size());
            ArrayList arrayList3 = (ArrayList) entry.getValue();
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                serializedData.writeInt64(((Long) obj3).longValue());
            }
        }
    }
}
