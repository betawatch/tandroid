// default package

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tr3 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public File g;

    public tr3(int i) {
        this.a = i;
        if (this.e || this.f) {
            return;
        }
        this.f = true;
        pr3 pr3Var = new pr3(this, (byte) 0);
        cf7 Y = cf7.Y(i);
        Y.a.c(new np6((Object) Y, true, (Object) pr3Var, (byte) 18));
    }

    public final void a(sr3 sr3Var) {
        String str;
        StringBuilder sb;
        long j;
        int i = this.a;
        cf7 Y = cf7.Y(i);
        StringBuilder sb2 = new StringBuilder("StoryDraft append ");
        sb2.append(sr3Var.a);
        sb2.append(" (edit=");
        sb2.append(sr3Var.G);
        if (sr3Var.G) {
            StringBuilder sb3 = new StringBuilder(", storyId=");
            sb3.append(sr3Var.H);
            sb3.append(", ");
            if (sr3Var.J != 0) {
                sb = new StringBuilder("documentId=");
                j = sr3Var.J;
            } else {
                sb = new StringBuilder("photoId=");
                j = sr3Var.K;
            }
            sb.append(j);
            sb3.append(sb.toString());
            sb3.append(", expireDate=");
            sb3.append(sr3Var.L);
            str = sb3.toString();
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(", now=");
        sb2.append(System.currentTimeMillis());
        sb2.append(")");
        fc4.b(sb2.toString());
        Y.a.c(new qr3(Y, sr3Var, (byte) 1));
        nm7.f(i).k(nm7.C5, new Object[0]);
    }

    public final void b(g6b g6bVar) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(g6bVar);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        byte b;
        String str;
        StringBuilder sb;
        long j;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (true) {
                b = 1;
                if (i >= arrayList.size()) {
                    break;
                }
                g6b g6bVar = (g6b) arrayList.get(i);
                if (g6bVar != null) {
                    StringBuilder sb2 = new StringBuilder("StoryDraft delete ");
                    sb2.append(g6bVar.b);
                    sb2.append(" (edit=");
                    sb2.append(g6bVar.g);
                    if (g6bVar.g) {
                        StringBuilder sb3 = new StringBuilder(", storyId=");
                        sb3.append(g6bVar.f);
                        sb3.append(", ");
                        if (g6bVar.H != 0) {
                            sb = new StringBuilder("documentId=");
                            j = g6bVar.H;
                        } else {
                            sb = new StringBuilder("photoId=");
                            j = g6bVar.I;
                        }
                        sb.append(j);
                        sb3.append(sb.toString());
                        sb3.append(", expireDate=");
                        sb3.append(g6bVar.J);
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(", now=");
                    sb2.append(System.currentTimeMillis());
                    sb2.append(")");
                    fc4.b(sb2.toString());
                    arrayList2.add(Long.valueOf(g6bVar.b));
                    g6bVar.i(true);
                }
                i++;
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.b.removeAll(arrayList);
            int i2 = this.a;
            cf7 Y = cf7.Y(i2);
            Y.a.c(new p51(Y, arrayList2, b));
            nm7.f(i2).k(nm7.C5, new Object[0]);
        }
    }

    public final void d(g6b g6bVar) {
        if (g6bVar == null) {
            return;
        }
        e(g6bVar);
        ArrayList arrayList = this.b;
        arrayList.remove(g6bVar);
        byte b = 0;
        if (!g6bVar.w) {
            arrayList.add(0, g6bVar);
        }
        sr3 sr3Var = new sr3(g6bVar);
        int i = this.a;
        cf7 Y = cf7.Y(i);
        Y.a.c(new qr3(Y, sr3Var, b));
        nm7.f(i).k(nm7.C5, new Object[0]);
    }

    public final void e(g6b g6bVar) {
        if (g6bVar == null) {
            return;
        }
        if (g6bVar.b == 0) {
            g6bVar.b = Utilities.b.nextLong();
        }
        g6bVar.d = System.currentTimeMillis();
        g6bVar.c = true;
        boolean z = g6bVar.M;
        File file = g6bVar.L;
        if (z) {
            g6bVar.L = f(file);
        } else if (file != null) {
            File w = g6b.w(this.a, g6bVar.K ? "mp4" : "jpg");
            try {
                gm.E(g6bVar.L, w);
                g6bVar.L = f(w);
                g6bVar.M = true;
            } catch (IOException e) {
                fc4.g(e, true);
            }
        }
        g6bVar.Z0 = f(g6bVar.Z0);
        g6bVar.P0 = f(g6bVar.P0);
        g6bVar.O0 = f(g6bVar.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.g == null) {
            File file2 = new File(bc4.z(4), "drafts");
            this.g = file2;
            if (!file2.exists()) {
                this.g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.g.getAbsolutePath())) {
            File file3 = new File(this.g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
