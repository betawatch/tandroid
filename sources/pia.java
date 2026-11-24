// default package

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pia {
    public final qia a;

    public pia(Context context, ShortcutInfo shortcutInfo) {
        n58[] n58VarArr;
        String string;
        qia qiaVar = new qia();
        this.a = qiaVar;
        qiaVar.a = context;
        qiaVar.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        qiaVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        qiaVar.d = shortcutInfo.getActivity();
        qiaVar.e = shortcutInfo.getShortLabel();
        qiaVar.f = shortcutInfo.getLongLabel();
        qiaVar.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        qiaVar.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        td6 td6Var = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            n58VarArr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            n58VarArr = new n58[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z = persistableBundle.getBoolean("isBot");
                boolean z2 = persistableBundle.getBoolean("isImportant");
                n58 n58Var = new n58();
                n58Var.a = string2;
                n58Var.b = null;
                n58Var.c = string3;
                n58Var.d = string4;
                n58Var.e = z;
                n58Var.f = z2;
                n58VarArr[i2] = n58Var;
                i2 = i3;
            }
        }
        qiaVar.i = n58VarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        qia qiaVar2 = this.a;
        if (i4 < 29) {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                td6Var = new td6(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            nte.a(locusId, "locusId cannot be null");
            String id = locusId.getId();
            if (TextUtils.isEmpty(id)) {
                u36.j("id cannot be empty");
                throw null;
            }
            td6Var = new td6(id);
        }
        qiaVar2.k = td6Var;
        this.a.m = shortcutInfo.getRank();
        this.a.n = shortcutInfo.getExtras();
    }

    public final qia a() {
        qia qiaVar = this.a;
        if (TextUtils.isEmpty(qiaVar.e)) {
            u36.j("Shortcut must have a non-empty label");
            return null;
        }
        Intent[] intentArr = qiaVar.c;
        if (intentArr != null && intentArr.length != 0) {
            return qiaVar;
        }
        u36.j("Shortcut must have an intent");
        return null;
    }
}
