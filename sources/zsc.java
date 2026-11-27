// default package

import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zsc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zsc(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                atc atcVar = (atc) obj;
                ArrayList arrayList = atcVar.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) atcVar.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i2 = 0; i < arrayList.size() && i2 < split.length; i2++) {
                            ((zuc) arrayList.get(i)).setText(split[i2]);
                            i++;
                        }
                        atcVar.c0();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                muc mucVar = (muc) obj;
                if (!mucVar.r && i == mucVar.K) {
                    mucVar.M = false;
                    mucVar.a.g3.O(true);
                    break;
                }
                break;
            case 2:
                hyc hycVar = (hyc) obj;
                kfc kfcVar = hycVar.a;
                if (i == -1) {
                    if (kfcVar.c0()) {
                        kfcVar.f0();
                        hycVar.n();
                    }
                    hycVar.K = false;
                    break;
                } else if (i == 1) {
                    if (hycVar.L) {
                        hycVar.L = false;
                        kfcVar.g0();
                        break;
                    }
                } else if (i != -3 && i == -2 && kfcVar.c0()) {
                    hycVar.L = true;
                    kfcVar.f0();
                    hycVar.n();
                    break;
                }
                break;
            default:
                try {
                    ((z) obj).h(i);
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
