// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class wt2 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wt2(cu2 cu2Var, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        this.c = cu2Var;
        this.d = fileLocation;
        this.f = inputFile;
        this.h = tLObject;
        this.e = fileLocation2;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((cu2) obj5).f0((TLRPC.FileLocation) obj4, (TLRPC.InputFile) obj2, (TLObject) obj, (TLRPC.FileLocation) obj3, this.b);
                break;
            default:
                ls6 ls6Var = (ls6) obj5;
                boolean[] zArr = (boolean[]) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                Context context = (Context) obj2;
                e eVar = (e) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    for (int i = 0; i < arrayList.size(); i++) {
                        ls6Var.j2(context, 0, eVar, null, true, (TLObject) arrayList.get(i), ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).set, null, this.b, false);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wt2(ls6 ls6Var, boolean[] zArr, ArrayList arrayList, Context context, e eVar, int i) {
        this.c = ls6Var;
        this.d = zArr;
        this.e = arrayList;
        this.f = context;
        this.h = eVar;
        this.b = i;
    }
}
