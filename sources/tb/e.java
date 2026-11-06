package tb;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import pb.i;
import q6.m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e extends i {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final sb.a f;
    public final boolean g;

    public e(Context context, sb.a aVar) {
        this.e = context;
        this.f = aVar;
        aVar.getClass();
        this.g = true;
    }

    @Override // pb.i
    public final void b() {
        m.j(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        if (this.d == null) {
            this.f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override // pb.i
    public final void c() {
        m.j(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        if (thickLanguageIdentifier != null) {
            thickLanguageIdentifier.c();
            this.d = null;
        }
    }

    public final String e(String str) {
        String str2;
        if (this.d == null) {
            b();
        }
        if (str.isEmpty()) {
            return "und";
        }
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        m.g(thickLanguageIdentifier);
        ArrayList a10 = thickLanguageIdentifier.a(str);
        int size = a10.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                str2 = "";
                break;
            }
            Object obj = a10.get(i7);
            i7++;
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
            if (!"unknown".equals(identifiedLanguage.a)) {
                str2 = identifiedLanguage.a;
                break;
            }
        }
        return str2.isEmpty() ? "und" : "iw".equals(str2) ? "he" : str2;
    }
}
