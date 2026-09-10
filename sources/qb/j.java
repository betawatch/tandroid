package qb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import m.g3;
import t7.u;
import w7.h7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class j {
    public static final k6.c[] a = new k6.c[0];
    public static final k6.c b;
    public static final k6.c c;
    public static final t7.l d;

    static {
        k6.c cVar = new k6.c("vision.barcode", 1L);
        k6.c cVar2 = new k6.c("vision.custom.ica", 1L);
        k6.c cVar3 = new k6.c("vision.face", 1L);
        k6.c cVar4 = new k6.c("vision.ica", 1L);
        k6.c cVar5 = new k6.c("vision.ocr", 1L);
        k6.c cVar6 = new k6.c("mlkit.langid", 1L);
        b = cVar6;
        k6.c cVar7 = new k6.c("mlkit.nlclassifier", 1L);
        k6.c cVar8 = new k6.c("tflite_dynamite", 1L);
        k6.c cVar9 = new k6.c("mlkit.barcode.ui", 1L);
        k6.c cVar10 = new k6.c("mlkit.smartreply", 1L);
        c = new k6.c("mlkit.segmentation.subject", 1L);
        a5.a aVar = new a5.a(19, (byte) 0);
        aVar.y("barcode", cVar);
        aVar.y("custom_ica", cVar2);
        aVar.y("face", cVar3);
        aVar.y("ica", cVar4);
        aVar.y("ocr", cVar5);
        aVar.y("langid", cVar6);
        aVar.y("nlclassifier", cVar7);
        aVar.y("tflite_dynamite", cVar8);
        aVar.y("barcode_ui", cVar9);
        aVar.y("smart_reply", cVar10);
        t7.e eVar = (t7.e) aVar.d;
        if (eVar != null) {
            throw eVar.a();
        }
        t7.l b10 = t7.l.b(aVar.b, (Object[]) aVar.c, aVar);
        t7.e eVar2 = (t7.e) aVar.d;
        if (eVar2 != null) {
            throw eVar2.a();
        }
        d = b10;
        a5.a aVar2 = new a5.a(19, (byte) 0);
        aVar2.y("com.google.android.gms.vision.barcode", cVar);
        aVar2.y("com.google.android.gms.vision.custom.ica", cVar2);
        aVar2.y("com.google.android.gms.vision.face", cVar3);
        aVar2.y("com.google.android.gms.vision.ica", cVar4);
        aVar2.y("com.google.android.gms.vision.ocr", cVar5);
        aVar2.y("com.google.android.gms.mlkit.langid", cVar6);
        aVar2.y("com.google.android.gms.mlkit.nlclassifier", cVar7);
        aVar2.y("com.google.android.gms.tflite_dynamite", cVar8);
        aVar2.y("com.google.android.gms.mlkit_smartreply", cVar10);
        t7.e eVar3 = (t7.e) aVar2.d;
        if (eVar3 != null) {
            throw eVar3.a();
        }
        t7.l.b(aVar2.b, (Object[]) aVar2.c, aVar2);
        t7.e eVar4 = (t7.e) aVar2.d;
        if (eVar4 != null) {
            throw eVar4.a();
        }
    }

    public static boolean a(Context context, k6.c[] cVarArr) {
        try {
            return ((r6.a) Tasks.await(new s6.g(context, s6.g.k, com.google.android.gms.common.api.b.t, com.google.android.gms.common.api.i.c).f(new r(cVarArr, 1)).addOnFailureListener(new u()))).a;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
            return false;
        }
    }

    public static void b(Context context) {
        t7.b bVar = t7.d.b;
        Object[] objArr = {"ica"};
        h7.a(1, objArr);
        t7.g gVar = new t7.g(1, objArr);
        k6.e.b.getClass();
        if (k6.e.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        int i10 = gVar.d;
        k6.c[] cVarArr = new k6.c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            k6.c cVar = (k6.c) d.get(gVar.get(i11));
            n6.l.h(cVar);
            cVarArr[i11] = cVar;
        }
        c(context, cVarArr);
    }

    public static void c(Context context, k6.c[] cVarArr) {
        Task e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(cVarArr, 0));
        n6.l.a("APIs must not be empty.", !arrayList.isEmpty());
        s6.g gVar = new s6.g(context, s6.g.k, com.google.android.gms.common.api.b.t, com.google.android.gms.common.api.i.c);
        s6.a b10 = s6.a.b(arrayList, true);
        if (b10.a.isEmpty()) {
            e = Tasks.forResult(new r6.c(0, false));
        } else {
            v e7 = w.e();
            e7.d = new k6.c[]{k7.b.c};
            e7.b = true;
            e7.a = 27304;
            e7.c = new g3(gVar, b10);
            e = gVar.e(0, e7.a());
        }
        e.addOnFailureListener(new rb.a(19));
    }
}
