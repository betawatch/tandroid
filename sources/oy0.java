// default package

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class oy0 implements InvocationHandler {
    public final FeatureFlagHolderBoundaryInterface a;

    public oy0(FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface) {
        this.a = featureFlagHolderBoundaryInterface;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface = this.a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, featureFlagHolderBoundaryInterface.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(featureFlagHolderBoundaryInterface, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            vr9.k("Reflection failed for method ", method, e2);
            return null;
        }
    }
}
