// default package

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class s91 implements dx5, Serializable {
    public static final Object NO_RECEIVER = r91.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient dx5 reflected;
    private final String signature;

    public s91(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // dx5
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // dx5
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public dx5 compute() {
        dx5 dx5Var = this.reflected;
        if (dx5Var != null) {
            return dx5Var;
        }
        dx5 computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public dx5 computeReflected() {
        s89.a.getClass();
        return this;
    }

    @Override // cx5
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public ex5 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return s89.a(cls);
        }
        s89.a.getClass();
        return new pu7(cls);
    }

    @Override // dx5
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract dx5 getReflected();

    @Override // dx5
    public ix5 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // dx5
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // dx5
    public jx5 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // dx5
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // dx5
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // dx5
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
