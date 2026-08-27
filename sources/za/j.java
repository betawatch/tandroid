package za;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e7.v;
import g7.r6;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class j {
    public static final v5.c[] a = new v5.c[0];
    public static final v5.c b;
    public static final v5.c c;
    public static final e7.l d;

    static {
        v5.c cVar = new v5.c("vision.barcode", 1L);
        v5.c cVar2 = new v5.c("vision.custom.ica", 1L);
        v5.c cVar3 = new v5.c("vision.face", 1L);
        v5.c cVar4 = new v5.c("vision.ica", 1L);
        v5.c cVar5 = new v5.c("vision.ocr", 1L);
        v5.c cVar6 = new v5.c("mlkit.langid", 1L);
        b = cVar6;
        v5.c cVar7 = new v5.c("mlkit.nlclassifier", 1L);
        v5.c cVar8 = new v5.c("tflite_dynamite", 1L);
        v5.c cVar9 = new v5.c("mlkit.barcode.ui", 1L);
        v5.c cVar10 = new v5.c("mlkit.smartreply", 1L);
        c = new v5.c("mlkit.segmentation.subject", 1L);
        b6.a aVar = new b6.a(5, (byte) 0);
        aVar.n("barcode", cVar);
        aVar.n("custom_ica", cVar2);
        aVar.n("face", cVar3);
        aVar.n("ica", cVar4);
        aVar.n("ocr", cVar5);
        aVar.n("langid", cVar6);
        aVar.n("nlclassifier", cVar7);
        aVar.n("tflite_dynamite", cVar8);
        aVar.n("barcode_ui", cVar9);
        aVar.n("smart_reply", cVar10);
        e7.e eVar = (e7.e) aVar.d;
        if (eVar != null) {
            throw eVar.a();
        }
        e7.l b10 = e7.l.b(aVar.c, (Object[]) aVar.b, aVar);
        e7.e eVar2 = (e7.e) aVar.d;
        if (eVar2 != null) {
            throw eVar2.a();
        }
        d = b10;
        b6.a aVar2 = new b6.a(5, (byte) 0);
        aVar2.n("com.google.android.gms.vision.barcode", cVar);
        aVar2.n("com.google.android.gms.vision.custom.ica", cVar2);
        aVar2.n("com.google.android.gms.vision.face", cVar3);
        aVar2.n("com.google.android.gms.vision.ica", cVar4);
        aVar2.n("com.google.android.gms.vision.ocr", cVar5);
        aVar2.n("com.google.android.gms.mlkit.langid", cVar6);
        aVar2.n("com.google.android.gms.mlkit.nlclassifier", cVar7);
        aVar2.n("com.google.android.gms.tflite_dynamite", cVar8);
        aVar2.n("com.google.android.gms.mlkit_smartreply", cVar10);
        e7.e eVar3 = (e7.e) aVar2.d;
        if (eVar3 != null) {
            throw eVar3.a();
        }
        e7.l.b(aVar2.c, (Object[]) aVar2.b, aVar2);
        e7.e eVar4 = (e7.e) aVar2.d;
        if (eVar4 != null) {
            throw eVar4.a();
        }
    }

    public static boolean a(Context context, v5.c[] cVarArr) {
        try {
            return ((c6.a) Tasks.await(new d6.g(context, d6.g.k, com.google.android.gms.common.api.b.g, com.google.android.gms.common.api.i.c).f(new r(cVarArr, 1)).addOnFailureListener(new v(27)))).a;
        } catch (InterruptedException | ExecutionException e9) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e9);
            return false;
        }
    }

    public static void b(Context context) {
        e7.b bVar = e7.d.b;
        Object[] objArr = {"ica"};
        r6.a(1, objArr);
        e7.g gVar = new e7.g(1, objArr);
        v5.e.b.getClass();
        if (v5.e.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        int i10 = gVar.d;
        v5.c[] cVarArr = new v5.c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            v5.c cVar = (v5.c) d.get(gVar.get(i11));
            y5.l.h(cVar);
            cVarArr[i11] = cVar;
        }
        c(context, cVarArr);
    }

    public static void c(Context context, v5.c[] cVarArr) {
        Task e9;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(cVarArr, 0));
        y5.l.a("APIs must not be empty.", !arrayList.isEmpty());
        d6.g gVar = new d6.g(context, d6.g.k, com.google.android.gms.common.api.b.g, com.google.android.gms.common.api.i.c);
        d6.a b10 = d6.a.b(arrayList, true);
        if (b10.a.isEmpty()) {
            e9 = Tasks.forResult(new c6.c(0, false));
        } else {
            com.google.android.gms.common.api.internal.v b11 = w.b();
            b11.d = new v5.c[]{v6.b.c};
            b11.b = true;
            b11.a = 27304;
            b11.c = new k5.i(gVar, b10);
            e9 = gVar.e(0, b11.b());
        }
        e9.addOnFailureListener(new ab.a(27));
    }
}
