package pb;

import a8.wa;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import c8.ed;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class j {
    public static final n6.c[] a = new n6.c[0];
    public static final n6.c b;
    public static final n6.c c;
    public static final w7.l d;

    static {
        n6.c cVar = new n6.c("vision.barcode", 1L);
        n6.c cVar2 = new n6.c("vision.custom.ica", 1L);
        n6.c cVar3 = new n6.c("vision.face", 1L);
        n6.c cVar4 = new n6.c("vision.ica", 1L);
        n6.c cVar5 = new n6.c("vision.ocr", 1L);
        n6.c cVar6 = new n6.c("mlkit.langid", 1L);
        b = cVar6;
        n6.c cVar7 = new n6.c("mlkit.nlclassifier", 1L);
        n6.c cVar8 = new n6.c("tflite_dynamite", 1L);
        n6.c cVar9 = new n6.c("mlkit.barcode.ui", 1L);
        n6.c cVar10 = new n6.c("mlkit.smartreply", 1L);
        c = new n6.c("mlkit.segmentation.subject", 1L);
        wa waVar = new wa(24, (byte) 0);
        waVar.B("barcode", cVar);
        waVar.B("custom_ica", cVar2);
        waVar.B("face", cVar3);
        waVar.B("ica", cVar4);
        waVar.B("ocr", cVar5);
        waVar.B("langid", cVar6);
        waVar.B("nlclassifier", cVar7);
        waVar.B("tflite_dynamite", cVar8);
        waVar.B("barcode_ui", cVar9);
        waVar.B("smart_reply", cVar10);
        w7.e eVar = (w7.e) waVar.d;
        if (eVar != null) {
            throw eVar.a();
        }
        w7.l c10 = w7.l.c(waVar.b, (Object[]) waVar.c, waVar);
        w7.e eVar2 = (w7.e) waVar.d;
        if (eVar2 != null) {
            throw eVar2.a();
        }
        d = c10;
        wa waVar2 = new wa(24, (byte) 0);
        waVar2.B("com.google.android.gms.vision.barcode", cVar);
        waVar2.B("com.google.android.gms.vision.custom.ica", cVar2);
        waVar2.B("com.google.android.gms.vision.face", cVar3);
        waVar2.B("com.google.android.gms.vision.ica", cVar4);
        waVar2.B("com.google.android.gms.vision.ocr", cVar5);
        waVar2.B("com.google.android.gms.mlkit.langid", cVar6);
        waVar2.B("com.google.android.gms.mlkit.nlclassifier", cVar7);
        waVar2.B("com.google.android.gms.tflite_dynamite", cVar8);
        waVar2.B("com.google.android.gms.mlkit_smartreply", cVar10);
        w7.e eVar3 = (w7.e) waVar2.d;
        if (eVar3 != null) {
            throw eVar3.a();
        }
        w7.l.c(waVar2.b, (Object[]) waVar2.c, waVar2);
        w7.e eVar4 = (w7.e) waVar2.d;
        if (eVar4 != null) {
            throw eVar4.a();
        }
    }

    public static boolean a(Context context, n6.c[] cVarArr) {
        try {
            return ((u6.a) Tasks.await(new v6.f(context, v6.f.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c).f(new r(cVarArr, 1)).addOnFailureListener(new sa.d(20)))).a;
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void b(Context context) {
        w7.b bVar = w7.d.b;
        Object[] objArr = {"ica"};
        ed.a(1, objArr);
        w7.g gVar = new w7.g(1, objArr);
        n6.e.b.getClass();
        if (n6.e.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        int i7 = gVar.d;
        n6.c[] cVarArr = new n6.c[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            n6.c cVar = (n6.c) d.get(gVar.get(i10));
            q6.m.g(cVar);
            cVarArr[i10] = cVar;
        }
        c(context, cVarArr);
    }

    public static void c(Context context, n6.c[] cVarArr) {
        Task e10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(cVarArr, 0));
        q6.m.a("APIs must not be empty.", !arrayList.isEmpty());
        v6.f fVar = new v6.f(context, v6.f.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
        v6.a b10 = v6.a.b(arrayList, true);
        if (b10.a.isEmpty()) {
            e10 = Tasks.forResult(new u6.c(0, false));
        } else {
            com.google.android.gms.common.api.internal.s b11 = t.b();
            b11.d = new n6.c[]{n7.b.d};
            b11.b = true;
            b11.a = 27304;
            b11.c = new v6.e(fVar, b10);
            e10 = fVar.e(0, b11.a());
        }
        e10.addOnFailureListener(new qb.a(20));
    }
}
