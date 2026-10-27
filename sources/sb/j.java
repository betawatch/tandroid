package sb;

import a8.ng;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import s4.o0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class j {
    public static final l6.c[] a = new l6.c[0];
    public static final l6.c b;
    public static final l6.c c;
    public static final u7.l d;

    static {
        l6.c cVar = new l6.c("vision.barcode", 1L);
        l6.c cVar2 = new l6.c("vision.custom.ica", 1L);
        l6.c cVar3 = new l6.c("vision.face", 1L);
        l6.c cVar4 = new l6.c("vision.ica", 1L);
        l6.c cVar5 = new l6.c("vision.ocr", 1L);
        l6.c cVar6 = new l6.c("mlkit.langid", 1L);
        b = cVar6;
        l6.c cVar7 = new l6.c("mlkit.nlclassifier", 1L);
        l6.c cVar8 = new l6.c("tflite_dynamite", 1L);
        l6.c cVar9 = new l6.c("mlkit.barcode.ui", 1L);
        l6.c cVar10 = new l6.c("mlkit.smartreply", 1L);
        c = new l6.c("mlkit.segmentation.subject", 1L);
        ng ngVar = new ng(23, (byte) 0);
        ngVar.D("barcode", cVar);
        ngVar.D("custom_ica", cVar2);
        ngVar.D("face", cVar3);
        ngVar.D("ica", cVar4);
        ngVar.D("ocr", cVar5);
        ngVar.D("langid", cVar6);
        ngVar.D("nlclassifier", cVar7);
        ngVar.D("tflite_dynamite", cVar8);
        ngVar.D("barcode_ui", cVar9);
        ngVar.D("smart_reply", cVar10);
        u7.e eVar = (u7.e) ngVar.d;
        if (eVar != null) {
            throw eVar.a();
        }
        u7.l b10 = u7.l.b(ngVar.b, (Object[]) ngVar.c, ngVar);
        u7.e eVar2 = (u7.e) ngVar.d;
        if (eVar2 != null) {
            throw eVar2.a();
        }
        d = b10;
        ng ngVar2 = new ng(23, (byte) 0);
        ngVar2.D("com.google.android.gms.vision.barcode", cVar);
        ngVar2.D("com.google.android.gms.vision.custom.ica", cVar2);
        ngVar2.D("com.google.android.gms.vision.face", cVar3);
        ngVar2.D("com.google.android.gms.vision.ica", cVar4);
        ngVar2.D("com.google.android.gms.vision.ocr", cVar5);
        ngVar2.D("com.google.android.gms.mlkit.langid", cVar6);
        ngVar2.D("com.google.android.gms.mlkit.nlclassifier", cVar7);
        ngVar2.D("com.google.android.gms.tflite_dynamite", cVar8);
        ngVar2.D("com.google.android.gms.mlkit_smartreply", cVar10);
        u7.e eVar3 = (u7.e) ngVar2.d;
        if (eVar3 != null) {
            throw eVar3.a();
        }
        u7.l.b(ngVar2.b, (Object[]) ngVar2.c, ngVar2);
        u7.e eVar4 = (u7.e) ngVar2.d;
        if (eVar4 != null) {
            throw eVar4.a();
        }
    }

    public static boolean a(Context context, l6.c[] cVarArr) {
        try {
            return ((s6.a) Tasks.await(new t6.h(context, t6.h.k, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c).f(new r(cVarArr, 1)).addOnFailureListener(new tb.a(22)))).a;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
            return false;
        }
    }

    public static void b(Context context) {
        u7.b bVar = u7.d.b;
        Object[] objArr = {"ica"};
        w7.l.a(1, objArr);
        u7.g gVar = new u7.g(1, objArr);
        l6.e.b.getClass();
        if (l6.e.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        int i10 = gVar.d;
        l6.c[] cVarArr = new l6.c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            l6.c cVar = (l6.c) d.get(gVar.get(i11));
            o6.l.h(cVar);
            cVarArr[i11] = cVar;
        }
        c(context, cVarArr);
    }

    public static void c(Context context, l6.c[] cVarArr) {
        Task e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(cVarArr, 0));
        o6.l.a("APIs must not be empty.", !arrayList.isEmpty());
        t6.h hVar = new t6.h(context, t6.h.k, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
        t6.a b10 = t6.a.b(arrayList, true);
        if (b10.a.isEmpty()) {
            e = Tasks.forResult(new s6.c(0, false));
        } else {
            u b11 = v.b();
            b11.d = new l6.c[]{l7.b.c};
            b11.b = true;
            b11.a = 27304;
            o0 o0Var = new o0();
            o0Var.a = b10;
            b11.c = o0Var;
            e = hVar.e(0, b11.a());
        }
        e.addOnFailureListener(new b(22));
    }
}
