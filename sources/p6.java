// default package

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p6 implements Runnable {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((d) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.b);
                    break;
                }
                break;
            case 1:
                wb2 wb2Var = (wb2) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    rc3 rc3Var = (rc3) obj;
                    wb2Var.S(rc3Var.a, rc3Var, this.b);
                }
                arrayList.clear();
                wb2Var.u.remove(arrayList);
                break;
            default:
                try {
                    ((hk7) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((hk7) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            hk7 hk7Var = (hk7) this.d;
                            hk7Var.c.v(new ak7(hk7Var, inputStream, accept));
                        } catch (IOException e) {
                            hk7.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((hk7) this.d).a.isClosed());
                } catch (IOException e2) {
                    this.c = e2;
                    return;
                }
        }
    }

    public p6(hk7 hk7Var) {
        this.a = (byte) 2;
        this.d = hk7Var;
        this.b = false;
    }
}
