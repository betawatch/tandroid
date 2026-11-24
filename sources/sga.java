// default package

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sga implements Callable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sga(fe7 fe7Var, go5 go5Var) {
        this.b = fe7Var;
        this.c = go5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (uga) ((ShortcutInfoCompatSaverImpl) obj).b.get((String) obj2);
            default:
                int i = jze.a;
                i2f.O3();
                int i2 = e2f.a;
                i2f.O3();
                int i3 = jze.a;
                return ((fe7) obj2).b.e((go5) obj);
        }
    }

    public sga(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.c = shortcutInfoCompatSaverImpl;
        this.b = str;
    }
}
