// default package

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pkc implements ed, n8c, o8c {
    public final /* synthetic */ hmc a;

    public /* synthetic */ pkc(hmc hmcVar) {
        this.a = hmcVar;
    }

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.b0(c4cVar, view));
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.a0((c4c) obj, (View) obj2);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        hmc hmcVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            hmcVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
