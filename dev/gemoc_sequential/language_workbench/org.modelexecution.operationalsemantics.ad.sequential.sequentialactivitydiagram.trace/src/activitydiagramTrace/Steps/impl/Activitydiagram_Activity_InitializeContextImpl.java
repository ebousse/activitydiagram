/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagram.Activity;

import activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext;
import activitydiagramTrace.Steps.StepsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Activity Initialize Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Activitydiagram_Activity_InitializeContextImpl extends SmallStepImpl implements Activitydiagram_Activity_InitializeContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_Activity_InitializeContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getCaller() {
		return (Activity) this.getMse().getCaller();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Activitydiagram_Activity_InitializeContextImpl
