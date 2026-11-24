// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sna implements k8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;

    public /* synthetic */ sna(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    @Override // k8c
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                this.b.u2((View) obj2, (CharSequence) obj, booleanValue);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                i8c i8cVar = (i8c) obj2;
                Runnable runnable = (Runnable) obj3;
                vqa vqaVar = this.b;
                x99 x99Var = vqaVar.R2;
                if (x99Var != null) {
                    x99Var.b();
                    vqaVar.R2 = null;
                }
                TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
                int size = arrayList.size();
                byte b = 0;
                int i = 0;
                while (i < size) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj4).slug;
                    craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
                }
                ConnectionsManager.getInstance(vqaVar.a).sendRequestTyped(craftstargift, new hc(b), new eu0((Object) vqaVar, (Object) i8cVar, (Object) arrayList, (Object) runnable, (byte) 14));
                break;
        }
    }
}
