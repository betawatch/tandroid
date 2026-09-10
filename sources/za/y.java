package za;

import android.content.Context;
import android.content.res.Resources;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class y implements ce.b {
    public final Object a;
    public final Object b;

    public y(Context context) {
        n6.l.h(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        String str2 = (String) this.b;
        Resources resources = (Resources) this.a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // ce.b
    public Object u(ce.c cVar, kd.c cVar2) {
        Object u10 = ((of.b) this.a).u(new k1.p(cVar, (z) this.b), cVar2);
        return u10 == jd.a.a ? u10 : gd.i.a;
    }

    public y(of.b bVar, z zVar) {
        this.a = bVar;
        this.b = zVar;
    }
}
