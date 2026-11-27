// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
