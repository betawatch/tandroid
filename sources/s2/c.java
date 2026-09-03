package s2;

import androidx.biometric.f0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class c extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ f0 e;

    static {
        de.a aVar = new de.a(c.class, "ChunkOffsetBox.java");
        e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        sf.f b10 = de.a.b(e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("[entryCount=");
        t tVar = (t) this;
        yh.x(de.a.b(t.h, tVar, tVar));
        return android.support.v4.media.a.m(tVar.f.length, "]", sb);
    }
}
