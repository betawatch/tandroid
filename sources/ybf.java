// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ybf {
    public Object a;
    public yif b;
    public vkf c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        yif yifVar = this.b;
        if (yifVar != null) {
            khf khfVar = yifVar.b;
            khfVar.getClass();
            if (obj == null) {
                obj = p9f.h;
            }
            if (p9f.f.d(khfVar, null, obj)) {
                p9f.d(khfVar);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        vkf vkfVar;
        yif yifVar = this.b;
        if (yifVar != null) {
            khf khfVar = yifVar.b;
            if (!khfVar.isDone()) {
                if (p9f.f.d(khfVar, null, new pae(new j2("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), (byte) 4)))) {
                    p9f.d(khfVar);
                }
            }
        }
        if (this.d || (vkfVar = this.c) == null) {
            return;
        }
        vkfVar.i(null);
    }
}
