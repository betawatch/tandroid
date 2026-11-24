// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class q94 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q94(ba4 ba4Var, boolean z, String str, long j, long j2, Float f) {
        this.e = ba4Var;
        this.c = z;
        this.f = str;
        this.b = j;
        this.d = j2;
        this.h = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ba4 ba4Var = (ba4) this.e;
                boolean z = this.c;
                String str = (String) this.f;
                long j = this.b;
                long j2 = this.d;
                Float f = (Float) this.h;
                qb4 qb4Var = z ? (qb4) ba4Var.n.get(str) : (qb4) ba4Var.h.get(str);
                if (qb4Var != null) {
                    Utilities.d.c(new n30((Object) qb4Var, (Object) f, j2, j, (byte) 3));
                    break;
                } else if (j2 != 0) {
                    ba4Var.y.put(str, Long.valueOf(j2));
                    break;
                }
                break;
            default:
                g2b g2bVar = (g2b) this.e;
                long j3 = this.b;
                boolean z2 = this.c;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                long j4 = this.d;
                TLObject tLObject = (TLObject) this.h;
                g2bVar.D.remove(Long.valueOf(j3));
                if (!z2) {
                    peerStories = g2bVar.x(j4);
                }
                if (peerStories != null) {
                    byte b = 0;
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                            for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                                if (peerStories.stories.get(i2).id == tL_stories_stories.stories.get(i).id) {
                                    peerStories.stories.set(i2, tL_stories_stories.stories.get(i));
                                    g2bVar.Y(j4, tL_stories_stories.stories.get(i));
                                }
                            }
                        }
                        if (!z2) {
                            s2b s2bVar = g2bVar.k;
                            s2bVar.b.a.c(new r2b(s2bVar, peerStories, b));
                        }
                    }
                    kk7.f(g2bVar.a).k(kk7.x5, new Object[0]);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q94(g2b g2bVar, long j, boolean z, TL_stories.PeerStories peerStories, long j2, TLObject tLObject) {
        this.e = g2bVar;
        this.b = j;
        this.c = z;
        this.f = peerStories;
        this.d = j2;
        this.h = tLObject;
    }
}
