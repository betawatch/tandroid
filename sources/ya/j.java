package ya;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d7.u;
import f7.q6;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j {
    public static final u5.c[] a = new u5.c[0];
    public static final u5.c b;
    public static final u5.c c;
    public static final d7.l d;

    static {
        u5.c cVar = new u5.c("vision.barcode", 1L);
        u5.c cVar2 = new u5.c("vision.custom.ica", 1L);
        u5.c cVar3 = new u5.c("vision.face", 1L);
        u5.c cVar4 = new u5.c("vision.ica", 1L);
        u5.c cVar5 = new u5.c("vision.ocr", 1L);
        u5.c cVar6 = new u5.c("mlkit.langid", 1L);
        b = cVar6;
        u5.c cVar7 = new u5.c("mlkit.nlclassifier", 1L);
        u5.c cVar8 = new u5.c("tflite_dynamite", 1L);
        u5.c cVar9 = new u5.c("mlkit.barcode.ui", 1L);
        u5.c cVar10 = new u5.c("mlkit.smartreply", 1L);
        c = new u5.c("mlkit.segmentation.subject", 1L);
        a6.a aVar = new a6.a(5, (byte) 0);
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
        d7.e eVar = (d7.e) aVar.d;
        if (eVar != null) {
            throw eVar.a();
        }
        d7.l b10 = d7.l.b(aVar.c, (Object[]) aVar.b, aVar);
        d7.e eVar2 = (d7.e) aVar.d;
        if (eVar2 != null) {
            throw eVar2.a();
        }
        d = b10;
        a6.a aVar2 = new a6.a(5, (byte) 0);
        aVar2.n("com.google.android.gms.vision.barcode", cVar);
        aVar2.n("com.google.android.gms.vision.custom.ica", cVar2);
        aVar2.n("com.google.android.gms.vision.face", cVar3);
        aVar2.n("com.google.android.gms.vision.ica", cVar4);
        aVar2.n("com.google.android.gms.vision.ocr", cVar5);
        aVar2.n("com.google.android.gms.mlkit.langid", cVar6);
        aVar2.n("com.google.android.gms.mlkit.nlclassifier", cVar7);
        aVar2.n("com.google.android.gms.tflite_dynamite", cVar8);
        aVar2.n("com.google.android.gms.mlkit_smartreply", cVar10);
        d7.e eVar3 = (d7.e) aVar2.d;
        if (eVar3 != null) {
            throw eVar3.a();
        }
        d7.l.b(aVar2.c, (Object[]) aVar2.b, aVar2);
        d7.e eVar4 = (d7.e) aVar2.d;
        if (eVar4 != null) {
            throw eVar4.a();
        }
    }

    public static boolean a(Context context, u5.c[] cVarArr) {
        try {
            return ((b6.a) Tasks.await(new c6.g(context, c6.g.k, com.google.android.gms.common.api.b.g, com.google.android.gms.common.api.i.c).f(new r(cVarArr, 1)).addOnFailureListener(new u(27)))).a;
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void b(Context context) {
        d7.b bVar = d7.d.b;
        Object[] objArr = {"ica"};
        q6.a(1, objArr);
        d7.g gVar = new d7.g(1, objArr);
        u5.e.b.getClass();
        if (u5.e.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        int i9 = gVar.d;
        u5.c[] cVarArr = new u5.c[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            u5.c cVar = (u5.c) d.get(gVar.get(i10));
            x5.l.h(cVar);
            cVarArr[i10] = cVar;
        }
        c(context, cVarArr);
    }

    public static void c(Context context, u5.c[] cVarArr) {
        Task e10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(cVarArr, 0));
        x5.l.a("APIs must not be empty.", !arrayList.isEmpty());
        c6.g gVar = new c6.g(context, c6.g.k, com.google.android.gms.common.api.b.g, com.google.android.gms.common.api.i.c);
        c6.a b10 = c6.a.b(arrayList, true);
        if (b10.a.isEmpty()) {
            e10 = Tasks.forResult(new b6.c(0, false));
        } else {
            v b11 = w.b();
            b11.d = new u5.c[]{u6.b.c};
            b11.b = true;
            b11.a = 27304;
            b11.c = new android.support.v4.media.c(gVar, b10);
            e10 = gVar.e(0, b11.b());
        }
        e10.addOnFailureListener(new za.a(26));
    }
}
